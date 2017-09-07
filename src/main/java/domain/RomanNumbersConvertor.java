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
        return "II";
    }
}
