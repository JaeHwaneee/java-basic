package org.example.programmers;

// 8. 프로그래머스 - flag에 따라 값 다른 값 반환하기
// a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

public class Problem8 {
    public int solution(int a, int b, boolean flag) {
        //1. flag = true -> a+b or flag = false -> a-b
        if(flag){
            return a + b;
        } else {
            return a - b;
        }
    }

    public static void main(String[] args) {
        Problem8 problem8 = new Problem8();
        System.out.println(problem8);
    }
}
