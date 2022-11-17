import java.util.Scanner;

public class problem9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charList = str.toCharArray();
		String answer = "";
		for(char c : charList) {
			if(Character.isDigit(c)) {
				answer += Character.toString(c);
			}
		}
		//parseInt하면 맨 앞의 0이 사라진다.
		System.out.println(Integer.parseInt(answer));
	}

}
