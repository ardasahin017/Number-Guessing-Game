package org.ardasahin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        Scanner scanner = new Scanner(System.in);

        int randomnumber = rn.randomnumber();
        int guess;

        System.out.print("Bir sayı giriniz: ");
        guess = scanner.nextInt();

        while (true) {
            if (guess < randomnumber) {
                System.out.println("Daha büyük.");
                guess = scanner.nextInt();
            } else if (guess > randomnumber) {
                System.out.println("Daha küçük.");
                guess = scanner.nextInt();
            } else if (guess == randomnumber) {
                System.out.println("Tebrikler, doğru sayıyı buldunuz.");
                break;
            }
        }


    }
}