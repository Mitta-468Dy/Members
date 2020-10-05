package jvTask;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を10個入力してください。");
		System.out.println("3の倍数以外を合計します。");
		
		int vals = 0;
		int tmp = 0;
		for(int i = 0 ; i < 10 ; i++){
			try{
				tmp = Integer.valueOf(sc.nextLine());
				vals += (tmp % 3 == 0 ? 0 : tmp);
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
