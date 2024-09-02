package br.com.estudo.services;

import br.com.estudo.exceptions.ResourceNotFoundException;
import br.com.estudo.serviceImpl.MathServiceImpl;
import org.springframework.stereotype.Service;

import static br.com.estudo.converters.NumberConverter.*;

@Service
public class MathService implements MathServiceImpl {


    @Override
    public double sum(String numberOne, String numberTwo) {

        validateNumber(numberOne, numberTwo);

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }


    @Override
    public double subtraction(String numberOne, String numberTwo) {
        validateNumber(numberOne, numberTwo);

        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @Override
    public double multiplication(String numberOne, String numberTwo) {
        validateNumber(numberOne, numberTwo);

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @Override
    public double division(String numberOne, String numberTwo) {
        validateNumber(numberOne, numberTwo);

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @Override
    public double average(String numberOne, String numberTwo) {
        validateNumber(numberOne, numberTwo);

        return convertToDouble(numberOne) + convertToDouble(numberTwo) / 2;
    }

    @Override
    public double squareRoot(String numberOne) {
        if (!isNumeric(numberOne)) {
            throw new ResourceNotFoundException("Please set a numeric value");
        }


        return Math.sqrt(convertToDouble(numberOne));
    }

}
