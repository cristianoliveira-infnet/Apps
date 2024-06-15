package br.edu.infnet.AppBanco.controleGastos.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "lancamentos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tituloDaConta;
    @NonNull
    private Double valorDaConta;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;
    @NonNull
    private Boolean estaVencido = false;
    private String observacao;
    private Integer quantidadeContasPagas;
    private Integer quantidadeContasPendentes;

    public Lancamento(String tituloDaConta, Double valorDaConta, Date dataVencimento, Date dataPagamento, Boolean estaVencido, String observacao) {
        this.tituloDaConta = tituloDaConta;
        this.valorDaConta = valorDaConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.estaVencido = false;
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

    public Boolean getEstaVencido() {
        return this.estaVencido;
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
                "Data do vencimento:" +  getDataVencimento()+
                "Data do Pagamento: "+ getDataPagamento()+
                ", observacao='" + observacao + '\'' +
                ", vencido=" + estaVencido +
                ", quantidadeContasPagas=" + quantidadeContasPagas +
                ", quantidadeContasPendentes=" + quantidadeContasPendentes+"\n";
    }
}
