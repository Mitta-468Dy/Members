package jvTask;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������10���͂��Ă��������B");
		
		int vals = 0;
		for(int i = 0 ; i < 10 ; i++){
			try{
				vals += Integer.valueOf(sc.nextLine());
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
