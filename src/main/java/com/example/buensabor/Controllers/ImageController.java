package com.example.buensabor.Controllers;

import com.example.buensabor.Models.Entity.Image;
import com.example.buensabor.Services.Impl.ImageServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/image")
public class ImageController extends BaseControllerImpl<Image, ImageServiceImpl>{

    public ImageController(ImageServiceImpl service) {
        super(service);
    }


}
