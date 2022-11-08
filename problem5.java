import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charList = str.toCharArray();
		
		int lt = 0;
		int rt = charList.length-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(charList[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(charList[rt])) {
				rt--;
			}else {
				char temp = charList[lt];
				charList[lt] = charList[rt];
				charList[rt] = temp;
				rt--;
				lt++;
			}
		}
		System.out.println(charList);
	}

}
