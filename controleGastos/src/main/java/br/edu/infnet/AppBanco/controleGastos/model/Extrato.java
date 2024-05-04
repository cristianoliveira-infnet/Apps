package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Extrato {
    private Conta conta;
    private Double deposito;
    private Double saques;
    private Double transferencias;
    private Date data;

    public Conta getConta() {
        return conta;
    }

    public Double getDeposito() {
        return deposito;
    }

    public Double getSaques() {
        return saques;
    }

    public Double getTransferencias() {
        return transferencias;
    }

    public Date getData() {
        return data;
    }


}
