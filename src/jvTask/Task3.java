package jvTask;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("”š‚ğ10ŒÂ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		
		int vals = 0;
		for(int i = 0 ; i < 10 ; i++){
			try{
				vals += Integer.valueOf(sc.nextLine());
			} catch (NumberFormatException e){
				System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
				i--;
				continue;
			}
		}
		
		System.out.println("“ü—Í‚³‚ê‚½”š‚Ì‡Œv : " + vals);
		
		sc.close();
	}

}
