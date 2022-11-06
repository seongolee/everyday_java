package baekjoon;
import java.util.Scanner;

public class P18108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int buddhaEra = sc.nextInt(); // 불기
		int clerk = buddhaEra - 543; // 서기
		
		
		sc.close();
		
		System.out.println(clerk);
	}
}
