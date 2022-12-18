package baekjoon.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count; i++) {
            int num = Integer.parseInt(st.nextToken());
            int temp = binarySearch(arr, num);
            sb.append(temp).append("\n");
        }

        System.out.print(sb.toString());
    }
    // 이진 탐색할때는 arr 값이 정렬이 되어있어야 한다.
    static int binarySearch(int[] arr, int key) {
        int left = 0;   // 탐색 범위의 왼쪽 끝 인덱스
        int right = arr.length-1;   // 탐색 범위의 오른쪽 끝 인덱스

        // 왼쪽 인덱스가 오른쪽 인덱스보다 커질때까지 반복
        while(left<= right) {
            int mid = (left + right) / 2; // 중간 위치를 구한다.

            // key 값이 중간 위치의 값보다 작은 경우
            if(key < arr[mid]) {
                right = mid - 1;
            }
            // key 값이 중간 위치의 값보다 큰 경우
            else if(key > arr[mid]) {
                left = mid + 1;
            }
            // key 값과 중간 위치의 값이 같은 경우
            else {
                return 1;
            }
        }

        // key 값이 존재하지 않을 경우
        return 0;
    }
}
