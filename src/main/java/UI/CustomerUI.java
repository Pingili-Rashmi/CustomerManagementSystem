package UI;

import Entity.CustomerEntity;
import Service.CustomerService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerUI {
    CustomerService customerService= new CustomerService();
    Scanner sc= new Scanner(System.in);

    public List<List<String>> getCustomerAccountNumbers(){
        System.out.println("Enter customer's unique Id:");
        int customerId= sc.nextInt();
        return customerService.getAccountNumbers(customerId);
    }

    public Map<String,List<CustomerEntity>> groupCustomersByCity() {
        return customerService.groupCustomersByCity();
    }
}
