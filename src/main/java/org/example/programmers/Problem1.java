package org.example.programmers;

/**
 * 프로그래머스 - 문자열로 변환
 */
public class Problem1 {

    public String solution(int n) {
        // 정수를 String 으로 변환
        return String.valueOf(n);
    }


    public static void main(String[] args) {
        // Problem 객체(클래스) 생성
        Problem1 problem1 = new Problem1();

        // Problem 객체(클래스) 내부의 method 인 solution 메소드를 호출
        // solution 메소드에 파라미터로 정수 123을 입력
        // 출력값으로 문자열 "123" 리턴 받아야 함.
        String response = problem1.solution(123);

        System.out.println(response);
    }
}
