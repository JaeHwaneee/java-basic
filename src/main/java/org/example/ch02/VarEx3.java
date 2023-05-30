package org.example.ch02;

// 자바의 정석 2-4: 상수와 리터럴

public class VarEx3 {
    public static void main(String[] args) {
       final int score = 100;
//        score = 200; final을 사용해서 상수가 되면 상수는 변할 수 없는 선안한 고정값(200)이 되버림

        System.out.println(score);
    }
}
