package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Lancamento {
    private Integer id;
    private String tituloDaConta;
    private LocalDateTime dataVencimento;
    private LocalDateTime dataPagamento;
    private boolean estaVencido;
    private String observacao;
    private Integer quantidadeContasPagas;
    private Integer quantidadeContasPendentes;

    public Lancamento(String tituloDaConta, LocalDateTime dataVencimento, LocalDateTime dataPagamento, boolean estaVencido, String observacao) {
        this.tituloDaConta = tituloDaConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.estaVencido = estaVencido;
        this.observacao = observacao;
    }

    public Lancamento(){}

    public void setQuantidadeContasPagas(Integer quantidadeContasPagas) {
        this.quantidadeContasPagas = quantidadeContasPagas;
    }

    public void setQuantidadeContasFaltamPagar(Integer quantidadeContasPendentes) {
        this.quantidadeContasPendentes = quantidadeContasPendentes;
    }

    public Integer getId() {
        return id;
    }

    public String getTituloDaConta() {
        return tituloDaConta;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isVencido() {
        return estaVencido;
    }
    public void setEstaVencido(boolean estaVencido) {
        this.estaVencido = estaVencido;
    }

    public Integer getQuantidadeContasPagas() {
        return quantidadeContasPagas;
    }

    public Integer getQuantidadeContasPendentes() {
        return quantidadeContasPendentes;
    }

    @Override
    public String toString() {
        return "Lancamento" +
                "Data do vencimento:" +  dataVencimento+
                "Data do Pagamento: "+ dataPagamento+
                ", observacao='" + observacao + '\'' +
                ", vencido=" + estaVencido +
                ", quantidadeContasPagas=" + quantidadeContasPagas +
                ", quantidadeContasPendentes=" + quantidadeContasPendentes;
    }
}
