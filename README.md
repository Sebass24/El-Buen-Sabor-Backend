# Getting Started

### Swagger documentation --> http://localhost:8080/swagger-ui/index.html
### or http://{deploy url}/swagger-ui/index.html

## API Reference Documentation


###Endpoints

A continuación se enumeran todos los endpoints disponibles en la API.

#### GET /{resource}
Devuelve una lista de todos los elementos del recurso especificado.

###### Parámetros

- none

###### Respuesta

- 200 OK en caso de éxito.
- Lista de elementos en formato JSON.

#### GET /{resource}/{id}
Devuelve el elemento con el ID especificado del recurso especificado.

###### Parámetros
- id (obligatorio): ID del elemento a recuperar.

###### Respuesta

- 200 OK en caso de éxito.
- El elemento solicitado en formato JSON.


#### POST /{resource}
Crea un nuevo elemento en el recurso especificado.

###### Parámetros

- none
- en el body de la peticion debemos mandarle el objeto en formato JSON

###### Respuesta
- 201 Created en caso de éxito.
- El elemento recién creado en formato JSON.


#### PUT /{resource}
Actualiza el elemento con el ID especificado en el recurso especificado.

###### Parámetros
- none
- en el body de la peticion debemos mandarle el objeto a modificar en formato JSON


###### Respuesta

- 200 OK en caso de éxito.
- El elemento actualizado en formato JSON.

#### DELETE /{resource}/{id}
Elimina el elemento con el ID especificado del recurso especificado. Aclaramos que el elemento es eliminado de forma lógica.

###### Parámetros

- id (obligatorio): ID del elemento a eliminar.

##### Respuesta

- Mensaje de eliminación corecta.

### Edpoits especificos por entidad:
