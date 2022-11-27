import java.util.Scanner;

public class problem14 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 	int[] intList = new int[n];
	 	for(int i=0;i<n;i++) {
			intList[i] = sc.nextInt();
		 }
	 	int temp = intList[0];
	 	int count = 1;
	 	for(int i =0;i<n;i++) {
	 		
	 		if(i>0) {
	 			if(intList[i]>temp) {
	 				temp = intList[i];
	 				count++;
	 			}
	 		}
	 	}	 	
	 	System.out.println(count);		
	}

}
