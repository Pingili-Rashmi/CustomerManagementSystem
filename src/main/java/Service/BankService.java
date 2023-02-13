package Service;

import Entity.BankEntity;
import Entity.CustomerEntity;
import Repository.BankDetails;

import java.util.List;
import java.util.stream.Collectors;

public class BankService {
    BankDetails bankDetails = new BankDetails();
    List<BankEntity> bankInfo = bankDetails.getBanksList();
    public List<Integer> getCustomersByBankName(String bankName) {
        return bankInfo.stream().filter(entity -> entity.bankName.equalsIgnoreCase(bankName)).
                map(BankEntity::getCustomerUniqueId).
                collect(Collectors.toList());

    }
    public List<String> getFamousBanks(int limit) {
        return bankInfo.stream().map(BankEntity::getBankName).distinct().collect(Collectors.toList());
    }
}
