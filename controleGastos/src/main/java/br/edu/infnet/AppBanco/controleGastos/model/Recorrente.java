package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Recorrente extends Lancamento {
    private Double valorDaContaRecorrente;
    public Recorrente(Double valorDaContaRecorrente, LocalDateTime dataDaTransacao, boolean vencido, String observacao) {
        super(dataDaTransacao, vencido, observacao);
        this.valorDaContaRecorrente = valorDaContaRecorrente;
    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "Valor da Conta Recorrente=" + valorDaContaRecorrente +
                "\nData da Transação: "+ super.getDataDaTransacao()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
