package jvTask;

import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���_����͂��Ă��������B");
		int[] scrbd = {0,500,1000,5000,Integer.MAX_VALUE};
		int inscr = 0;
		try {
			inscr = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(inscr < 0){
			System.out.println("�_�����s�K�؂ł��B");
		}
		int bonus = 0;							//�{�[�i�X
		int type = 0;							//�{�[�i�X�̃^�C�v
		
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
			//�����ɂ͗���͂����Ȃ�
		}
		
		System.out.println("�{�[�i�X " + bonus + "�_");
		System.out.println("�������� " + (bonus + inscr) + "�_");
		
		sc.close();
		
	}
	
}
