package com.cielo.desafio.conta.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ControleLancamento{
    private Integer quantidadeLancamentos;
    private Integer quantidadeRemessas;
    private Double valorLancamentos;
}