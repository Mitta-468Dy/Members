package jvTask;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		int ans = 0;
		System.out.println("入力された自然数の合計を求めます。");
		System.out.println("数値1個ごとにEnterを押してください。");
		System.out.println("終了する場合は負の数字を入力してください。");
		
		do{
			tmp = Integer.valueOf(sc.nextLine());
			if(tmp >= 0){
				//負数でなければ足す
				ans += tmp;
			}
			if(ans < 0){
				//ここに来た場合はオーバーフローしている
				System.out.println("オーバーフローしました。");
			}
		}while(tmp >= 0);
		
		System.out.println("結果は" + ans + "です。");
		
		sc.close();
	}

}
