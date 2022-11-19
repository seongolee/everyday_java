package baekjoon.step1;
import java.util.Scanner;

//킹, 퀸, 룩, 비숍, 나이트,  
public class P3003 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final int[] standardChessBoard = {1, 1, 2, 2, 2, 8}; // chess board default setting
	String chessBoard = "";
	
	String input = sc.nextLine();
	String[] inputArr = input.split(" ");
	
	sc.close();
	
	for(int i = 0; i<standardChessBoard.length; i++) {
		String temp = String.valueOf(standardChessBoard[i] - Integer.parseInt(inputArr[i]));
		chessBoard += (i == standardChessBoard.length - 1) ? temp : temp + " "; 
	}	
	
	System.out.println(chessBoard);
	
	}
}
