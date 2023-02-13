package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BankService;

import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @GetMapping("/{bankName}")
    public ResponseEntity<List<Integer>> customersByBankName(@PathVariable("bankName") String bankName) {
        return ResponseEntity.ok().body(bankService.getCustomersByBankName(bankName));
    }

    @GetMapping("/customer-count>100")
    public ResponseEntity<List<String>> famousBank() {
        int limit = 100;
        return ResponseEntity.ok().body(bankService.getFamousBanks(limit));
    }
}
