package repository;

import dto.BankDto;
import entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BankDetails extends JpaRepository<BankEntity,String> {
    @Query("select b from bank b")
    List<BankEntity> getAll();
}
