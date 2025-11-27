# Alchive: Algorithm Archive

이 저장소는 다양한 온라인 저지(Online Judge) 플랫폼에서 해결한 알고리즘 문제의 소스 코드를 저장하고 관리하기 위한 공간입니다.

## 🚀 Goal

- **체계적인 관리:** 문제들을 플랫폼, 난이도, 알고리즘 유형별로 분류하여 필요할 때 쉽게 찾아볼 수 있도록 합니다.
- **학습 기록:** 문제 해결 과정을 기록하고 복습하며 꾸준한 학습 습관을 형성합니다.
- **성장 추적:** 과거에 해결한 코드를 보며 실력 향상을 시각적으로 확인합니다.

## 💡 Usage

1.  원하는 알고리즘 유형의 디렉토리로 이동합니다.
2.  소스 코드 파일을 통해 문제 해결 방법을 확인합니다.
3.  파일 이름의 문제 번호를 참고하여 해당 온라인 저지 사이트에서 문제 설명을 찾아볼 수 있습니다.

## 📂 Structure

각 문제의 소스 코드는 주로 사용된 핵심 알고리즘 유형에 따라 분류되어 있습니다.

```
alchive/
├── bfs/           # 너비 우선 탐색
├── bruteforce/    # 브루트포스
├── conquer/       # 분할 정복
├── datastructure/ # 자료 구조
├── dfs/           # 깊이 우선 탐색
├── dp/            # 동적 프로그래밍
├── greedy/        # 그리디 알고리즘
├── implementation/  # 구현
├── sort/          # 정렬
├── string/        # 문자열
└── ...
```

각 디렉토리 내의 파일 이름은 보통 `플랫폼이름` + `문제번호` 형식(예: `BOJ1012.java`)으로 되어 있습니다.

* [BOJ (Baekjoon Online Judge)](https://www.acmicpc.net/)
* [SWEA (Samsung SW Expert Academy)](https://swexpertacademy.com)
* [PGM (Programmers)](https://programmers.co.kr/)
* [Euler (Project Euler)](https://projecteuler.net)
* ...

## 📖 Javadoc

```java
/**
 * [난이도]문제 이름 : [LV0]두 수의 합
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

## 🔗 Reference
프로그래머스 코딩테스트 문제풀이전략: 자바편
