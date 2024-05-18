package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Conta extends Lancamento {
    private Integer id;
    private Double saldo;
    private Double taxaMensal;
    private Date dataCriacao;
    private Integer quantidadeDepositos;
    private Integer quantidadeTransferencias;
    private Integer quantidadeSaque;

    public Integer getId() {
        return id;
    }

    public Double getTaxaMensal() {
        return taxaMensal;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }


    public Double deposito(Double valor) {
        this.saldo += valor;
        this.quantidadeDepositos += 1;
        return getSaldo();
    }

    public Double transferencia(Double valor) {
        this.saldo -= valor;
        this.quantidadeTransferencias += 1;
        return getSaldo();
    }

    public void pagaConta(Double valor) {
        this.saldo -= valor;
    }

    public void cobraTaxaDaConta() {
        taxaMensal = this.saldo*0.02;
        this.saldo -= taxaMensal;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", taxaMensal=" + taxaMensal +
                ", dataCriacao=" + dataCriacao +
                ", quantidadeDepositos=" + quantidadeDepositos +
                ", quantidadeTransferencias=" + quantidadeTransferencias +
                ", quantidadeSaque=" + quantidadeSaque +
                '}';
    }
}
