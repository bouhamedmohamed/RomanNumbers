package domain;

public class RomanNumbersConvertor {
    public String convertNumber(int amount) {
        String convertedSymbol="";
        if(RomanNumbers.romanNumberExist(amount))
        convertedSymbol= RomanNumbers.getRomanNumber(amount).getSymbole();
        return convertedSymbol;
    }
}
