import UI.BankUI;
import UI.CustomerUI;

import java.util.*;

public class BankProject {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        CustomerUI customerUI = new CustomerUI();
        BankUI bankUI = new BankUI();
        System.out.println("Welcome to Customer Management System :)");
        System.out.println("Enter your choice:\n1.Get all accounts of a customer\n2.Get all customers by bankName\n3.Banks with 100+ customers\n4.Get customers for each city");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(customerUI.getCustomerAccountNumbers());
                break;
            case 2:
                System.out.println(bankUI.getCustomersByBankName());
                break;
            case 3:
                System.out.println(bankUI.famousBank());
                break;
            case 4:
                System.out.println(customerUI.groupCustomersByCity());
        }
    }
}
