package domain;

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
    }, MILL(1000) {
        @Override
        public String getSymbole() {
            return "M";
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


}
