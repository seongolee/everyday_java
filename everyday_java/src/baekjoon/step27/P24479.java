package baekjoon.step27;

import java.io.*;
import java.util.*;

// 깊이 우선 탐색 1
public class P24479 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] seq;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        seq = new int[n+1];
        visited = new boolean[n+1];

        for(int i=0; i<n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<n+1; i++) {
            Collections.sort(graph.get(i));
        }

        seq[start] = 1;
        visited[start] = true;
        cnt = 2;
        dfs(start);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n+1; i++) {
            sb.append(seq[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int root) {
        for(int vertex : graph.get(root)) {
            if(!visited[vertex]) {
                seq[vertex] = cnt++;
                visited[vertex] = true;
                dfs(vertex);
            }
        }
    }
}
