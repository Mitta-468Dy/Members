package jvTask;

import java.util.Scanner;

//Author: Mitta Kazuki

public class Task8 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("9個の数字を入力してください。");
		System.out.println("3x3の形式で表示します。");
		System.out.println("一つの数字ごとにEnterを押してください。");
		
		int[][] vals = new int[3][3];
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				vals[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				System.out.print(String.valueOf(vals[i][j]) + " ");
			}
			System.out.print("\n");
		}
		
		sc.close();
		
	}
	
}
