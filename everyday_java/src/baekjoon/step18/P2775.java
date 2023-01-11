package baekjoon.step18;

import java.util.*;
import java.io.*;

// 부녀회장이 될테야
public class P2775 {
    public static void main(String[] args) throws IOException {
        // 제한 1 <= k, n <= 14 // T: Test Case, k: 층, n: 호
        // 누적합을 사용해서 미리 제한된 크기의 배열을 만들어 놓아 사용한다.

        int[][] arr = new int[15][15]; // 누적합을 사용하기 위해 최대 크기인 14에 1을 더해서 만들어 놓고 사용, [행][열]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<arr.length; i++) {
            arr[0][i] = i;
        }

        // 누적합
        for(int i=1; i<arr.length; i++) { // 행
            for(int j=1; j<arr.length; j++) { //열
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            sb.append(arr[k][n]).append("\n");
        }

        System.out.println(sb);
    }
}
