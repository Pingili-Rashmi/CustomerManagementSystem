package entity;

public class BankEntity {

    public String bankName;
    public String bankAccountNumber;
    public int customerUniqueId;
    public String bankCity;

    public BankEntity(String bankName, String bankAccountNumber, int customerUniqueId, String bankCity) {
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
        this.customerUniqueId = customerUniqueId;
        this.bankCity = bankCity;
    }

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
