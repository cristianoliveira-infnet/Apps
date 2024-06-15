package br.edu.infnet.AppBanco.controleGastos.model;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "contasRecorrentes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Recorrente extends Lancamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Recorrente(Integer id, String tituloDaConta, Double valorDaConta, Date dataVencimento, Date dataPagamento, Boolean vencido, String observacao) {
        super(tituloDaConta, valorDaConta, dataVencimento, dataPagamento, vencido, observacao);
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conta Recorrente:" +
                "\nID: "+this.getId()+
                "\nDescrição da conta: " +super.getTituloDaConta()+
                "\nValor da conta: R$"+ super.getValorDaConta()+
                "\nData do Vencimento: "+ super.getDataVencimento()+
                "\nData do Pagamento: "+ super.getDataPagamento() +
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao()+"\n";
    }
}
