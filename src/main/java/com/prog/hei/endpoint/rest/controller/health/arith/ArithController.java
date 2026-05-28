package com.prog.hei.endpoint.rest.controller.health.arith;

import com.prog.hei.service.ArithService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public class ArithController {
    private  final ArithService arithService;
    public ArithController(ArithService arithService) {
        this.arithService = arithService;
    }
    @GetMapping("/add")
    public Long add(@RequestParam Long a, @RequestParam Long b) {
        return arithService.addition(a, b);
    }

    @GetMapping("/multiply")
    public Long multi(@RequestParam Long a, @RequestParam Long b) {
        return arithService.multiply(a, b);
    }

    @GetMapping("/sub")
    public Long sub(@RequestParam Long a, @RequestParam Long b) {
        return arithService.substruct(a, b);
    }

    @GetMapping("/divide")
    public BigDecimal divide(@RequestParam Long a, @RequestParam Long b) {
        return arithService.divide(a, b);
    }
}
