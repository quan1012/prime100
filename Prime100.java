package Vonglap.Baitap3;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}