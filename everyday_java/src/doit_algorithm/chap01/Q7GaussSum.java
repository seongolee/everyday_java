package doit_algorithm.chap01;

import java.util.Scanner;

// 가우스의 덧셈
public class Q7GaussSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("1부터 n까지 정수의 합을 구합니다. ");
        System.out.print("n값을 입력해주세요 : ");
        n = sc.nextInt();

        System.out.println("1부터 n까지 정수의 합은 : " + gaussSum(n) + "입니다. ");
    }

    static int gaussSum(int n){
        return n * (n+1) / 2;
    }
}
