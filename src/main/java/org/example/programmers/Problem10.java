package org.example.programmers;

// 10. 프로그래머스 - 길이에 따른 연산
/* 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을,
10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.*/
// [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51

public class Problem10 {
    public int solution(int[] num_list) {
        int size = num_list.length;
        if (size >= 11) {
            // 모든 원소의 합 구하기
            // 모든 원소를 탐색
            int sum = 0;
            for (int i = 0; i < size; i++) {
                // 원소를 한개 가져와서 더한다.
                // 더한 값을 반환.
                sum = sum + num_list[i];
            }

            return sum;
        }
        if (size <= 10) {
            int multi = 1;
            for (int i = 0; i < size; i++) {
                multi = multi * num_list[i];
            }

            return multi;
        }
        return size;
    }

    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        System.out.println(problem10);
    }
}
