import java.util.Scanner;

public class problem19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] intList = new int[n];
		int[] answerList = new int[n];
		for(int i =0;i<n;i++) {
			intList[i] = sc.nextInt();
		}
		int point = 0;
		for(int i =0;i<n;i++) {
			if(intList[i]==0) {
				point = 0;
				answerList[i] = point;
			}else if(intList[i]==1) {
				point++;
				answerList[i] = point;
			}
		}
		int totalPoint = 0;
		for(int i =0;i<n;i++) {
			totalPoint = answerList[i] + totalPoint;
		}
		System.out.println(totalPoint);
	}
}
