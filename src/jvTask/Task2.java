package jvTask;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������𔻒肷��A�Ώۂ̐�������͂��Ă��������B");
		
		int num = 0;
		try {
			num = Integer.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (num == 0){
			System.out.println("���l��0�ł��B");
		}else{
			//�����̏�]�͕����ŕԂ����
			if(Math.abs(num % 2) == 1){
				System.out.println("���l�͊�ł��B");
			}else{
				System.out.println("���l�͋����ł��B");
			}
		}
		sc.close();
		
	}
	
}
