package br.edu.infnet.AppBanco.controleGastos.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receitas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Receita extends Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "efetivada")
    private Boolean efetivada;
    public Receita(Integer id,
                   String descricao,
                   Double valor,
                   Date dataVencimento,
                   Boolean efetivada) {
        super(descricao, valor, dataVencimento);
        this.id = id;
        if(efetivada == null) {
            efetivada = false;
        }
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
    public void setEfetivada(Boolean efetivada) {
        this.efetivada = efetivada;
    }

    public String estaEfetivado() {
        if (efetivada) {
            return "Sim";
        }
        return "Não";
    }

    @Override
    public String toString() {
        return "\nReceita" +
                "\nID:" +this.getId()+
                "\nDescrição da conta: " +getDescricao()+
                "\nValor da conta: R$"+ getValor()+
                "\nData do Recebimento: "+ getDataVencimento()+
                "\nEfetivada=" + this.estaEfetivado();
    }
}
