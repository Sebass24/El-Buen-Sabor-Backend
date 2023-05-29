package com.example.buensabor.Services.Impl;
import com.example.buensabor.Exceptions.ServiceException;
import com.example.buensabor.Models.Entity.Image;
import com.example.buensabor.Repositories.ImageRepository;
import com.example.buensabor.Services.ImageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service
public class ImageServiceImpl extends BaseServiceImpl<Image,Long> implements ImageService {

    private ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        super(imageRepository);
        this.imageRepository = imageRepository;
    }

    @Transactional
    public Image save(MultipartFile img) throws ServiceException {
        try {
            if (img.isEmpty()) {
                throw new ServiceException("Empty image file");
            }

            // Guardar el archivo en el sistema de archivos
            String fileName = UUID.randomUUID().toString() + "-" + img.getOriginalFilename();
            String filePath = new File("").getAbsolutePath() + "/src/main/resources/Imges/" + fileName;
            File dest = new File(filePath);
            img.transferTo(dest);

            Image entity = new Image(fileName,filePath,img);
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

//    @Transactional
//    public Image update(MultipartFile img) throws ServiceException {
//        try {
//            if (entity.getId() == null) {
//                throw new ServiceException("La entidad a modificar debe contener un Id.");
//            }
//            return baseRepository.save(entity);
//        }catch (Exception e) {
//            throw new ServiceException(e.getMessage());
//        }
//    }
}
