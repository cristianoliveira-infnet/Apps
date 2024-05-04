package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Recorrente extends Lancamento {
    public Recorrente(Double valorDebitado, Date dataDaTransacao, boolean vencido) {
        super(valorDebitado, dataDaTransacao, vencido);
    }
}
