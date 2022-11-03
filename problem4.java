import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		/*it is time to study*/
		String[] strList = str.split(" ");
		int size1 = 0;
		int location = 0;
		for(int i =0;i<strList.length;i++) {
			System.out.println("string : "+strList[i]);
				if(size1 < strList[i].length()) {
					size1 = strList[i].length();
					System.out.println("size"+size1);
					location = i;
				}
		}
		System.out.println(strList[location]);
		
	}

}



