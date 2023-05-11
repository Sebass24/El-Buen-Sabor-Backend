package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Repositories.UserRepository;
import com.example.buensabor.Services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService {

    private UserRepository userRepository; // dependencies injection

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

//    @Override
//    public int getEdad(Long id) {
//        return 0;
//    }
}
