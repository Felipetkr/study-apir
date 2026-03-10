package br.com.fiap.study_apir.controller;//sempre criar a package controller dentro da pasta nessa seria "study_apir"

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//sempre instalar Extension Pack for Java
@RestController
@RequestMapping("/ping")//todas as rotas dentro dessa classe começam com "/ping"
public class PingController {
    @GetMapping("/rota")//requisição GET para "/rota", execute este método
    public String ping(){
        return "pong";
    }

    @GetMapping("/rota1")
    public String rota1(){
        return "rt";
    }

    @GetMapping("/rota2")
    public String rota2(){
        return "oa";
    }

    @GetMapping()
    public String rota3(){
        return "o";
    }
}