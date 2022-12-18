package baekjoon.step7;

import java.io.*;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다
public class P2869 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int stick = Integer.parseInt(st.nextToken());
        int answer = stick - up;

        // stick의 길이에서 up의 길이를 빼준다. 도달했을때는 막대에서 미끌어지지 않는다는 조건이 있다. 이 조건은
        // stick 길이에서 up을 빼주면 조건을 만족한다, 이유 : stick 길이에 도달했을때는 미끌어지지 않기때문이다.

        int temp = (answer / (up - down)) + 1; // stick - up 을 했기때문에 + 1 처리
        temp = answer % (up - down) != 0 ? temp + 1 : temp; // 막대의 길이가 남아있는지 확인해서 처리

        System.out.println(temp);
    }
}
