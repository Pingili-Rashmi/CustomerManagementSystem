package controller;

import dto.BankDto;
import entity.BankEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BankService;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankService bankService;
    @GetMapping()
    public List<BankEntity> getAllBankDetails(){
        return bankService.getAllBanks();
    }

}
