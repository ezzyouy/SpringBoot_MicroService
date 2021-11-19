package org.banque.microservice.repositories;

import org.banque.microservice.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankRepository extends JpaRepository<Bank, Integer> {
}
