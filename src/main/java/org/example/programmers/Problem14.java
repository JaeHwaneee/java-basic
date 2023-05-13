package org.example.programmers;


// 14. 프로그래머스 - 문자열 돌리기
// abcde
//a
//b
//c
//d
//e

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] charArray = a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

    }
}
