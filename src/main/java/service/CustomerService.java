package service;

import entity.CustomerEntity;
import repository.CustomerDetails;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService {
    CustomerDetails customerDetails = new CustomerDetails();
    List<CustomerEntity> customersInfo = customerDetails.getCustomersList();

    public List<List<String>> getAccountNumbers(int customerId){
        return customersInfo.stream().filter(entity -> entity.customerUniqueId==customerId).
                map(CustomerEntity::getBankAccounts).
                collect(Collectors.toList());

    }


    public Map<String, List<CustomerEntity>> groupCustomersByCity() {
        return customersInfo.stream().collect(Collectors.groupingBy(CustomerEntity::getCustomerCity));

    }
}
