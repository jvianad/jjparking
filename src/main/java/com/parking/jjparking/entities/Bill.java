package com.parking.jjparking.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Entity
@Table(name = "bill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBill;
    private String billCode;
    private String vehiclePlate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;
    @Temporal(TemporalType.DATE)
    private Date billDate;
    private Double billValue;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_personas")
    private Person person;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_plazas")
    private Place place;
}
