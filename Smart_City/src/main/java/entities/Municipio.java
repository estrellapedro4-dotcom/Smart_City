package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Municipio {
    @Id
    @GeneratedValue
    private long id_cidadao;
    private String nome;
    private double objetivo_co2_mes_hab;
    private String NIF;

    public Municipio(){}

    public long getId_cidadao() {
        return id_cidadao;
    }

    public void setId_cidadao(long id_cidadao) {
        this.id_cidadao = id_cidadao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getObjetivo_co2_mes_hab() {
        return objetivo_co2_mes_hab;
    }

    public void setObjetivo_co2_mes_hab(double objetivo_co2_mes_hab) {
        this.objetivo_co2_mes_hab = objetivo_co2_mes_hab;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}