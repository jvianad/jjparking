package com.parking.jjparking.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "place")
@Data
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlace;
    private String code;
    private String typeVehicle;
    private String status;
}
