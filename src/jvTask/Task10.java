package jvTask;

public class Task10 {
	
	public static void main(String[] args){
		for (int i = 0 ; i < 10 ; i++){
			for (int j = 0 ; j < 10 ; j++){
				//*
				if(i == j){
					System.out.print("*");
				}else{
					//+ -
					System.out.print(i < j ? "+" : "-");
				}
			}
			System.out.print("\n");
		}
	}
	
}
