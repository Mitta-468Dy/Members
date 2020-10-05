package jvTask;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を10個入力してください。");
		
		int vals = 0;
		for(int i = 0 ; i < 10 ; i++){
			try{
				vals += Integer.valueOf(sc.nextLine());
			} catch (NumberFormatException e){
				System.out.println("数字を入力してください。");
				i--;
				continue;
			}
		}
		
		System.out.println("入力された数字の合計 : " + vals);
		
		sc.close();
	}

}
