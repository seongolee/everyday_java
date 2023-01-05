package baekjoon.step27;

import java.util.*;
import java.io.*;

public class P24444 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] seq;
    static int cnt = 1;
    static LinkedList<Integer> queue;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();  // 간선 저장
        visited = new boolean[a+1]; // 방문 체크
        seq = new int[a+1]; // 순서 저장
        queue = new LinkedList<>();

        // 간선 저장할 수 있는 공간
        for(int i=0; i<a+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<b; i++) {
            st = new StringTokenizer(br.readLine());
            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());

            graph.get(tempA).add(tempB);
            graph.get(tempB).add(tempA);
        }

        for(int i=1; i<a+1; i++) {
            Collections.sort(graph.get(i));
        }

        bfs(start);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<a+1; i++) {
            sb.append(seq[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int root) {
        // 시작 정점 방문처리 및 순서 등록
        visited[root] = true;
        seq[root] = cnt++;
        queue.add(root);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int vertex : graph.get(temp)) {
                if(!visited[vertex]) {
                    visited[vertex] = true;
                    seq[vertex] = cnt++;
                    queue.add(vertex);
                }
            }
        }
    }
}
