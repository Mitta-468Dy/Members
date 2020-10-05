package jvTask;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("奇数か偶数かを判定する、対象の数字を入力してください。");
		
		int num = 0;
		try {
			num = Integer.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (num == 0){
			System.out.println("数値は0です。");
		}else{
			//負数の剰余は負数で返される
			if(Math.abs(num % 2) == 1){
				System.out.println("数値は奇数です。");
			}else{
				System.out.println("数値は偶数です。");
			}
		}
		sc.close();
		
	}
	
}
