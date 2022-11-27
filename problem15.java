import java.util.Scanner;

public class problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int[] aList = new int[num];
		int[] bList = new int[num];
		String[] resultList = new String[num];

		for(int i =0;i<num;i++) {
			aList[i] = sc.nextInt();
		}
		for(int i =0;i<num;i++) {
			bList[i] = sc.nextInt();
		}
		for(int i =0;i<num;i++) {
			if(aList[i] == bList[i]) {
				resultList[i] = "D";
			}else if(aList[i] == 2 && bList[i] ==1) {
				resultList[i] = "A";
			}else if(aList[i] == 3 && bList[i] ==2) {
				resultList[i] = "A";
			}else if(aList[i] == 1 && bList[i] ==3) {
				resultList[i] = "A";
			}else {
				resultList[i] = "B";
			}
			System.out.println(resultList[i]);
		}
		

	}

}
