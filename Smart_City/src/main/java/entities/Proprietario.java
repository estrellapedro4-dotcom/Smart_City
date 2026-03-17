package entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Proprietario {

    private Date data_aquisicao;

    @ManyToOne
    @Id
    private Cidadao cidadaoP;

    @OneToOne
    @Id
    private Veiculo veiculoP;

    public Proprietario(){}

    public Cidadao getCidadaoP() {
        return cidadaoP;
    }

    public void setCidadaoP(Cidadao cidadaoP) {
        this.cidadaoP = cidadaoP;
    }

    public Veiculo getVeiculoP() {
        return veiculoP;
    }

    public void setVeiculoP(Veiculo veiculoP) {
        this.veiculoP = veiculoP;
    }

    public Date getData_aquisicao() {
        return data_aquisicao;
    }

    public void setData_aquisicao(Date data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

}
