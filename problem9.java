import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {
		
		// 0 ~ 9 까지의 아스키코드를 알면좋음.
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int answer = 0;
		char[] charList = str.toCharArray();
		for(char c : charList) {
			
			if(c>=48 && c<=57) {
				answer = answer * 10+(c-48);
			}
			
		}
		
		System.out.println(answer);
	}

}
