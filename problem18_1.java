import java.util.Scanner;

public class problem18_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] intList = new int[n];
		int[] answerList = new int[n];
		for(int i =0;i<n;i++) {
			intList[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			int tmp = intList[i];
			int res = 0;
			while(tmp >0) {
				int t = tmp %10;
				res = res*10+t;
				tmp  = tmp/10;			
			}
			for(int j =2;j<res;j++) {
				if(res%j != 0) {
					answerList[i] = res;
				}
			}
			System.out.print(answerList[i]+" ");
		}
	}

}
