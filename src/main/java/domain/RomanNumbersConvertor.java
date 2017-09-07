package domain;

import java.util.Optional;

public class RomanNumbersConvertor {
    public String convertNumber(int number) {
        String convertedSymbol = "";
        return getRomanNumber(number);

    }

    private String getRomanNumber(int number) {
        if (number == 0)
            return "";
        final Optional<RomanNumbers> romanNumber = RomanNumbers.getRomanNumber(number);
        if (romanNumber.isPresent())
            return romanNumber.get().getSymbol();
        else {
            final RomanNumbers closestNumber = findClosestRomanNumber(number);
            final int difference = calculDifference(number, closestNumber);
            return closestNumber.getSymbol() + getRomanNumber(difference);
        }
    }


    public RomanNumbers findClosestRomanNumber(int number) {
        final RomanNumbers[] numbers = RomanNumbers.values();
        RomanNumbers closestNumber = numbers[0];
        int minDifference = number - closestNumber.getNumber();
        for (RomanNumbers romanNumber : RomanNumbers.values()) {
            int difference = calculDifference(number, romanNumber);
            if (isMinValidDifference(minDifference, difference)) {
                minDifference = Math.abs(number - romanNumber.getNumber());
                closestNumber = romanNumber;
            }
        }
        return closestNumber;
    }

    private boolean isMinValidDifference(int minDifference, int difference) {
        return difference >= 0 && difference < minDifference;
    }

    private int calculDifference(int number, RomanNumbers romanNumber) {
        return number - romanNumber.getNumber();
    }


}
