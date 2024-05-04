package br.edu.infnet.AppBanco.controleGastos.model;

import java.time.Duration;
import java.util.Date;

public class Avulso extends Lancamento {
    public Avulso(Double valorDebitado, Date dataTransacao, boolean vencido) {
        super(valorDebitado, dataTransacao, vencido);
    }
}
