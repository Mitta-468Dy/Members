package jvTask;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.valueOf(sc.nextLine());
		
		if (num == 0){
			System.out.println("数値は0です。");
		}else{
			if(num < 0){
				System.out.println("数値は負の値です。");
			}else{
				System.out.println("数値は正の値です。");
			}
		}
		sc.close();
		
	}
	
}
