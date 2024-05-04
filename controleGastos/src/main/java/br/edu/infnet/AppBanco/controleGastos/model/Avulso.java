package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Avulso extends Lancamento {
    private Double valorDaContaAvulsa;
    public Avulso(Double valorDaContaAvulsa, Date dataTransacao, boolean vencido, String observacao) {
        super(dataTransacao, vencido, observacao);
        this.valorDaContaAvulsa = valorDaContaAvulsa;
    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "Valor da Conta Avulsa=" + valorDaContaAvulsa +
                "\nData da Transação: "+ super.getDataDaTransacao()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
