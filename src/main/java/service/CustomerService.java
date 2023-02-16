package service;

import dto.BankDto;
import dto.CustomerDto;
import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerDetails;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class CustomerService {
    @Autowired
    CustomerDetails customerDetails;


    public List<CustomerEntity> getCustomers() {
        return customerDetails.getAll();
    }
}
