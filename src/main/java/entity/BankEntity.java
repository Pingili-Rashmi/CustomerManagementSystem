package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_TABLE")
public class BankEntity {
    @Column(name="BANK_NAME")
    public String bankName;
    @Column(name="BANK_ACCOUNT_NUMBER")
    public String bankAccountNumber;
    @ManyToOne
    public int customerUniqueId;
    @Column(name="BANK_CITY")
    public String bankCity;

    public String getBankCity() { return bankCity; }

    public void setBankCity(String bankCity) { this.bankCity = bankCity; }

    public String getBankName() {
        return bankName;
    }

    public int getCustomerUniqueId() {
        return customerUniqueId;
    }

    public void setCustomerUniqueId(int customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
