import java.util.ArrayList;
import java.util.Scanner;

public class problem16 {

	public static void main(String[] args) {
		
		// 피보나치 수열 i-1 + i-2 = 다음 숫자가 되어야함.
		//0과 1번째의 리스트는 1로 시작한다는 가정하에 시작
		//arrayList버전
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> pivotList = new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
				if(i>=2&&i<=44) {
					pivotList.add(i,pivotList.get(i-2)+pivotList.get(i-1));
				}else {
					pivotList.add(1);
				}
		}
		System.out.println(pivotList);

	}
}