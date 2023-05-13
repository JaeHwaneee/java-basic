package org.example.programmers;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = sc.nextInt();

        String answer = "";

        // 1. 반복문 5회 반복
        // 2. string 문자가 일렬로 출력
        for (int i = 0; i < n; i++) {
            answer = answer + str;
        }

        System.out.print(answer);
    }
}
