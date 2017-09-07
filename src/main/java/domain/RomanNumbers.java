package domain;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum RomanNumbers {
    UN(1) {
        @Override
        public String getSymbole() {
            return "I";
        }

    }, CINQ(5) {
        @Override
        public String getSymbole() {
            return "V";
        }
    }, DIX(10) {
        @Override
        public String getSymbole() {
            return "X";
        }
    }, CINQT(50) {
        @Override
        public String getSymbole() {
            return "L";
        }
    }, CENT(100) {
        @Override
        public String getSymbole() {
            return "C";
        }
    }, CINQC(500) {
        @Override
        public String getSymbole() {
            return "D";
        }
    };

    private int number;

    public abstract String getSymbole();

    RomanNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static RomanNumbers getRomanNumber(int number) {
        final Predicate<RomanNumbers> numberRomainExist = romainNumber -> romainNumber.number == number;
        final Optional<RomanNumbers> romanNumber = Arrays.stream(RomanNumbers.values()).filter(numberRomainExist).findAny();
        return romanNumber.get();
    }


    public static boolean romanNumberExist(int number) {
        final Predicate<RomanNumbers> numberRomainExist = romainNumber -> romainNumber.number == number;
        return Arrays.stream(RomanNumbers.values()).filter(numberRomainExist).findAny().isPresent();
    }
}
