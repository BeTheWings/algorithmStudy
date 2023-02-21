import java.util.Scanner;

public class problem25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i =0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int answer =solution(arr,k);
		System.out.println(answer);
	

	}

	private static int solution(int[] arr, int k) {
		int answer = 0;
		int lt = 0; int cnt = 0;
		for(int rt=0;rt<arr.length;rt++) {
			//rt  lt 가 0이면 rt++
			if(arr[rt]==0) {
				cnt++;
			}
			//역발상이 중요하다 0인경우에 cnt를 증가시키고 lt가 0이면 rt가 이미 도달했던 곳이기 때문에 반대로 0을 빼주면된다.
			while(cnt>k) {
				if(arr[lt]==0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
			System.out.println(answer);
		}
		
		return answer;
	}

}
