package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(10, 40);
        Fraction fr2 = new Fraction(50, 60);

        // In phân số
        System.out.print("Phân số 1: ");
        fr1.printFraction();
        System.out.print("Phân số 2: ");
        fr2.printFraction();

        // Rút gọn phân số
        System.out.print("Phân số 1 sau khi rút gọn: ");
        fr1.simplifyFraction();
        fr1.printFraction();

        // Nghịch đảo phân số
        System.out.print("Nghịch đảo của phân số 1: ");
        fr1.inverseFraction();
        fr1.printFraction();

        // Cộng, trừ, nhân, chia hai phân số
        Fraction sum = fr1.add(fr2);
        Fraction difference = fr1.subtract(fr2);
        Fraction product = fr1.multiply(fr2);
        Fraction quotient = fr1.divide(fr2);

        // In kết quả
        System.out.print("Tổng của hai phân số: ");
        sum.simplifyFraction();
        sum.printFraction();
        System.out.print("Hiệu của hai phân số: ");
        difference.simplifyFraction();
        difference.printFraction();
        System.out.print("Tích của hai phân số: ");
        product.simplifyFraction();
        product.printFraction();
        System.out.print("Thương của hai phân số: ");
        quotient.simplifyFraction();
        quotient.printFraction();
    }

}




