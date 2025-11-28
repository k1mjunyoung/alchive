package hash;

import java.util.*;

/**
 * 문제 이름: 완주하지 못한 선수
 * 난이도: Level 1
 * 정확성: 59.3
 * 효율성: 0.0 
 * 합계: 59.3 / 100.0
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576#
 */
class PGM42576 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(sol.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> partiMap = new HashMap<>();

        for (String parti : participant) {
            partiMap.put(parti, partiMap.getOrDefault(parti, 0) + 1);
        }
        for (String compl : completion) {
            partiMap.put(compl, partiMap.get(compl) - 1);
        }

        for (Map.Entry<String, Integer> entry : partiMap.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        
        return "";
    }
}