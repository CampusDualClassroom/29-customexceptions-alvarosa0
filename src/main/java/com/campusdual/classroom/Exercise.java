package com.campusdual.classroom;


class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor)

            throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Error: No se puede dividir entre cero.");
        }
        return dividend / divisor;
    }




    public static void main(String[] args) {

        try {
            int resultado = divisionWithCustomException(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El programa continúa normalmente.");
    }

    }
