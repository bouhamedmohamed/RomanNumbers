package domain;

import java.util.Arrays;
import java.util.Optional;

public enum RomanNumbers {
    UN(1, "I"), QUATRE(4, "IV"), CINQ(5, "V"), NEUF(9, "IX"), DIX(10, "X"), QUNTE(40, "XL"), CINQT(50, "L"),
    QUATVD(90, "XC"), CENT(100, "C"), QUATC(400, "CD"), CINQC(500, "D"), NEUFC(900, "CM"), MILL(1000, "M");


    private int number;

    private String symbol;


    RomanNumbers(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }


    public static Optional<RomanNumbers> getRomanNumber(int number) {
        return Arrays.stream(values()).filter(element -> element.getNumber() == number).findFirst();
    }
}
