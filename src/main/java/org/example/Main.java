package org.example;

public class Main {
    public static void main(String[] args) {
        // 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다.
        int n = 10;
        int f = 0;
        int s = 1;

        for (int i = 1; i <= n; ++i) { // n 변수인 10을 넣고 10번 돌리는데 1증가를 먼저 하고 돌린다.
            System.out.print(f + " "); // 공백 있는 상태로 f를 출력

            int next = f + s; // int next라는 변수에 f값과 s값을 더해서 넣는다.
            f = s; // f에 s값을 넣는다.
            s = next; // s에 f+s를 넣은 next 값을 넣는다.
        }
    }
}
