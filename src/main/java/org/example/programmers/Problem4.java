package org.example.programmers;

/**
 * 프로그래머스 - 정수 부분
 */

public class Problem4 {
    public int solution(double flo) {
        int response = (int) Math.floor(flo);

        return response;
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();

        // 소수점 버림 역할
        int response = problem4.solution(33333333333333d);

        System.out.println(response);
    }
}
