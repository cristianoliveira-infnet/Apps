package br.edu.infnet.AppBanco.controleGastos.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Lancamento {
    private Integer id;
    private String tituloDaConta;
    private Double valorDaConta;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;
    private boolean estaVencido;
    private String observacao;
    private Integer quantidadeContasPagas;
    private Integer quantidadeContasPendentes;

    public Lancamento(String tituloDaConta, Double valorDaConta, Date dataVencimento, Date dataPagamento, boolean estaVencido, String observacao) {
        this.tituloDaConta = tituloDaConta;
        this.valorDaConta = valorDaConta;
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

    public Double getValorDaConta() {
        return valorDaConta;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String isVencido() {
        if (estaVencido) {
            return "Sim";
        } else {
            return "Não";
        }
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
