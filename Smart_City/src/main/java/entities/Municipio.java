package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Municipio {

    //ATRIBUTOS
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private double objetivo_co2_mes_hab;
    private String NIF;

    //Relação 1para1 Municipio-Utilizador
    @OneToOne
    private Utilizador utilizadorM;

    //CONSTRUTOR VAZIO
    public Municipio(){}

    //GETTERS e SETTERS
    public Utilizador getUtilizadorM() {return utilizadorM;}
    public void setUtilizadorM(Utilizador utilizadorM) {this.utilizadorM = utilizadorM;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getObjetivo_co2_mes_hab() {
        return objetivo_co2_mes_hab;
    }
    public void setObjetivo_co2_mes_hab(double objetivo_co2_mes_hab) {this.objetivo_co2_mes_hab = objetivo_co2_mes_hab;}

    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}