package com.example.codeclan.BookingService.controllers;

import com.example.codeclan.BookingService.models.Customer;
import com.example.codeclan.BookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
