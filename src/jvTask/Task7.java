package jvTask;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.println("入力された二つの数字 aとbの差を求めます。");
		System.out.println("一つ目の数字 aを入力してください。");
		try {
			a = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("二つ目の数字 bを入力してください。");
		try {
			b = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("aとbの差は " + Math.abs(a-b) + " です。");
		sc.close();
	}
	
}
