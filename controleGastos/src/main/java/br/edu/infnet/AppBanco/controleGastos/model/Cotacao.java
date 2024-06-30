package br.edu.infnet.AppBanco.controleGastos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Cotacao (
        @JsonProperty("simbolo")
        String simbolo,
        @JsonProperty("nomeFormatado")
        @JsonAlias("nome")
        String nome) {
}
