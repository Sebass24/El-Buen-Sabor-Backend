package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.Phone;
import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Repositories.AddressRepository;
import com.example.buensabor.Repositories.PhoneRepository;
import com.example.buensabor.Repositories.UserRepository;
import com.example.buensabor.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService {

    private UserRepository userRepository; // dependencies injection
    private AddressRepository addressRepository;
    private PhoneRepository phoneRepository;

    public UserServiceImpl(UserRepository userRepository, AddressRepository addressRepository, PhoneRepository phoneRepository) {
        super(userRepository);
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.phoneRepository = phoneRepository;
    }


    @Override
    public List<Address> getUserAddresses(Long userId) {
        List<Address> userAddresses = addressRepository.getAddresByUser(userId);
        return userAddresses;
    }

    @Override
    public List<Phone> getUserPhones(Long userId) {
        List<Phone> userPhones = phoneRepository.getPhonesByUser(userId);
        return userPhones;
    }
}
