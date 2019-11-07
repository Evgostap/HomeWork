package ru.geekbrains.javaone.homework1;

public class HomeWork {
    public static void main (String[] args) {
        float e = expression(7, 1, 5, 5);
        System.out.println(e);
        System.out.println(gap(-3, 18));
        PositiveAndNigative(0);
        System.out.println("Hello, " + hello("John"));

        int x = 1000;
        int h, i, f;
        h = x % 4;
        i = x % 400;
        f = x % 100;
        if (h == 0 && f == 0 && i == 0) {
            System.out.println("Год високосный");
        } else if  (h == 0 && f == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }
    }
    private static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    private static boolean gap(int a, int b) {
        return  (a + b) >= 10 && (a + b) <= 20;
    }
    private static void PositiveAndNigative(int c) {
        if (c <0 ) {
            System.out.println("Переданное число отрицательное");
        } else {
            System.out.println("Переданное число положительное");
        }
    }
    private static String hello(String name) {
        return name;
    }
}
