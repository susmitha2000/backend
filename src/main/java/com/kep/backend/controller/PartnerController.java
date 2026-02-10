package com.kep.backend.controller;

import com.kep.backend.entity.Partner;
import com.kep.backend.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partners")
@CrossOrigin
public class PartnerController {

    @Autowired
    private PartnerRepository repository;

    @GetMapping
    public List<Partner> getAllPartners() {
        return repository.findAll();
    }

    @PostMapping
    public Partner addPartner(@RequestBody Partner partner) {
        return repository.save(partner);
    }
}
