package controller;

import dto.BankDto;
import dto.CustomerDto;
import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping()
    public List<CustomerEntity> getAllCustomerDetails(){
        return customerService.getCustomers();
    }

}
