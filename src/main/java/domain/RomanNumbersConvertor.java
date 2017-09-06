package domain;

public class RomanNumbersConvertor {
    public String convertNumber(int amount) {
        return RomanNumbers.getRomanNumber(amount).getSymbole();
    }
}
