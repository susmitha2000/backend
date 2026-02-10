package com.kep.backend.service;

import com.kep.backend.entity.Partner;
import com.kep.backend.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository repository;

    public List<Partner> getAllPartners() {
        return repository.findAll();
    }

    public Partner savePartner(Partner partner) {
        return repository.save(partner);
    }
}
