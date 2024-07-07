package br.edu.infnet.AppBanco.controleGastos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @NonNull
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "valor")
    @NotNull
    private Double valor;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    @Column(name = "dataVencimento")
    private Date dataVencimento;
    @Enumerated(EnumType.STRING)
    @Column(name = "recorrente")
    private Recorrente recorrente;
    @NotEmpty
    @Column(name = "observacao")
    private String observacao;
    @ManyToOne
    @JoinColumn(name = "idExtrato")
    @JsonBackReference
    private Balanco balanco;
    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Recorrente getRecorrente() {
        return recorrente;
    }

    public Double getValor() {
        return valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setRecorrente(Recorrente recorrente) {
        this.recorrente = recorrente;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public String recorrenteAlterada() {
        var novaRecorrente = this.recorrente.toString().substring(1, recorrente.toString().length());
        return novaRecorrente;
    }

    @Override
    public String toString() {
        return "Lancamento\n" +
                "\nId=" + id +
                "\nDescricao='" + descricao +
                "\nValor=" + valor +
                "\nDataVencimento=" + dataVencimento +
                "\nRecorrente=" + recorrenteAlterada() +
                "\nObservacao='" + observacao;
    }
}
