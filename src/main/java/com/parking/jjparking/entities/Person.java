package com.parking.jjparking.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idPerson;
    private String name;
    private String last_name;
    private String docType;
    private String docNum;
    private String address;
    private String phone;
    private String email;
}
