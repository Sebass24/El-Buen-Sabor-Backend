package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.Phone;
import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Repositories.UserRepository;
import com.example.buensabor.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService {

    private UserRepository userRepository; // dependencies injection

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }


    @Override
    public List<Address> getUserAddresses(Long userId) {
        User user = userRepository.getReferenceById(userId);
        return user.getAddresses();
    }

    @Override
    public List<Phone> getUserPhones(Long userId) {
        User user = userRepository.getReferenceById(userId);
        return user.getPhones();
    }
}
