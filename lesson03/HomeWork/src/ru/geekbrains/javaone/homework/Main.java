package ru.geekbrains.javaone.homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char [][] map;
    static final char X = 'X';
    static final char O = 'O';
    static final char DEFAULT = '*';
    static final int HUMAN = 1;
    static final int MACHINE = -1;
    static final int FRIENDSHIP = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        fill(size);
        printMap();
        game(in, size);
    }

    private static void game(Scanner in, int size) {
        while (true){
            humanMove(in, size);
            printMap();
            if(check(size) == HUMAN){ //
                System.out.println("Вы победили");
                return;
            }
            else if(check(size) == MACHINE){
                System.out.println("Увы " +
                        "машина обыграла вас");
                return;
            }
            else if(check(size) == FRIENDSHIP){ // 0
                System.out.println("Ничья");
                return;
            }
            System.out.println("Ходит компьютер");
            aiMove(size);
            printMap();
            if(check(size) == HUMAN){ //
                System.out.println("Вы победили");
                return;
            }
            else if(check(size) == MACHINE){
                System.out.println("Увы " +
                        "машина обыграла вас!");
                return;
            }
            else if(check(size) == FRIENDSHIP){ // 0
                System.out.println("Ничья");
                return;
            }
        }
    }

    private static int check(int size) {
     /*   if((map[0][0] == map[1][1]
                && map[1][1] == map[2][2])
                || (map[0][2] == map[1][1]
                && map[1][1] == map[2][0]))
            return map[1][1] == X ? HUMAN :
                    map[1][1] == O ? MACHINE : 5;
        if((map[0][0] == map[0][1]
                && map[0][1] == map[0][2])
                || (map[0][0] == map[1][0]
                && map[1][0] == map[2][0])){
            return map[0][0] == X ? HUMAN :
                    map[0][0] == O ? MACHINE : 5;
        }
        if((map[1][0] == map[1][1]
                && map[1][1] == map[1][2])
                || (map[0][1] == map[1][1]
                && map[1][1] == map[1][2])){
            return map[1][1] == X ? HUMAN :
                    map[1][1] == O ? MACHINE : 5;
        }
        if((map[2][0] == map[2][1]
                && map[2][1] == map[2][2]) ||
                (map[0][2] == map[1][2]
                        && map[1][2] == map[2][2])){
            return map[2][2] == X ? HUMAN :
                    map[2][2] == O ? MACHINE : 5;
        }
        int cnt = 0;
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if(map[i][j] == X || map[i][j] == O) cnt++;
            }
        }
        if(cnt == size * size) return FRIENDSHIP;
        return 5; */
        int d, d2, h, v;
        for (int i = 0; i < size; i++) {
            h = 0; v = 0;
            for (int j = 0; j < size; j++) {
                if (map[i][j] == X) {
                    h++;
                }
                if (map[j][i] == X) {
                    v++;
                }
            }
            if (h >= 4|| v >= 4) {
                return 5;
            }
        }
        d = 0; d2 = 0;
        for (int i = 0; i < size; i++) {
            if (map[i][i] == X) {
                d++;
            }
            if (map[i][size - i - 1] == X) {
                d2++;
            }
        }
        if (d >= 4 || d2 >= 4) {
            return 5;
        }
        return 5;
    }

    private static void humanMove(Scanner in, int size) {
        System.out.println("Ходит игрок");
        System.out.println("Введите номер строки и " +
                "столбца через пробел ");
        int x = in.nextInt() - 1, y = in.nextInt() - 1;
        while(x > size || y > size || y < 0 || x < 0 ||
                map[x][y] == X || map[x][y] == O){
            System.out.printf("Введите номер строки и номер столбца в интервале от %d до %d", 1, size);
            x = in.nextInt() - 1;
            y = in.nextInt() - 1;
        }
        map[x][y] = X;
    }


    private static void aiMove(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(map[i][j] == DEFAULT){
                    map[i][j] = O;
                    return;
                }
            }
        }
    }

    static void printMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    static void fill(int n){
        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }
}
