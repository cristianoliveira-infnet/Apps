package br.edu.infnet.AppBanco.controleGastos.model;

public enum Recorrente {
    NAO_RECORRENTE("Não Recorrente"),
    PARCELAR_REPETIR("Parcelar ou Repetir"),
    FIXO("Fixo");

    private String recorrente;
    Recorrente(String recorrente) {
        this.recorrente = recorrente;
    }
}
