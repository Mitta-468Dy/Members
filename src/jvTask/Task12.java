package jvTask;

import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("得点を入力してください。");
		int[] scrbd = {0,500,1000,5000,Integer.MAX_VALUE};
		int inscr = 0;
		try {
			inscr = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(inscr < 0){
			System.out.println("点数が不適切です。");
		}
		int bonus = 0;							//ボーナス
		int type = 0;							//ボーナスのタイプ
		
		for(int i = 0 ; i < 4 ; i++){
			if(inscr >= scrbd[i] && inscr < scrbd[i+1]){
				type = i;
				break;
			}
		}
		switch(type){
		case 0:
			bonus = 20;
			break;
		case 1:
			bonus = inscr * 5 / 100;
			break;
		case 2:
			bonus = inscr * 4 / 100;
			break;
		case 3:
			bonus = inscr * 3 / 100;
			break;
		default:
			//ここには来るはずがない
		}
		
		System.out.println("ボーナス " + bonus + "点");
		System.out.println("総合結果 " + (bonus + inscr) + "点");
		
		sc.close();
		
	}
	
}
