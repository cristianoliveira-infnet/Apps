package br.edu.infnet.AppBanco.controleGastos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonToken;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Cotacao (
        @JsonAlias("base_code")
        String deDolar,
        @JsonAlias("target_code")
        String paraReal,
        @JsonAlias("conversion_rate")
        String valorConvertido) {
}
