package baekjoon.step7;

import java.util.Scanner;

// 분수 찾기
public class P1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 홀수인 경우 분자가 짝수인 경우 분모가 더 크다.

        int x = sc.nextInt();
        int i = 1, count = 0; // i : 라인을 체크, count : i 번째 라인 이전에 존재하는 분수들의 개수

        while(true){
            if(count < x && x <= i + count) {
                int temp = x - count - 1; // 라인이 바뀌고나서 몇번째 위치인지 확인하기 위한 변수
                String answer;

                if(i % 2 == 0){
                    answer = (1 + temp) + "/" + (i - temp);
                }else {
                    answer = (i - temp) + "/" + (1 + temp);
                }

                System.out.println(answer);
                break;
            }else {
                count += i;
                i++;
            }
        }
    }
}
