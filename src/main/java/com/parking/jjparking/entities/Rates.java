package com.parking.jjparking.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rates")
@Data
public class Rates {
    @Id
    @GeneratedValue
    private int idRate;
    @OneToOne
    @JoinColumn(name = "configuration_id", referencedColumnName = "idConfiguration")
    private Configuration configuration;
    private Double valuexHourCar;
    private Double valuexHourMCycle;
    private Double valuexFracCar;
    private Double valuexFracMCycle;
    private Double valuexDayCar;
    private Double valuexDayMCycle;
    private Double valuexWkCar;
    private Double valuexWkMCycle;
    private Double valuexMonthCar;
    private Double valuexMonthMCycle;
}
