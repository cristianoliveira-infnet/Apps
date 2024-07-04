package br.edu.infnet.AppBanco.controleGastos.model;

import jakarta.persistence.*;

import java.util.Locale;

@Entity
@Table(name = "receitas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Receita extends Lancamento {
    @Column(name = "efetivada")
    private Boolean efetivada;

    public Receita() {
        if (this.efetivada == null) {
            this.efetivada = false;
        }
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
                "\nID: "+getId()+
                "\nDescrição da conta: " +getDescricao()+
                "\nValor da conta: R$"+ getValor()+
                "\nData do Recebimento: "+ getDataVencimento()+
                "\nRecorrente: "+ recorrenteAlterada()+
                "\nEfetivada: " + this.estaEfetivado();
    }
}
