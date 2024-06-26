package br.edu.infnet.AppBanco.controleGastos.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import java.util.Date;
@Entity
@Table(name = "lancamentos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @NonNull
    @Column(name = "valor")
    private Double valor;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dataVencimento")
    private Date dataVencimento;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dataPagamento")
    private Date dataPagamento;
    @NonNull
    @Column(name = "estaVencido")
    private Boolean estaVencido = false;
    @Column(name = "observacao")
    private String observacao;

    public Lancamento(String descricao, Double valor, Date dataVencimento, Date dataPagamento, String observacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.estaVencido = false;
        this.observacao = observacao;
    }

    public Lancamento(){}

    public Lancamento(String descricao, Double valor, Date dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
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

    @Override
    public String toString() {
        return "Lancamento:" +
                "\nData do vencimento:" +  getDataVencimento()+
                "\nData do Pagamento: "+ getDataPagamento()+
                "\nOservacao='" + observacao +
                "\nVencido=" + estaVencido;
    }
}
