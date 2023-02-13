package ui;

import entity.CustomerEntity;
import service.CustomerService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerUI {
    CustomerService customerService= new CustomerService();
    Scanner sc= new Scanner(System.in);

    public List<List<String>> getCustomerAccountNumbers(){
        System.out.println("Enter customer's unique Id:");
        int customerId= sc.nextInt();
        System.out.print("Account/s tied to customer with id: "+customerId+" are  ");
        return customerService.getAccountNumbers(customerId);
    }

    public Map<String,List<CustomerEntity>> groupCustomersByCity() {
        System.out.println("Grouping customers by city ");
        return customerService.groupCustomersByCity();
    }
}
