package br.edu.infnet.AppBanco.controleGastos.model;

import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name="contasAvulsas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Avulso extends Lancamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Avulso(String tituloDaConta, Double valorDaContaAvulsa, Date dataVencimento, Date dataPagamento, boolean estaVencido, String observacao) {
        super(tituloDaConta, valorDaContaAvulsa, dataVencimento, dataPagamento, estaVencido, observacao);

    }

    @Override
    public String toString() {
        return "Conta avulsa:" +
                "\nID:" +this.getId()+
                "\nDescrição da conta: " + super.getTituloDaConta()+
                "\nValor da Conta Avulsa: R$"+ super.getValorDaConta() +
                "\nData da Transação: "+ super.getDataVencimento()+
                "\nData da Transação: "+ super.getDataPagamento()+
                "\nEsta vencida: " +super.isVencido()+
                "\nObservacao: " +super.getObservacao()+"\n";
    }
}
