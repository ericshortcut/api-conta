package com.cielo.desafio.conta.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomPageable <T>{
    private ControleLancamento totalControleLancamento;
    private T listaControleLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;
}