package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Avulso extends Lancamento {
    public Avulso(String tituloDaConta, Double valorDaContaAvulsa, Date dataVencimento, Date dataPagamento, boolean estaVencido, String observacao) {
        super(tituloDaConta, valorDaContaAvulsa, dataVencimento, dataPagamento, estaVencido, observacao);
    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "Valor da Conta Avulsa=" + super.getValorDaConta() +
                "\nData da Transação: "+ super.getDataVencimento()+
                "\nData da Transação: "+ super.getDataPagamento()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
