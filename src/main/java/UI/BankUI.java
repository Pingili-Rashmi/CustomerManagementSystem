package UI;

import Entity.CustomerEntity;
import Service.BankService;

import java.util.List;
import java.util.Scanner;

public class BankUI {
    BankService bankService = new BankService();

    Scanner sc= new Scanner(System.in);
    public List<Integer> getCustomersByBankName() {
        System.out.println("Enter Bank Name:");
        String bankName = sc.nextLine();
        return bankService.getCustomersByBankName(bankName);
    }

    public List<String> famousBank() {
        int limit = 100;
        return bankService.getFamousBanks(limit);
    }
}
