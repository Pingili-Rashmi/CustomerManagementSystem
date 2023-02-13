package dto;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerDto {
    public int customerUniqueId;
    public String customerName;
    public String customerCity;

    public int getCustomerUniqueId() {
        return customerUniqueId;
    }

    public void setCustomerUniqueId(int customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public List<String> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<String> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<String> bankAccounts;

}
