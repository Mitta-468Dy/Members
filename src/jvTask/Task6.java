package jvTask;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args){
		
		System.out.println("10ŒÂ‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		
		Scanner sc = new Scanner(System.in);
		int[] vals = new int[10];
		
		for(int i = 0 ; i < 10 ; i++){
			try {
				vals[i] = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("“ü—Í‡");
		for(int i = 0 ; i < 10 ; i++){
			System.out.print(String.valueOf(vals[i]) + " ");
		}
		System.out.print("\n“ü—Í‚Æ‹t‡");
		for(int i = 9 ; i >= 0 ; i--){
			System.out.print(String.valueOf(vals[i]) + " ");
		}
		
		sc.close();
		
	}
}
