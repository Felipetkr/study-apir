package br.com.fiap.study_apir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//sempre instalar Extension Pack for Java
@RestController
@RequestMapping("/ping")
public class PingController {
    @GetMapping("/rota")
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