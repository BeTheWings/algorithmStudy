import java.util.ArrayList;
import java.util.Scanner;

public class problem13 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		answerList.add(arr[0]);
 		for(int i =1;i<n;i++) {
 			//System.out.println(i);
 				if(arr[i-1]<arr[i]) {
					answerList.add(arr[i]);
					
				}
 			
		}
 		for(int i =0;i<answerList.size();i++) {
 			System.out.print(answerList.get(i)+" ");
 		}

	}

}
