package jvTask;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������10���͂��Ă��������B");
		System.out.println("3�̔{���ȊO�����v���܂��B");
		
		int vals = 0;
		int tmp = 0;
		for(int i = 0 ; i < 10 ; i++){
			try{
				tmp = Integer.valueOf(sc.nextLine());
				vals += (tmp % 3 == 0 ? 0 : tmp);
			} catch (NumberFormatException e){
				System.out.println("��������͂��Ă��������B");
				i--;
				continue;
			}
		}
		
		System.out.println("���͂��ꂽ�����̍��v : " + vals);
		
		sc.close();
	}
	
}
