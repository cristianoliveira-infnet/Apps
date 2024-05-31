package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Avulso extends Lancamento {
    private final Double valorDaContaAvulsa;
    public Avulso(String tituloDaConta, LocalDateTime dataVencimento, LocalDateTime dataPagamento, Double valorDaContaAvulsa, boolean estaVencido, String observacao) {
        super(tituloDaConta, dataVencimento, dataPagamento, estaVencido, observacao);
        this.valorDaContaAvulsa = valorDaContaAvulsa;
    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "Valor da Conta Avulsa=" + valorDaContaAvulsa +
                "\nData da Transação: "+ super.getDataVencimento()+
                "\nData da Transação: "+ super.getDataPagamento()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
