package com.example.buensabor.Services.Impl;
import com.example.buensabor.Models.Entity.Image;
import com.example.buensabor.Repositories.ImageRepository;
import com.example.buensabor.Services.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends BaseServiceImpl<Image,Long> implements ImageService {

    private ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        super(imageRepository);
        this.imageRepository = imageRepository;
    }

}
