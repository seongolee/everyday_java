package baekjoon.level2;

import java.util.Scanner;

// 오븐 시계
public class P2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String timeInput = sc.nextLine();
        String[] time = timeInput.split(" ");
        int minuteInput = sc.nextInt();
        int hour, minute;

        sc.close();

        hour = Integer.parseInt(time[0]); // 시간
        minute = Integer.parseInt(time[1]); // 분

        // 분으로 입력 받은 시간을 분에 모두 더한뒤 계산
        minute += minuteInput;
        // 시간은 24시간을 넘을 수 없고 24의 나머지 값으로 처리 한다.
        hour = (minute / 60 + hour) % 24;
        // 60분을 넘을 수 없기 때문에 60의 나머지 값으로 처리 한다.
        minute = minute % 60;

        System.out.println(hour + " " + minute);

    }
}
