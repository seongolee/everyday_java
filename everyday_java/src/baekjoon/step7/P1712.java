package baekjoon.step7;

import java.util.*;

// 손익분기점
public class P1712 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int fixedCost, variableCost, laptopComputer; // 고정비용, 가변비용, 노트북가격

        fixedCost = sc.nextInt();
        variableCost = sc.nextInt();
        laptopComputer = sc.nextInt();

        // 1. n * laptopComputer = fixedCost + (variableCost * n) -> 노트북을 만드는데 드는 비용과 노트북 가격

        if(variableCost >= laptopComputer) { // 가변비용이 노트북가격보다 높거나 같으면 이익이 생길 수 없다.
            System.out.println("-1");
        } else{
            // 제품의 개수 n = (고정비용 / (노트북가격 - 가변비용)) -> 손익분기점 이므로  + 1을 해야 이익시점이 된다.
            System.out.println((fixedCost/(laptopComputer - variableCost)) + 1);
        }
    }
}
