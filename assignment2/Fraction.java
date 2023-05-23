package assignment2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
    }

    // Setter và Getter
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
    }

    public int getDenominator() {
        return denominator;
    }

    // Phương thức in phân số
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    // Phương thức rút gọn phân số
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    public void simplifyFraction() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Phương thức nghịch đảo phân số
    public void inverseFraction() {
        if (numerator != 0) {
            int temp = numerator;
            numerator = denominator;
            denominator = temp;
        } else {
            throw new ArithmeticException("Không thể nghịch đảo phân số với tử số bằng 0.");
        }
    }

    // Phương thức cộng hai phân số
    public Fraction add(Fraction other) {
        int resultNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Phương thức trừ hai phân số
    public Fraction subtract(Fraction other) {
        int resultNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Phương thức nhân hai phân số
    public Fraction multiply(Fraction other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Phương thức chia hai phân số
    public Fraction divide(Fraction other) {
        if (other.numerator != 0) {
            int resultNumerator = this.numerator * other.denominator;
            int resultDenominator = this.denominator * other.numerator;
            return new Fraction(resultNumerator, resultDenominator);
        } else {
            throw new ArithmeticException("Không thể chia phân số cho 0.");
        }
    }
}
