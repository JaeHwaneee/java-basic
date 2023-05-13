package org.example.programmers;

import java.util.Scanner;

// 15. 프로그래머스 - 홀짝구분하기
// 100
// 100 is even
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) {
            System.out.println(n + " is even");
        }
        if (n % 2 == 0) {
            System.out.println(n + " is odd");
        }
    }
}
