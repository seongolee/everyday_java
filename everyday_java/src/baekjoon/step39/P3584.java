package baekjoon.step39;

import java.util.*;
import java.io.*;

//가장 가까운 공통 조상
public class P3584 {
    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine()); // test 횟수
        int count;

        for(int i=0; i<test; i++){
            count = Integer.parseInt(br.readLine());
            parent = new int[count + 1];
            int temp = 0;
            for(int j = 0; j < count-1; j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                parent[end] = start;
            }

            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            Stack<Integer> list1 = rootCheck(num1);
            Stack<Integer> list2 = rootCheck(num2);

            while(!(list1.isEmpty() || list2.isEmpty())){
                int temp1 = list1.pop();
                int temp2 = list2.pop();

                if(temp1 != temp2) break;

                temp = temp1;
            }
            sb.append(temp).append("\n");
        }

        System.out.println(sb.toString());
    }

    // 최상위 루트 노드찾기
    public static Stack<Integer> rootCheck(int num) {
        Stack<Integer> list = new Stack<>();
        list.push(num);
        while(parent[num] != 0) {
            list.push(parent[num]);
            num = parent[num];
        }
        return list;
    }
}
