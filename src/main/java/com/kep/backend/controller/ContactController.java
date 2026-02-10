package com.kep.backend.controller;

import com.kep.backend.entity.ContactMessage;
import com.kep.backend.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactMessageRepository repository;

    @PostMapping
    public ContactMessage submitMessage(@Valid @RequestBody ContactMessage message) {
        return repository.save(message);
    }

    // 👇 ADD HERE (inside class, below POST method)
    @GetMapping
    public List<ContactMessage> getAllMessages() {
        return repository.findAll();
    }
}
