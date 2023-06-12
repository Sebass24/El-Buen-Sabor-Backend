package com.example.buensabor.Services.Impl;

import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RoleAssignmentService {

    @Value("${auth0.domain}")
    private String auth0Domain;

    @Value("${auth0.clientId}")
    private String clientId;

    @Value("${auth0.clientSecret}")
    private String clientSecret;

    public void assignRoleToUser(String userId, String roleId) {
        String managementApiUrl = "https://" + auth0Domain + "/api/v2";

        try {
            // Get an access token to authenticate with the Management API
            HttpClient httpClient = HttpClients.createDefault();
            HttpPost tokenRequest = new HttpPost(managementApiUrl + "/oauth/token");
            tokenRequest.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            StringEntity tokenRequestBody = new StringEntity(
                    "{\"grant_type\":\"client_credentials\",\"client_id\":\"" + clientId + "\",\"client_secret\":\"" + clientSecret + "\",\"audience\":\"" + managementApiUrl + "/\"}");
            tokenRequest.setEntity(tokenRequestBody);
            String tokenResponseJson = EntityUtils.toString(httpClient.execute(tokenRequest).getEntity());
            String accessToken = (new JSONObject(tokenResponseJson)).getString("access_token");

            // Assign the role to the user using the Management API
            HttpPost roleAssignmentRequest = new HttpPost(managementApiUrl + "/users/" + userId + "/roles");
            roleAssignmentRequest.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            roleAssignmentRequest.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
            StringEntity roleAssignmentRequestBody = new StringEntity("{\"roles\": [\"" + roleId + "\"]}");
            roleAssignmentRequest.setEntity(roleAssignmentRequestBody);
            httpClient.execute(roleAssignmentRequest);

            System.out.println("Role assigned successfully");
        } catch (Exception e) {
            System.err.println("Error assigning role: " + e.getMessage());
        }
    }
}
