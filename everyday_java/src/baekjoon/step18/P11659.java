package baekjoon.step18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 4
public class P11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] numbers = new int[size+1]; // 문제에서 범위를 1부터 사용하기때문에 + 1 해서 처리한다.

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=size; i++) {
            numbers[i] = numbers[i-1] + Integer.parseInt(st.nextToken()); // index 1 부터 누적합을 저장한다.
        }

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken()); // 시작 index
            int k = Integer.parseInt(st.nextToken()); // 끝 index

            sb.append(numbers[k] - numbers[j-1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
