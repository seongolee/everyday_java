package baekjoon.step18;

import java.io.*;
import java.util.StringTokenizer;

public class P2559 {
    public static void main(String[] args) throws Exception {
        /**
         *  누적합(prefix sum)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1]; // 누적합을 저장할 배열, 누적합 알고리즘을 사용할때 0번 인덱스를 0값으로 사용하기 때문에 +1 해준다.

        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE; // Integer 값 범위에서 제일 낮은 값을 넣는다.

        for(int i=K; i<=N; i++) {
            int rangeSum = arr[i] - arr[i-K]; // i번째 인덱스값에서 i-K를 해주어 K값의 연속된 일별로 합을 추출할 수 있다.
            max = Math.max(rangeSum, max);
        }

        System.out.println(max);
    }
}
