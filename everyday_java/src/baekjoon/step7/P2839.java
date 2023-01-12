package baekjoon.step7;

import java.util.*;
import java.io.*;

// 설탕 배달
public class P2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        // 4와 7은 5와 3으로 나누어 떨어질 수 없기때문에 미리 처리해주고 나머지들의 값에 대해선 분기처리한다.
        // 나머지 1의 경우 +1, 나머지 2의 경우 12-> +2 나머지 3의 경우 +1 -> 나머지 4의 경우 +2

        if((N == 4) || (N == 7)) {
            answer = -1;
        }else if(N%5 == 0) {
            answer = N/5;
        }else if((N%5 == 1) || (N%5 == 3)) {
            answer = (N/5) + 1;
        }else if((N%5 == 2) || (N%5 == 4)) {
            answer = (N/5) + 2;
        }

        System.out.println(answer);
    }
}
