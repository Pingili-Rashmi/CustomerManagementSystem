package dto;

import org.springframework.stereotype.Service;


@Service
public class BankDto {
    public String bankName;
    public String bankAccountNumber;
    public int customerUniqueId;
    public String bankCity;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getCustomerUniqueId() {
        return customerUniqueId;
    }

    public void setCustomerUniqueId(int customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }
}
