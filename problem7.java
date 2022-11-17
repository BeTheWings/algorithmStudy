import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str = sc.next();
	    str = str.toLowerCase();
	    StringBuilder sb = new StringBuilder(str);
	    if(str.equals(sb.reverse().toString())){
	    System.out.println("YES");
	    }else{
	    System.out.println("NO");
	    }

	}

}
