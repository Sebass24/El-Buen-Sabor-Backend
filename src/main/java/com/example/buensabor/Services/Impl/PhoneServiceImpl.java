package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Phone;
import com.example.buensabor.Repositories.PhoneRepository;
import com.example.buensabor.Services.PhoneService;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl extends BaseServiceImpl<Phone,Long> implements PhoneService {

    private PhoneRepository phoneRepository; // dependencies injection

    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        super(phoneRepository);
        this.phoneRepository = phoneRepository;
    }

}
