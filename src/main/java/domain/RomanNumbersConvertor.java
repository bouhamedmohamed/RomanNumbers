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
            return getRomanNumber(difference) + closestNumber.getSymbole();
        }
    }


    public RomanNumbers findClosestRomanNumber(int number) {

        return RomanNumbers.values()[0];

    }


}
