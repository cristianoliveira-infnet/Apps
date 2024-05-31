package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Recorrente extends Lancamento {
    private Double valorDaContaRecorrente;
    public Recorrente(String tituloDaConta, Double valorDaContaRecorrente, LocalDateTime dataVencimento, LocalDateTime dataPagamento, boolean vencido, String observacao) {
        super(tituloDaConta, dataVencimento, dataPagamento, vencido, observacao);
        this.valorDaContaRecorrente = valorDaContaRecorrente;
    }

    public boolean contaVencida() {
        if(super.isVencido()) {
            super.setEstaVencido(false);
        } else {
            this.setEstaVencido(true);
        }
        return super.isVencido();
    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "Descrição da conta: " +super.getTituloDaConta()+
                "\nData da Transação: "+ super.getDataVencimento()+
                "\nData do Pagamento: "+ super.getDataPagamento() +
                "\nValor da conta: "+ this.valorDaContaRecorrente+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
