package org.banque.microservice;

import org.banque.microservice.entities.Bank;
import org.banque.microservice.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DummyDataRLC implements CommandLineRunner {
    @Autowired
    private BankRepository bankRepository;
    @Override
    public void run(String... args) throws Exception {
        Stream.of("RC_AWD","RC_BMCE","RC_BMCI").forEach(rc->bankRepository.save(new Bank(rc)));
        bankRepository.findAll().forEach(bank->System.out.println(bank.getRc()));
    }
}
