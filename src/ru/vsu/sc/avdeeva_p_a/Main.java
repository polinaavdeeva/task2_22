package ru.vsu.sc.avdeeva_p_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите три числа : ");
        int a = readNum();
        int b = readNum();
        int c = readNum();

        if (a >= b && a >= c) {
            if (c >= b) {
                System.out.println("Сравним числа друг с другом : " + b + "<=" + c + "<=" + a);
            } else {
                System.out.println("Сравним числа друг с другом : " + c + "<=" + b + "<=" + a);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Сравним числа друг с другом : " + c + "<=" + a + "<=" + b);
            } else {
                System.out.println("Сравним числа друг с другом : " + a + "<=" + c + "<=" + b);
            }
        } else {
            if (a >= b) {
                System.out.println("Сравним числа друг с другом : " + b + "<=" + a + "<=" + c);
            } else {
                System.out.println("Сравним числа друг с другом : " + a + "<=" + b + "<=" + c);
            }
        }

    }

    static int readNum() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value <= 0) {
            System.out.println("Error");
            System.exit(1);
        }
        return value;
    }

}
