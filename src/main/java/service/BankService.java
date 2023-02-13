package service;

import entity.BankEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BankDetails;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class BankService {
    @Autowired
    BankDetails bankDetails;

    List<BankEntity> bankInfo = null;//bankDetails.getBanksList();
    public List<Integer> getCustomersByBankName(String bankName) {
        return bankInfo.stream().filter(entity -> entity.bankName.equalsIgnoreCase(bankName)).
                map(BankEntity::getCustomerUniqueId).
                collect(Collectors.toList());

    }
    public List<String> getFamousBanks(int limit) {
        return bankInfo.stream().map(BankEntity::getBankName).distinct().collect(Collectors.toList());
    }
}
