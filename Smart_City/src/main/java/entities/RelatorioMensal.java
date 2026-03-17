package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class RelatorioMensal {
    @Id
    @GeneratedValue
    private long id_municipio;
    private double ajuste;
    private double co2_total_kg;
    private double kms_total;
    private Date mes_ano;
    private int nume;

    public RelatorioMensal() {
    }

    public long getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(long id_municipio) {
        this.id_municipio = id_municipio;
    }

    public double getAjuste() {
        return ajuste;
    }

    public void setAjuste(double ajuste) {
        this.ajuste = ajuste;
    }

    public double getCo2_total_kg() {
        return co2_total_kg;
    }

    public void setCo2_total_kg(double co2_total_kg) {
        this.co2_total_kg = co2_total_kg;
    }

    public double getKms_total() {
        return kms_total;
    }

    public void setKms_total(double kms_total) {
        this.kms_total = kms_total;
    }

    public Date getMes_ano() {
        return mes_ano;
    }

    public void setMes_ano(Date mes_ano) {
        this.mes_ano = mes_ano;
    }
}
