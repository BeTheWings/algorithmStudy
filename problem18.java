import java.util.Scanner;

public class problem18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] intList = new int[n];
		int[] answerList = new int[n];
		for(int i =0;i<n;i++) {
			String k = sc.next();
			StringBuilder sb = new StringBuilder(k);
			intList[i] = Integer.parseInt(sb.reverse().toString());			
		}		
		int counter = 0;
		for(int i =0;i<n;i++) {
			boolean checker = chkPrime(intList[i]);
			if(checker&&intList[i]>1) {
				//1은 소수가 아니기 때문에 예외처리한다.
				answerList[counter] = intList[i];
				System.out.print(answerList[counter]+" ");
				counter++;				
			}
		}
	}

	private static boolean chkPrime(int num) {
		//소수여부를 판별하여 하나라도 나뉘어지면 false 그렇지 않으면 true를 return한다.
		for(int i =2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
