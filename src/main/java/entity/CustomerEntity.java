package entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "CUSTOMER_TABLE")
public class CustomerEntity {

    @Column(name="CUSTOMER_ID")
    public int customerUniqueId;
    @Column(name="CUSTOMER_NAME")
    public String customerName;
    @Column(name="CUSTOMER_CITY")
    public String customerCity;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public List<String> bankAccounts;

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
}
