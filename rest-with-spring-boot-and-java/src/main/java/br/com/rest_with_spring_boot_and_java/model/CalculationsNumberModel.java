package br.com.rest_with_spring_boot_and_java.model;

import br.com.rest_with_spring_boot_and_java.Exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Component;

import static br.com.rest_with_spring_boot_and_java.model.ConvertNumberModel.convertToDouble;
import static br.com.rest_with_spring_boot_and_java.model.ConvertNumberModel.isNumeric;

@Component
public class CalculationsNumberModel {

    //soma
    public Double Sum(String numberOne,String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("por favor coloque numeros");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }


    //divisão
    public double div(String numberOne, String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("por favor coloque numeros");
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    //multiplicação
    public double mult( String numberOne, String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("por favor coloque numeros");
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public double sub(String numberOne,String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("por favor coloque numeros");
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public double por( String numberOne,String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("por favor coloque numeros");
        }
        return ((convertToDouble(numberOne) / 100) * convertToDouble(numberTwo));
    }
}
