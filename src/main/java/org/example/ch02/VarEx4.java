package org.example.ch02;

// 자바의 정석 2-6: 리터럴의 타입과 접미사

public class VarEx4 {
    public static void main(String[] args) {
          final int score = 100;
//        score = 200; final을 사용해서 상수가 되면 상수는 변할 수 없는 선안한 고정값(200)이 되버림

        boolean power = true; // bollean에는 ture, false만 가능

//        byte b = 129; byte의 범위는 -128~127
        int oct = 010;  // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16

        long l = 1_000_000_000;
//        long l = 10_000_000_000; 100억은 float타입의 범위보다 넓기 때문에 사용하려면 더 큰 범위인 long의 L을 숫자뒤에 붙여야함
        float f = 3.14f;
//        float f = 3.14; float는 뒤에 f를 붙여야 에러발생하지 않음.
        double d = 3.14;
//        double d = 3.14f; f를 붙여도 double의 타입이 float보다 크기 때문에 에러발생하지 않음.


        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);
    }
}
