package com.cielo.desafio.conta.mock.legado;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class LegadoService {

    @Value("classpath:mockData/lancamento-conta-legado.json")
    private Resource myResource;

    public String getLancamentos(String numeroDaConta ){

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader buffer = new BufferedReader( new InputStreamReader(myResource.getInputStream()));
            buffer.lines().forEach(stringBuilder::append);
        } catch (IOException e){
            return "";
        }
        return stringBuilder.toString();

    }
}
