package com.cielo.desafio.conta.service;

import com.cielo.desafio.conta.model.ControleLancamento;
import com.cielo.desafio.conta.model.CustomPageable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ContaService {


    @Value("${application.url.controle-lancamento}")
    private String urlLegado = "http://localhost:8080/mock-url-legado/";

    public CustomPageable<ControleLancamento> getControleLancamento(String numeroDaConta){
        RestTemplate restTemplate = new RestTemplate();
        StringBuilder url = new StringBuilder();
        url.append(urlLegado).append("/").append(numeroDaConta);
        return restTemplate.getForObject( url.toString(), CustomPageable.class);
    }
}
