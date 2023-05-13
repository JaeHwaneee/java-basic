package org.example.programmers;

import java.util.Scanner;

/**
 * 7.프로그래머스 - 대소문자 바꿔서 출력하기
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String answer = "";
        // "aBcDeFg"
        for (int index = 0; index < input.length(); index++) {
            // 1. 문자 한개를 가져온다.
            char ch = input.charAt(index);

            // 2. 문자가 대문자인지 판단한다.
            if (Character.isUpperCase(ch)) {
                // 2-1 문자가 대문자라면, 소문자로 변경한다.
                answer += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                // 3. 문자가 소문인지 판단한다.
                // 3-1 문자가 소문자라면, 대문자로 변경한다.
                answer += Character.toUpperCase(ch);
            }
        }

        System.out.println(answer);
    }
}
