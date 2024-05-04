package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Lancamento {
    private Long id;
    private Double valorDebitado;
    private Double valorCreditado;
    private Date dataDaTransacao;
    private String observaccao;
    private boolean vencido;

    public Lancamento(Double valorDebitado, Date dataDaTransacao, boolean vencido) {
        this.valorDebitado = valorDebitado;
        this.dataDaTransacao = dataDaTransacao;
        this.vencido = vencido;
    }
}
