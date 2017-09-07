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
            final int difference = Math.abs(number - closestNumber.getNumber());
            return  closestNumber.getSymbole()+getRomanNumber(difference);
        }
    }


    public RomanNumbers findClosestRomanNumber(int number) {
        final RomanNumbers[] numbers = RomanNumbers.values();
        RomanNumbers closestNumber = numbers[0];
        int minDifference = Math.abs(number - closestNumber.getNumber());
        for (int indice = 1; indice < numbers.length; indice++) {
            if (Math.abs(number - numbers[indice].getNumber()) < minDifference) {
                minDifference = Math.abs(number - numbers[indice].getNumber());
                closestNumber = numbers[indice];
            }
        }
        return closestNumber;
    }


}
