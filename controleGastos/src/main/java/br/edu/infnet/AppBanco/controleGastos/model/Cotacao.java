package br.edu.infnet.AppBanco.controleGastos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Cotacao (
        @JsonAlias("code")
        String codigo,
        @JsonAlias("codein")
        String codein,
        @JsonAlias("name")
        String nome) {
}
