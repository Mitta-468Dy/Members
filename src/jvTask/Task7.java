package jvTask;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.println("���͂��ꂽ��̐��� a��b�̍������߂܂��B");
		System.out.println("��ڂ̐��� a����͂��Ă��������B");
		try {
			a = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��ڂ̐��� b����͂��Ă��������B");
		try {
			b = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("a��b�̍��� " + Math.abs(a-b) + " �ł��B");
		sc.close();
	}
	
}
