package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import entity.CustomerEntity;
import org.springframework.stereotype.Service;


@Service
public class BankDto {
    public String bankName;
    public String bankAccountNumber;
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

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }
    @Override
    public String toString(){
        return bankName+" "+bankAccountNumber;
    }
}
