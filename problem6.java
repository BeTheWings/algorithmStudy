import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = "";
		for(int i =0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer +=str.charAt(i);
			}
		}
		System.out.println(answer);

	}

}
