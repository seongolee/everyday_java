package baekjoon.level2;

import java.util.Scanner;

// 주사위 세개
public class P2480 {
    public static void main(String[] args) {
        // 1. 배열을 주사위 눈범위만큼의 크기로 만들고 거기에 숫자를 카운트한다.
        // 2. 배열의 값이 0은 무시 한다.
        // 3. 배열의 값이 1이상이면 값을 비교해서 큰 값으로 계산 처리
        Scanner sc = new Scanner(System.in);

        // 주사위 나온 값의 카운팅을 해야 하기 때문에 Map이나 배열을 사용해야 편리하게 풀 수 있을 것 같다.
        int[] dice = new int[7];
        // 반복되는 주사위 중 가장 큰 값을 저장하기 위한 변수,
        // 만드는 이유는 큰 값을 저장하는 변수를 미리 선언해서 저장해 놓지 않으면 가장 많이 Count 된 값을 Dice 배열을 전부 돌아야 한다.
        int maxCountDice = 0;

        String[] inputValue = sc.nextLine().split(" ");

        for (String s : inputValue) {
            int temp = Integer.parseInt(s);

            dice[temp] += 1;

            // 카운트 값을 비교해서 더 많이 카운트 된 주사위 눈의 숫자를 저장해놓는다.
            if (dice[temp] > dice[maxCountDice])
                maxCountDice = temp;
            else if (dice[temp] == dice[maxCountDice])
                maxCountDice = Math.max(temp, maxCountDice);
        }

        if(dice[maxCountDice] == 1)
            System.out.println(maxCountDice * 100);
        else{
            int t = (int)Math.pow(10, dice[maxCountDice]);
            System.out.println((t * 10) + maxCountDice * t);
        }
    }
}
