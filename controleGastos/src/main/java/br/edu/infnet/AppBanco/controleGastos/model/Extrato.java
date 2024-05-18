package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Extrato extends Lancamento{
    private Conta conta;
    private Date dataDeEmissao;

    public Date getData() {
        return dataDeEmissao;
    }

    public void extratoDaConta() {
        conta.toString();
    }


}
