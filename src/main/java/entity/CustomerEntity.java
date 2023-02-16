package entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @Column(name="CUSTOMER_ID")
    public int customerUniqueId;
    @Column(name="CUSTOMER_NAME")
    public String customerName;
    @Column(name="CUSTOMER_CITY")
    public String customerCity;
    @OneToMany(targetEntity = BankEntity.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="ba_fk",referencedColumnName = "customerUniqueId")
    public List<BankEntity> bankAccounts;

    public List<BankEntity> getBankAccounts() { return bankAccounts; }

    public void setBankAccounts(List<BankEntity> bankAccounts) { this.bankAccounts = bankAccounts; }

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
        return customerUniqueId+" "+customerName;
    }
}
