package baekjoon.step6;

import java.util.*;

// 크로아티아 알파벳
public class P2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = sc.nextLine();

        for(String alphabet : croatiaAlphabet){
            if(s.contains(alphabet)){   // 문자열에 croatia 알파벳이 있는지 확인
                s = s.replaceAll(alphabet, "0"); // croatia 알파벳을 0으로 변환
            }
        }

        System.out.println(s.length());

    }
}
