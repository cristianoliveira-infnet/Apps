package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Recorrente extends Lancamento {
    public Recorrente(String tituloDaConta, Double valorDaContaRecorrente, Date dataVencimento, Date dataPagamento, boolean vencido, String observacao) {
        super(tituloDaConta, valorDaContaRecorrente, dataVencimento, dataPagamento, vencido, observacao);
    }


    @Override
    public String toString() {
        return "Conta avulsa:" +
                "\nDescrição da conta: " +super.getTituloDaConta()+
                "\nData do Vencimento: "+ super.getDataVencimento()+
                "\nData do Pagamento: "+ super.getDataPagamento() +
                "\nValor da conta: "+ super.getValorDaConta()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao();
    }
}
