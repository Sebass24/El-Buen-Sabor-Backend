package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Repositories.AddressRepository;
import com.example.buensabor.Repositories.UserRepository;
import com.example.buensabor.Services.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address,Long> implements AddressService {

    private AddressRepository addressRepository; // dependencies injection

    public AddressServiceImpl(AddressRepository addressRepository) {
        super(addressRepository);
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAddressesbyUser(Long id) {
        return addressRepository.getAddressesByUser(id);
    }
}
