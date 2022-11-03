import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char cList[] = str.toCharArray();
		String world = "";
		String answer = "";

		for(char c: cList) {
			
			if(c>64&& c<91) {
				world = Character.toString(c);
				world = world.toLowerCase();
				answer +=world;
			}else if(c>96&&c<123) {
				world = Character.toString(c);
				world = world.toUpperCase();
				answer += world;
			}
		}
		System.out.println(answer);		
	}
}
