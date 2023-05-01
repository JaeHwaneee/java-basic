package org.example.programmers;

/**
 * 프로그래머스 - 문자열을 정수로 변환하기
 */
public class Problem2 {

    // n_str = "10"
    public int solution(String n_str) {
        // 문자열을 정수로 변환
        return Integer.valueOf(n_str);
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();

        int response = problem2.solution("10");

        System.out.println(response);
    }
}
