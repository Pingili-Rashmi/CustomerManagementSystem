package entity;

import javax.persistence.*;

@Entity
@Table(name = "bank")
public class BankEntity {
    @Id
    @Column(name="BANK_ACCOUNT_NO")
    public String bankAccountNumber;
    @Column(name="BANK_NAME")
    public String bankName;
    @Column(name="BANK_CITY")
    public String bankCity;

    public String getBankCity() { return bankCity; }

    public void setBankCity(String bankCity) { this.bankCity = bankCity; }

    public String getBankName() {
        return bankName;
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
    @Override
    public String toString(){
        return bankName+" "+bankAccountNumber;
    }
}
