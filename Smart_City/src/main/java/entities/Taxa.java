package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Taxa {
    @Id
    @GeneratedValue
    private Date mes_ano;
    private double co2_total;
    private double kms_total;


    public Taxa(){}


}
