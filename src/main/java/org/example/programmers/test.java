package org.example.programmers;
import java.util.Arrays;
public class test {

    public class Solution {
        public int[] solution(String s) {
            int cnt = 0;  // 이진 변환 횟수
            int removeCnt = 0;  // 제거된 0의 개수

            while (!s.equals("1")) {
                // 0 제거
                removeCnt += s.length() - s.replace("0", "").length();
                s = s.replace("0", "");

                // 이진 변환
                s = Integer.toBinaryString(s.length());
                cnt++;
            }

            return new int[] {cnt, removeCnt};
        }
    }

}
