package br.edu.infnet.AppBanco.controleGastos.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "depesas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Despesa extends Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "recorrente")
    private Boolean recorrente;
    @Column(name = "vencido")
    private Boolean vencido;
    public Despesa(Integer id, String descricao, Double valor, Date dataVencimento, Date dataPagamento, Boolean vencido, String observacao, Boolean recorrente) {
        super(descricao, valor, dataVencimento, dataPagamento, observacao);
        this.id = id;
        if (vencido == null) {
            vencido = false;
        }
        this.vencido = vencido;
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

    public Boolean getVencido() {
        return vencido;
    }

    public void setVencido(Boolean vencido) {
        this.vencido = vencido;
    }

    public String isVencido() {
        if (vencido) {
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
                "\nRecorrente: "+this.getRecorrente();

    }
}
