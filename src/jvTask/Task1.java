package jvTask;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			num = Integer.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		if (num == 0){
			System.out.println("���l��0�ł��B");
		}else{
			if(num < 0){
				System.out.println("���l�͕��̒l�ł��B");
			}else{
				System.out.println("���l�͐��̒l�ł��B");
			}
		}
		sc.close();
		
	}
	
}
