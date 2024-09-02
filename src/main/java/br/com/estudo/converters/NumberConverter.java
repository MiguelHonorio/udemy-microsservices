package br.com.estudo.converters;

import br.com.estudo.exceptions.ResourceNotFoundException;

public class NumberConverter {

    public static void validateNumber(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new ResourceNotFoundException("Please set a numeric value");
        }
    }
    public static double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;

        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);

        return 0D;

    }

    public static boolean isNumeric(String strNumber) {

        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
