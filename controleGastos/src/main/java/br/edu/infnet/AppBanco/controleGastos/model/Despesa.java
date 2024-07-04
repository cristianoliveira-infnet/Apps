package br.edu.infnet.AppBanco.controleGastos.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "despesas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Despesa extends Lancamento {
    @Column(name = "vencido")
    private Boolean vencido;

    public Despesa() {
        if (this.vencido == null) {
            this.vencido = false;
        }
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
                "\nEsta vencida: " +isVencido()+
                "\nObservacao: " +getObservacao();
    }
}
