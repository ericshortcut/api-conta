package com.cielo.desafio.conta.controller;

import com.cielo.desafio.conta.model.ControleLancamento;
import com.cielo.desafio.conta.model.CustomPageable;
import com.cielo.desafio.conta.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping("/{numeroDaConta}")
    public ResponseEntity<?> getConta(@PathVariable String numeroDaConta){
        final CustomPageable<ControleLancamento> controleLancamento = contaService.getControleLancamento(numeroDaConta);
        if( controleLancamento != null){
            return ResponseEntity.ok(controleLancamento);
        }else{
            return ResponseEntity.notFound().build();
        }

    }

}
