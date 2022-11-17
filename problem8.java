import java.util.Scanner;

public class problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "NO";
		//^는 부정을 의미하며 A-Z를 제외한 나머지의 값을 공백으로 바꾸는 정규식이다.
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp  = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer = "YES";
		}
		
		System.out.println(answer);
	}

}
