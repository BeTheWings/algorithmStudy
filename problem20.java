import java.util.Scanner;

public class problem20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] intList = new int[n];
		int[] answerList = new int[n];
		for(int i =0;i<n;i++) {
			intList[i] = sc.nextInt();
		}

		
			for(int i =0;i<n;i++) {		
				int rank = 1;
				for(int j=0;j<n;j++) {
					if(intList[i]<intList[j]) {
						rank++;
					}
				}
				answerList[i] = rank;
				System.out.print(answerList[i]+" ");
			}
		}
	}