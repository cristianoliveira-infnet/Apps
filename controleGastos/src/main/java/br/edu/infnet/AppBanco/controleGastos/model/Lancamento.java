package br.edu.infnet.AppBanco.controleGastos.model;

import java.util.Date;

public class Lancamento {
    private Long id;
    private Date dataDaTransacao;
    private String observacao;
    private boolean vencido;
    private Integer quantidadeContasPagas;
    private Integer quantidadeContasPendentes;

    public Lancamento(Date dataDaTransacao, boolean vencido, String observacao) {
        this.dataDaTransacao = dataDaTransacao;
        this.vencido = vencido;
        this.observacao = observacao;
    }

    public void setQuantidadeContasPagas(Integer quantidadeContasPagas) {
        this.quantidadeContasPagas = quantidadeContasPagas;
    }

    public void setQuantidadeContasFaltamPagar(Integer quantidadeContasPendentes) {
        this.quantidadeContasPendentes = quantidadeContasPendentes;
    }

    public Long getId() {
        return id;
    }

    public Date getDataDaTransacao() {
        return dataDaTransacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public boolean isVencido() {
        return vencido;
    }

    public Integer getQuantidadeContasPagas() {
        return quantidadeContasPagas;
    }

    public Integer getQuantidadeContasPendentes() {
        return quantidadeContasPendentes;
    }
}
