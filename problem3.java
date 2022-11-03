import java.util.ArrayList;
import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> str = new ArrayList<String>();
			for(int i =0; i<n;i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(sc.next());
				str.add(sb.reverse().toString());
			}
			for(int k = 0; k <str.size();k++) {
				System.out.println(str.get(k));
			}
		
	}

}



