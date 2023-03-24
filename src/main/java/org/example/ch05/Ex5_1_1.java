package org.example.ch05;

public class Ex5_1_1 {
    public static void main(String[] args) {
        int[] arr = new int[9]; // 길이가 5인 int 배열

        // 첫번째 반복문에서는 arr 에 값만 할당해라
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 30 + i;
        }

        // 두번째 반복문에서는 arr 에 있는 값을 출력해라
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}
