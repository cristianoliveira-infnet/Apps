package br.edu.infnet.AppBanco.controleGastos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "balanco")
@Inheritance(strategy = InheritanceType.JOINED)
public class Balanco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dataEmissao")
    private Date dataDeEmissao;
    @Column(name = "totalContasPagas")
    private Integer totalContasPagas;
    @Column(name = "totalReceita")
    private Double totalReceita;
    @Column(name = "totalDespesa")
    private Double totalDespesa;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "idLancamento")
    @JsonBackReference
    private List<Lancamento> lancamentos;

    public Balanco() {
        this.lancamentos = new ArrayList<Lancamento>();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getDataDeEmissao() {
        return dataDeEmissao;
    }
    public Double getTotalDespesa() {
        return totalDespesa;
    }
    public void setDataDeEmissao(Date dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }
    public Integer getTotalContasPagas() {
        return totalContasPagas;
    }
    public void setTotalContasPagas(Integer totalContasPagas) {
        this.totalContasPagas = totalContasPagas;
    }
    public Double getTotalReceita() {
        return totalReceita;
    }
    public void setTotalReceita(Double totalReceita) {
        this.totalReceita = totalReceita;
    }
    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }
    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
    public void setTotalDespesa(Double totalDespesa) {
        this.totalDespesa = totalDespesa;
    }
    @Override
    public String toString() {
        return "Balanco\n" +
                "id: " + id +
                "\ndataDeEmissao:" + dataDeEmissao +
                "\ntotalContasPagas: " + totalContasPagas +
                "\ntotalReceita: " + totalReceita +
                "\nlancamentos: " + lancamentos;
    }
}
