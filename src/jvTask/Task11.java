package jvTask;

import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args){
		
		System.out.println("10�̐�������͂��Ă��������B");
		System.out.println("�ő�l�ƍŏ��l��\�����܂��B");
		System.out.println("��̐������Ƃ�Enter�������Ă��������B");
		
		Scanner sc = new Scanner(System.in);
		
		int mx = Integer.MIN_VALUE;				//�ő�l�͋ɂ߂ď��������l�ŏ�����
		int mn = Integer.MAX_VALUE;				//�ŏ��l�͋ɂ߂đ傫�����l�ŏ�����
		int tmp = 0;
		
		for(int i = 0 ; i < 10 ; i++){
			tmp = sc.nextInt();
			mx = mx < tmp ? tmp : mx;
			mn = mn > tmp ? tmp : mn;
		}
		
		System.out.println("�ő�l�� " + mx + " �ł����B");
		System.out.println("�ŏ��l�� " + mn + " �ł����B");
		
		sc.close();
		
	}

}
