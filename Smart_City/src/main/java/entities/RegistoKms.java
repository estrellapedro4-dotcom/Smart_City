package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class RegistoKms {
    @Id
    @GeneratedValue
    private Date mes_ano;
    private double kms_mes;
    public RegistoKms(){}

    public Date getMes_ano() {
        return mes_ano;
    }

    public void setMes_ano(Date mes_ano) {
        this.mes_ano = mes_ano;
    }

    public double getKms_mes() {
        return kms_mes;
    }

    public void setKms_mes(double kms_mes) {
        this.kms_mes = kms_mes;
    }
}
