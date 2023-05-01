package org.example.programmers;

/**
 * 프로그래머스 - 문자열 곱하기
 */
public class Problem3 {

    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer = answer + my_string;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();

        String response = problem3.solution("string", 3);

        System.out.println(response);
    }
}
