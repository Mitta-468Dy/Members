package jvTask;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		int ans = 0;
		System.out.println("���͂��ꂽ���R���̍��v�����߂܂��B");
		System.out.println("���l1���Ƃ�Enter�������Ă��������B");
		System.out.println("�I������ꍇ�͕��̐�������͂��Ă��������B");
		
		do{
			tmp = Integer.valueOf(sc.nextLine());
			if(tmp >= 0){
				//�����łȂ���Α���
				ans += tmp;
			}
			if(ans < 0){
				//�����ɗ����ꍇ�̓I�[�o�[�t���[���Ă���
				System.out.println("�I�[�o�[�t���[���܂����B");
			}
		}while(tmp >= 0);
		
		System.out.println("���ʂ�" + ans + "�ł��B");
		
		sc.close();
	}

}
