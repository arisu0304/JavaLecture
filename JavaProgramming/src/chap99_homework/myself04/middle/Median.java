package chap99_homework.myself04.middle;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        int mid = a;
        if(b>a) {
            if(c>b) {
                mid = b;
            }else if(c>a) {
                mid = c;
            }
        }else {
            if(a>c) {
                if(b>c) {
                    mid = b;
                }else {
                    mid = c;
                }
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();
        System.out.print("c의 값：");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
