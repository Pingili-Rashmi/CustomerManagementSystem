package repository;

import dto.BankDto;
import dto.CustomerDto;
import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerDetails extends JpaRepository<CustomerEntity,Integer> {

    @Query("select c from customers c")
    public List<CustomerEntity> getAll();
}
