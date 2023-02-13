package ui;

import service.BankService;

import java.util.List;
import java.util.Scanner;

public class BankUI {
    BankService bankService = new BankService();
    Scanner sc= new Scanner(System.in);

    public List<Integer> getCustomersByBankName() {
        System.out.println("Enter Bank Name:");
        String bankName = sc.nextLine();
        System.out.print("List of customer id's of "+bankName +" are: ");
        return bankService.getCustomersByBankName(bankName);
    }

    public List<String> famousBank() {
        System.out.println("Enter limit:");
        int limit = sc.nextInt();
        return bankService.getFamousBanks(limit);
    }
}
