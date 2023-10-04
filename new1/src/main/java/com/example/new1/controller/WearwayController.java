package com.example.new1.controller;

import com.example.new1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wearway")
public class WearwayController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/main")
    public String HelloWorld() {return customerRepository.findAll().toString(); }
}
