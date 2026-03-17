package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cidadao {
    @Id
    @GeneratedValue
    private String nome;
    private String contacto;
    private int NIF;
    private String morada;
    private long id_municipio;

    public Cidadao(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public long getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(long id_municipio) {
        this.id_municipio = id_municipio;
    }
}
