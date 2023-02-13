package service;

import entity.BankEntity;
import repository.BankDetails;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankService {
    BankDetails bankDetails = new BankDetails();
    public List<Integer> getCustomersByBankName(String bankName) {
        List<BankEntity> bankInfo = bankDetails.getBanksList();
        return bankInfo.stream().filter(entity -> entity.bankName.equalsIgnoreCase(bankName)).
                map(BankEntity::getCustomerUniqueId).
                collect(Collectors.toList());

    }
    public List<String> getFamousBanks(int limit) {
        List<BankEntity> bankInfo = bankDetails.getBanksList();
        Map<String, Long> counters = bankInfo.stream()
                .collect(Collectors.groupingBy(p -> p.getBankName().toString(),
                        Collectors.counting()));
        return counters.keySet().stream().filter(map -> counters.get(map)>=limit).collect(Collectors.toList());
    }
}
