package io.github.antoniojuniorr.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoAprovado {

    private String carta;
    private String bandeira;
    private BigDecimal limiteAprovado;

}
