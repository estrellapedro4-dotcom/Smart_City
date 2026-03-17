package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Proprietario {
    @Id
    @GeneratedValue
    private Date data_aquisicao;
    private long id_cidadao;
    private long id_veiculo;

    public Proprietario(){}

    public Date getData_aquisicao() {
        return data_aquisicao;
    }

    public void setData_aquisicao(Date data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public long getId_cidadao() {
        return id_cidadao;
    }

    public void setId_cidadao(long id_cidadao) {
        this.id_cidadao = id_cidadao;
    }

    public long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }
}
