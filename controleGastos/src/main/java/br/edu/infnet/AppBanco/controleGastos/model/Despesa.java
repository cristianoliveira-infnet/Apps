package br.edu.infnet.AppBanco.controleGastos.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "depesas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Despesa extends Lancamento {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "recorrente")
    private Boolean recorrente;
    public Despesa(Integer id, String descricao, Double valorDaConta, Date dataVencimento, Date dataPagamento, Boolean vencido, String observacao, Boolean recorrente) {
        super(descricao, valorDaConta, dataVencimento, dataPagamento, vencido, observacao);
        this.id = id;
        this.recorrente = recorrente;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getRecorrente() {
        return recorrente;
    }

    public void setRecorrente(Boolean recorrente) {
        this.recorrente = recorrente;
    }

    public String isRecorrente() {
        if (recorrente) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public String toString() {
        return "Despesa:" +
                "\nID: "+this.getId()+
                "\nDescrição da conta: " +getDescricao()+
                "\nValor da conta: R$"+ getValor()+
                "\nData do Vencimento: "+ getDataVencimento()+
                "\nData do Pagamento: "+ getDataPagamento() +
                "\nEsta vencida: " +isVencido()+
                "\nObservacao: " +getObservacao()+
                "\nRecorrente: "+this.isRecorrente();
    }
}
