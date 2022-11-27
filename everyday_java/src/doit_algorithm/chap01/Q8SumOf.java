package doit_algorithm.chap01;

import java.util.Scanner;

public class Q8SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("정수 a와 b를 포함하여 그 사이의 정수의 합을 구합니다. ");
        System.out.print("a와 b의 값을 순서대로 입력해주세요 : ");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("두 수를 포함하여 그 사이의 정수의 합은 : " + sumOf(a, b) + "입니다. ");
    }

    static int sumOf(int a, int b){
        int sum = 0;

        // a값이 b값 보다 큰 경우 자리를 바꾸어준다.
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for(;a<=b;a++){
            sum += a;
        }

        return sum;
    }
}
