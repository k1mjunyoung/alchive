# CONTRIBUTE🔥

## 🗨️소개

본 프로젝트는 스스로 문제를 해결하고 저장소에 기여하는 자유로운 스터디입니다.

플랫폼, 난이도, 언어 종류에 상관없이 기여할 수 있으며 나와 다르게 구현한 코드를 구경👀할 수 있습니다.

다른 사람이 아직 해결하지 않은 문제가 있다면 지금 추가해보세요!

## ❗주의사항

- 가능한 **모든 라인에 주석을 작성**해주세요.
  - 주석은 코드 위쪽을 기준으로 작성해주세요.(코드를 읽고 설명할 수 있는 능력을 키우기 위해서예요!)
  ```java
  // 방향 조절 : 아래 -> 오른쪽 -> 좌측 상단 대각선 순서
  int[] dy = {1, 0, -1};
  int[] dx = {0, 1, -1};
  ```

## 📁문제 기여 방식

1. 현재 저장소를 `fork` 합니다.

2. 아래 네이밍 규칙에 맞게 패키지를 생성하고 _(이미 존재한다면 생략)_, 본인 이름의 파일에 작성해주세요.

```bash
백준 -> boj
프로그래머스 -> prg
SWEA -> swea

# SWEA bfs 1954번 문제일 경우
/bfs/swea1954_nayoung.py

# 백준 정렬 2751번 문제일 경우
/sort/boj2751_k1mjunyoung.java
```

- Java의 경우 `Javadoc`을 이용해 클래스단에 문제 이름(난이도), 시간, 메모리, 링크를 기입해주세요.

  ```java
  /**
   * 문제 이름(난이도) : 두 수의 합(LV0)
   * 시간 : 0.02ms
   * 메모리: 77MB
   * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120802
   * */
  public class boj0000_k1mjunyoung {
      public static int solution(int a, int b){
          return a + b;
      }

      public static void main(String[] args) {
          System.out.println(solution(1, 2) == 3);
      }
  }
  ```

  - 백준: 제출 페이지에서 시간 및 메모리를 확인 가능
  - 프로그래머스: `제출 후 채점하기`를 눌러서 나오는 가장 마지막 테스트 케이스의 내용을 입력
  - 정확성, 효율성 2개가 존재할 경우 `효율성`에 대한 내용으로 기입해 주세요.

3. 코드 작성이 완료되면, `commit & push`를 진행해주세요.

   ```bash
   git add .

   # 백준일 경우 브(B), 실(S), 골(G) 앞 1글자와 티어 작성
   git commit -m "[S1]BOJ2667: 단지번호붙이기"
   # 프로그래머스일 경우 문제 레벨 작성
   git commit -m "[LV3]PRG1844: 게임 맵 최단거리"

   git push origin master
   ```

## 🧾진행 현황

<center>

|        문제 유형        |     출처     | 난이도 |            제목            |                                                                                                                                   비고                                                                                                                                   |
| :---------------------: | :----------: | :----: | :------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       배열(Array)       |     SWEA     |   D3   |            View            | [링크](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV134DPqAA8CFAYh&categoryId=AV134DPqAA8CFAYh&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1&&&&&&&&&&) |
|            “            |     SWEA     |   D2   |       최빈수 구하기        | [링크](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV134DPqAA8CFAYh&categoryId=AV134DPqAA8CFAYh&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1&&&&&&&&&&) |
|   넓이 우선 탐색(BFS)   |     백준     | 실버2  |        유기농 배추         |                                                                                                               [링크](https://www.acmicpc.net/problem/1012)                                                                                                               |
|            “            |     백준     | 실버1  |         미로 탐색          |                                                                                                               [링크](https://www.acmicpc.net/problem/2178)                                                                                                               |
|            “            |     백준     | 실버1  |       단지번호붙이기       |                                                                                                               [링크](https://www.acmicpc.net/problem/2667)                                                                                                               |
|            “            | 프로그래머스 | 레벨3  |      게임 맵 최단거리      |                                                                                                  [링크](https://school.programmers.co.kr/learn/courses/30/lessons/1844)                                                                                                  |
|            “            |     SWEA     |   D2   |        달팽이 숫자         |          [링크](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=1954&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1)           |
| 브루트포스(Bruteforce)  |     백준     | 실버4  |            한수            |                                                                                                               [링크](https://www.acmicpc.net/problem/1065)                                                                                                               |
|            "            |     SWEA     |   D2   |         파리 퇴지          |                           [링크](https://swexpertacademy.com/main/code/problem/problemList.do?contestProbId=&categoryId=&categoryType=&problemTitle=2001&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1#none)                           |
| 다이나믹 프로그래밍(DP) |     백준     | 실버2  | 가장 긴 감소하는 부분 수열 |                                                                                                              [링크](https://www.acmicpc.net/problem/11722)                                                                                                               |
|            "            |     백준     | 실버3  |         2×n 타일링         |                                                                                                              [링크](https://www.acmicpc.net/problem/11726)                                                                                                               |
|            "            |     백준     | 실버4  |         설탕 배달          |                                                                                                               [링크](https://www.acmicpc.net/problem/2839)                                                                                                               |
|     그리디(Greedy)      |     백준     | 실버4  |         설탕 배달          |                                                                                                               [링크](https://www.acmicpc.net/problem/2839)                                                                                                               |
|            "            |     SWEA     |   D2   |     백만 장자 프로젝트     |          [링크](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=1859&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1)           |
|  구현(implementation)   |     백준     | 실버4  |         설탕 배달          |                                                                                                               [링크](https://www.acmicpc.net/problem/2839)                                                                                                               |
|       정렬(Sort)        |     백준     | 실버3  |        시리얼 번호         |                                                                                                               [링크](https://www.acmicpc.net/problem/1431)                                                                                                               |
|            "            |     백준     | 실버5  |       수 정렬하기 2        |                                                                                                               [링크](https://www.acmicpc.net/problem/2751)                                                                                                               |

</center>
