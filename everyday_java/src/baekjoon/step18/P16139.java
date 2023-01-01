package baekjoon.step18;

import java.io.*;
import java.util.*;

// 인간-컴퓨터 상호작용
public class P16139 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();

        int[][] prefixSum = new int[str.length() + 1][26]; // 누적합을 위해 편하게 계산하기 위해 + 1

        for(int i=1; i<=str.length(); i++) {
            int index = str.charAt(i-1) - 'a'; // ascii 코드값으로 인덱스를 구분

            // 알파벳 횟수만큼 반복하면서 이전 배열의 알파벳 누적합 횟수를 저장
            for(int j=0; j<26; j++) {
                prefixSum[i][j] = prefixSum[i-1][j];
            }

            prefixSum[i][index]++; // 위에서 누적합 처리했기때문에 증가연산만 해준다.
        }

        int count = Integer.parseInt(br.readLine()); // 문제 개수
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());

            int charIndex = st.nextToken().charAt(0) - 'a'; // 알파벳 위치를 찾을 인덱스
            int startIndex = Integer.parseInt(st.nextToken()); // 범위 시작 인덱스
            int endIndex = Integer.parseInt(st.nextToken()); // 범위 마지막 인덱스

            sb.append(prefixSum[endIndex+1][charIndex] - prefixSum[startIndex][charIndex]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
