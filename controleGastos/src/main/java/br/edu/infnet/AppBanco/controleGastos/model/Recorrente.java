package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Recorrente extends Lancamento {
    public Recorrente(String tituloDaConta, Double valorDaConta, Date dataVencimento, Date dataPagamento, Boolean vencido, String observacao) {
        super(tituloDaConta, valorDaConta, dataVencimento, dataPagamento, vencido, observacao);
    }

    @Override
    public String toString() {
        return "Conta Recorrente:" +
                "\nDescrição da conta: " +super.getTituloDaConta()+
                "\nValor da conta: R$"+ super.getValorDaConta()+
                "\nData do Vencimento: "+ super.getDataVencimento()+
                "\nData do Pagamento: "+ super.getDataPagamento() +
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao()+"\n";
    }
}
