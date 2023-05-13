package org.example.programmers;

// 12. 프로그래머스 - 덧셈식 출력하기
// 입력: 4 5
// 출력: 4 + 5 = 9

// 입력 12 13
// 출력 12 + 13 = 25
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
