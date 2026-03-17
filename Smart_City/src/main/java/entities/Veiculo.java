package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue
    private String matricula;
    private String marca;
    private String modelo;
    private String combustivel;
    private Double CO2_kg_km;

    public Veiculo(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Double getCO2_kg_km() {
        return CO2_kg_km;
    }

    public void setCO2_kg_km(Double CO2_kg_km) {
        this.CO2_kg_km = CO2_kg_km;
    }
}
