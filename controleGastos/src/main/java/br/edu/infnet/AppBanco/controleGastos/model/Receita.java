package br.edu.infnet.AppBanco.controleGastos.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "receitas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Receita extends Lancamento {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "efetivada")
    private final Boolean efetivada;
    public Receita(Integer id, String descricao, Double valor, Date dataVencimento, Boolean efetivada) {
        super(descricao, valor, dataVencimento);
        this.id = id;
        this.efetivada = efetivada;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEfetivada() {
        return efetivada;
    }
}
