# programmers

## Reference

프로그래머스 코딩테스트 문제풀이전략: 자바편

## Javadoc

    ```java
    /**
     * 문제 이름(난이도) : 두 수의 합(LV0)
     * 시간 : 0.02ms
     * 메모리: 77MB
     * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120802
     * */
    public class Main {
        
        public static int solution(int a, int b){
            return a + b;
        }
        
        public static void main(String[] args) {
            System.out.println(solution(1, 2) == 3);
        }
    }
    ```

- 가장 마지막 테스트 케이스의 내용을 입력
- 정확성, 효율성 2개가 존재할 경우 `효율성`에 대한 내용으로 기입