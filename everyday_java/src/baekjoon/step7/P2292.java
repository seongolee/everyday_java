package baekjoon.step7;
import java.util.*;

// 벌집
public class P2292 {
    public static void main(String[] args) {
        // 1부터 시작해서 N 번 방까지 최소 개수의 방을 지나야한다(시작과 끝을 포함) 방은 육각형으로 이루어져있음.
        // 즉, 6의 배수로 방의 칸수를 계산할 수 있다.

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2; // 육각형의 범위 시작값을 담을 변수

        if(v == 1) {
            System.out.println(1);
        }else {
            while (range <= v) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
