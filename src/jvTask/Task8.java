package jvTask;

import java.util.Scanner;

//Author: Mitta Kazuki

public class Task8 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("9�̐�������͂��Ă��������B");
		System.out.println("3x3�̌`���ŕ\�����܂��B");
		System.out.println("��̐������Ƃ�Enter�������Ă��������B");
		
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
