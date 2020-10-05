package jvTask;

public class Task9 {
	
	public static void main(String[] args){
		
		for(int i = 1 ; i <= 9 ; i++){
			for(int j = 1 ; j <= 9 ; j++){
				System.out.print(
						String.valueOf(i) + "~" +
						String.valueOf(j) + "=" + 
						String.valueOf(i*j) + " ");
			}
			System.out.print("\n");
		}
		
	}

}
