package controller;

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
@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/id={customerId}/accountNumbers")
    public ResponseEntity<List<List<String>>> getCustomerAccountNumbers(@PathVariable(name="customerId") int customerId){
        return ResponseEntity.ok().body(customerService.getAccountNumbers(customerId));
    }
    @GetMapping("/groupBy/city")
    public ResponseEntity<Map<String,List<CustomerDto>>> groupCustomersByCity() {
        return ResponseEntity.ok().body(customerService.groupCustomersByCity());
    }

    @PostMapping()
    public ResponseEntity<String> addCustomer(@RequestBody CustomerEntity customerEntity){
        customerService.addCustomer(customerEntity);
        return new ResponseEntity<>("Customer Added Succesfully", HttpStatus.CREATED);
    }
}
