package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Recorrente extends Lancamento {
    private Double valorDaContaRecorrente;
    public Recorrente(Date dataDaTransacao, boolean vencido, String observacao, Double valorDebitado) {
        super(dataDaTransacao, vencido, observacao);
        this.valorDaContaRecorrente = valorDaContaRecorrente;
    }


}
