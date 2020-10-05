package jvTask;

import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args){
		
		System.out.println("10個の数字を入力してください。");
		System.out.println("最大値と最小値を表示します。");
		System.out.println("一つの数字ごとにEnterを押してください。");
		
		Scanner sc = new Scanner(System.in);
		
		int mx = Integer.MIN_VALUE;				//最大値は極めて小さい数値で初期化
		int mn = Integer.MAX_VALUE;				//最小値は極めて大きい数値で初期化
		int tmp = 0;
		
		for(int i = 0 ; i < 10 ; i++){
			tmp = sc.nextInt();
			mx = mx < tmp ? tmp : mx;
			mn = mn > tmp ? tmp : mn;
		}
		
		System.out.println("最大値は " + mx + " でした。");
		System.out.println("最小値は " + mn + " でした。");
		
		sc.close();
		
	}

}
