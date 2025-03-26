package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int cols = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // rows의 변수에 들어간 값 까지 반복문을 돌린다.
            for (int j = 1; j <= cols; j++) { // cols의 변수에 들어간 값으로 반복문 돌린다.
                System.out.print("*"); // * 모양으로 출력한다.
            }
            System.out.println(); // 안에 있는 for문이 한번 돌려졌을 때 줄바꿈을 해준다.
        }
    }
}
