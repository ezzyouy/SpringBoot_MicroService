package org.banque.microservice.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue
    private int id;

    private  String rc;

    public Bank(String rc) {
        this.rc = rc;
    }

    public Bank() {
    }
}
