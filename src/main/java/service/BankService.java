package service;

import dto.BankDto;
import entity.BankEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BankDetails;

import java.util.List;

@Service
public class BankService {
    @Autowired
    BankDetails bankDetails;
    @Autowired
    ModelMapper modelMapper;

    /*public List<Integer> getCustomersByBankName(String bankName) {
        return bankDetails.getCustomersByBankName(bankName);
    }
    public List<String> getFamousBanks(int limit) {
        return bankDetails.getFamousBanks(limit);
    }
*/
    public List<BankEntity> getAllBanks() {
        return bankDetails.getAll();
    }
}
