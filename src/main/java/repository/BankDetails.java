package repository;

import entity.BankEntity;

import java.util.ArrayList;
import java.util.List;

public class BankDetails {
    public static List<BankEntity> bankList = new ArrayList<BankEntity>();

    public BankDetails()
    {
        bankList.add(new BankEntity("Bank of India", "BKID002", 1,"Chennai"));
        bankList.add(new BankEntity("HDFC", "HDFC006", 3,"Mumbai"));
        bankList.add(new BankEntity("State Bank of India", "SBI009", 5,"Hyderabad"));
        bankList.add(new BankEntity("Bank of India", "BKID008", 2 ,"Delhi"));
        bankList.add(new BankEntity("ICICI", "ICICI001", 4,"Kerala"));

    }

    public List<BankEntity> getBanksList()
    {
        return bankList;
    }

}
