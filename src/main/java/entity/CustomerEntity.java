package entity;

import java.util.List;

public class CustomerEntity {
    public int customerUniqueId;
    public String customerName;
    public String customerCity;
    public List<String> bankAccounts;

    public CustomerEntity(int customerUniqueId, String customerName, String customerCity, List<String> bankAccounts) {
        this.customerUniqueId = customerUniqueId;
        this.customerName = customerName;
        this.customerCity = customerCity;
        this.bankAccounts = bankAccounts;
    }

    public List<String> getBankAccounts() { return bankAccounts; }

    public void setBankAccounts(List<String> bankAccounts) { this.bankAccounts = bankAccounts; }

    public int getCustomerUniqueId() {
        return customerUniqueId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerUniqueId(int customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }
    @Override
    public String toString(){
        return this.customerName+" "+this.customerUniqueId;
    }
}
