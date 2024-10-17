package br.com.rest_with_spring_boot_and_java.controller;

import br.com.rest_with_spring_boot_and_java.model.CalculationsNumberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class MathController {

    @Autowired
    private CalculationsNumberModel cal;

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double Sum(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return cal.Sum(numberOne, numberTwo);
    }


    @GetMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return cal.mult(numberOne, numberTwo);
    }


    @GetMapping("/por/{numberOne}/{numberTwo}")
    public Double por(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return cal.por(numberOne, numberTwo);
    }


    @GetMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return cal.sub(numberOne, numberTwo);
    }


    @GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return cal.div(numberOne, numberTwo);
    }


}

