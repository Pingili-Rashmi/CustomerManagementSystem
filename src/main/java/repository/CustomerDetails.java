package repository;

import entity.CustomerEntity;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {
    public static List<CustomerEntity> customersList = new ArrayList<CustomerEntity>();

    public CustomerDetails()
    {
        customersList.add(new CustomerEntity(1, "Sandeep", "Chennai", new ArrayList<String>(){{
            add("BKID002"); }}));
        customersList.add(new CustomerEntity(2, "Roshan", "Delhi",  new ArrayList<String>(){{
            add("BKID008"); }}));
        customersList.add(new CustomerEntity(3, "Maya", "Mumbai",  new ArrayList<String>(){{
            add("HDFC006"); }}));
        customersList.add(new CustomerEntity(4, "Poorna", "Kerala", new ArrayList<String>(){{
            add("ICICI001"); }}));
        customersList.add(new CustomerEntity(5, "Sidharth", "Hyderabad", new ArrayList<String>(){{
            add("SBI009"); }}));
    }

        public List<CustomerEntity> getCustomersList()
        {
            return customersList;
        }
    }
