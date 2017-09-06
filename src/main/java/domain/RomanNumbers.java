package domain;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum RomanNumbers {
    UN("1") {
        @Override
        public String getSymbole() {
            return "I";
        }

    }, CINQ("5") {
        @Override
        public String getSymbole() {
            return "V";
        }
    };

    private String romanSymbol;

    public abstract String getSymbole();

    RomanNumbers(String romanSymbol) {
        this.romanSymbol = romanSymbol;
    }

    public static RomanNumbers getRomanNumber(int number)
    {
        final Predicate<RomanNumbers> numberRomainExist = romainNumber -> romainNumber.romanSymbol.equals(String.valueOf(number));
        final Optional<RomanNumbers> romanNumber = Arrays.stream(RomanNumbers.values()).filter(numberRomainExist).findAny();
        return romanNumber.get();
    }
}
