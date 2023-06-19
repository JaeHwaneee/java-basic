package org.example.programmers;

// 프로그래머스17 - 수 조작하기 2
public class Problem17 {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - numLog[i - 1]) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
            }
        }
        return answer;
    }
//    public String solution(int[] numLog) {
//        String control = "";
//        for(int i = 1; i < numLog.length; i++){
//            if(numLog[i] - numLog[i - 1] == 1)
//                control += 'w';
//            else if(numLog[i] - numLog[i - 1] == -1)
//                control += 's';
//            else if (numLog[i] - numLog[i - 1] == 10)
//                control += 'd';
//            else
//                control += 'a';
//        }
//        return control;
//    }
}
