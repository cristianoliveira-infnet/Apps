package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Lancamento {
    private Long id;
    private LocalDateTime dataDaTransacao;
    private String observacao;
    private boolean vencido;
    private Integer quantidadeContasPagas;
    private Integer quantidadeContasPendentes;

    public Lancamento(LocalDateTime dataDaTransacao, boolean vencido, String observacao) {
        this.dataDaTransacao = dataDaTransacao;
        this.vencido = vencido;
        this.observacao = observacao;
    }

    public Lancamento(){}

    public void setQuantidadeContasPagas(Integer quantidadeContasPagas) {
        this.quantidadeContasPagas = quantidadeContasPagas;
    }

    public void setQuantidadeContasFaltamPagar(Integer quantidadeContasPendentes) {
        this.quantidadeContasPendentes = quantidadeContasPendentes;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataDaTransacao() {
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

    @Override
    public String toString() {
        return "Lancamento{" +
                ", dataDaTransacao=" + dataDaTransacao +
                ", observacao='" + observacao + '\'' +
                ", vencido=" + vencido +
                ", quantidadeContasPagas=" + quantidadeContasPagas +
                ", quantidadeContasPendentes=" + quantidadeContasPendentes +
                '}';
    }
}
