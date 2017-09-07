package domain;

public class RomanNumbersConvertor {
    public String convertNumber(int number) {
        String convertedSymbol = "";
        if (RomanNumbers.romanNumberExist(number))
            convertedSymbol = RomanNumbers.getRomanNumber(number).getSymbole();
        else
            return getRomanNumber(number);
        return convertedSymbol;
    }

    private String getRomanNumber(int number) {
        if (number == 0)
            return "";
        else {
            final RomanNumbers closestNumber = findClosestRomanNumber(number);
            final int difference = getDifference(number, closestNumber);
            final boolean insertLeft = isLeftInsert(difference);
            return addNewSymbol(closestNumber, difference, insertLeft);
        }
    }

    private String addNewSymbol(RomanNumbers closestNumber, int difference, boolean insertLeft) {
        if (insertLeft)
            return closestNumber.getSymbole() + getRomanNumber(difference);
        else
            return getRomanNumber(difference) + closestNumber.getSymbole();
    }

    private boolean isLeftInsert(int difference) {
        return difference > 0;
    }


    public RomanNumbers findClosestRomanNumber(int number) {
        final RomanNumbers[] numbers = RomanNumbers.values();
        RomanNumbers closestNumber = numbers[0];
        int minDifference = Math.abs(number - closestNumber.getNumber());
        for (int indice = 1; indice < numbers.length; indice++) {
            int difference = calculDifference(getDifference(number, numbers[indice]));
            if (difference < minDifference) {
                minDifference = Math.abs(number - numbers[indice].getNumber());
                closestNumber = numbers[indice];
            }
        }
        return closestNumber;
    }

    private int calculDifference(int difference1) {
        int difference = difference1;
        if (difference < 0)
            difference = Math.abs(difference) + 1;
        return difference;
    }

    private static int getDifference(int number, RomanNumbers closestNumber) {
        int difference;
        if (number < 0)
            difference = -CalculDifference(number, closestNumber);
        else
            difference = CalculDifference(number, closestNumber);
        return difference;
    }

    private static int CalculDifference(int number, RomanNumbers closestNumber) {
        return Math.abs(number) - closestNumber.getNumber();
    }
}
