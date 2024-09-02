package br.com.estudo.controllers;

import br.com.estudo.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/calc")
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping(value = "/sum/{numberOne}/{numberTwo}")
    public double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.sum(numberOne, numberTwo);
    }

    @GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
    public double subtraction(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.subtraction(numberOne, numberTwo);
    }

    @GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
    public double multiplication(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.multiplication(numberOne, numberTwo);
    }

    @GetMapping(value = "/division/{numberOne}/{numberTwo}")
    public double division(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.division(numberOne, numberTwo);
    }

    @GetMapping(value = "/average/{numberOne}/{numberTwo}/{numberThree}")
    public double average(@PathVariable(value = "numberOne") String numberOne,
                          @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.average(numberOne, numberTwo);
    }

    @GetMapping(value = "/squareRoot/{numberOne}")
    public double average(@PathVariable(value = "numberOne") String numberOne) {

        return mathService.squareRoot(numberOne);
    }

}
