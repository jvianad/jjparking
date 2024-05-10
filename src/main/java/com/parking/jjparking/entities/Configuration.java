package com.parking.jjparking.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "configuration")
@Data
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguration;
    private String parking_name;
    @OneToOne(mappedBy = "configuration")
    private Rates rates;
}
