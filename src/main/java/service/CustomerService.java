package service;

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
    List<CustomerEntity> customersInfo = null;//customerDetails.getCustomersList();

    public List<List<String>> getAccountNumbers(int customerId){
        return customersInfo.stream().filter(entity -> entity.customerUniqueId==customerId).
                map(CustomerEntity::getBankAccounts).
                collect(Collectors.toList());

    }


    public Map<String, List<CustomerDto>> groupCustomersByCity() {
        //return customersInfo.stream().collect(Collectors.groupingBy(CustomerDto::getCustomerCity));
        return null;
    }

    public void addCustomer(CustomerEntity customerEntity) {
    }
}
