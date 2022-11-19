package baekjoon.step6;

import java.util.*;

// 그룹 단어 체커
public class P1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sSize = Integer.parseInt(sc.nextLine());    // 단어의 개수
        String[] s = new String[sSize];
        int groupWordCount = 0;

        // 단어 저장를 s 배열에 저장
        for(int i = 0; i<sSize; i++){
            s[i] = sc.nextLine();
        }

        for(String temp : s){
            if(isGroupWord(temp))
                groupWordCount++;
        }

        System.out.println(groupWordCount);
    }

    static Boolean isGroupWord(String s){
        Map<Character, Boolean> groupWord = new HashMap<>();
        char temp = s.charAt(0); // 첫번째 문자를 temp 저장

        for(char c : s.toCharArray()){
            if(temp != c){
                temp = c;
                if(groupWord.containsKey(c)){   // 문자가 존재하는지 확인
                    return false;
                }else {
                    groupWord.put(c, true);
                }
            }
        }

        return true;
    }
}
