import java.util.ArrayList;
import java.util.Scanner;

public class problem23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input값
		int num = sc.nextInt();
		int a[] = new int[num];
		for(int i =0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		int size = num;
		num = sc.nextInt();
		int b[] = new int[num];
		size = num + size;
		for(int i =0;i<num;i++) {
			b[i] = sc.nextInt();
		}
		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(p1<a.length&&p2<b.length) {
			if(a[p1]<b[p2]) {
				//앞에 ++ 전위 증감 뒤에 ++ 후위 증감 연산자 . 앞에 있으면 먼저 ++ 이고 뒤에 있으면 후에 ++이 된다.
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}

		while(p1<a.length) {
			answer.add(a[p1++]);
		}
		
		while(p2<b.length) {
			answer.add(b[p2++]);
		}
		
		for(int i =0;i<answer.size();i++) {
			System.out.print(answer.get(i)+" ");
		}
			
	}

}
