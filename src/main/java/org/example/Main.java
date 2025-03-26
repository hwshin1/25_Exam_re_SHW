package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
        // 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = sc.nextInt(); // n = 5를 넣어본다

        for (int i = n; i >= 1; i--) { // 역순으로 n번까지 돌린다.
            for (int j = n + 1; j >= (i*2) - 2; j-=2) { // -2씩 감소함 i가 for문을 돌아 순차적으로 감소
                System.out.print(" "); // 공백이 2개 생성됨
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k); // 숫자 역순으로 출력 각 숫자 왼쪽에 공백도 추가
            }
            System.out.println(); // 안에 있는 for문이 한번 돌려졌을 때 줄바꿈을 해준다.
        }
    }
}
