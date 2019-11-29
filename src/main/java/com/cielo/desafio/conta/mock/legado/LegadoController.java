package com.cielo.desafio.conta.mock.legado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("mock-url-legado")
public class LegadoController {

    @Autowired
    LegadoService legadoService;

    @GetMapping("/{numeroDaConta}")
    public ResponseEntity<?> getLancamentos(@PathVariable String numeroDaConta ){
        String response = legadoService.getLancamentos(numeroDaConta);
        if(response.isEmpty()){
            return ResponseEntity.badRequest().body("{\"error\": \"Mock file not found\"}");
        }else{
            return ResponseEntity.ok(response);
        }
    }
}
