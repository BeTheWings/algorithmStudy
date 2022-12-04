import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		//+1을 해야 n번까지 숫자가 생성된다
		int primeList[] = new int[n+1];
		for(int i =2;i<=n;i++) {
		//기본적으로 int형은 0 으로 초기화가 된다.
			if(primeList[i]==0) {
				//0인경우 answer의 갯수를 ++한다.
				//따라서 2 -> 0 1
				//따라서 3 -> 0 2
				//따라서 4 -> 1 2
				//따라서 5 -> 0 3
				//따라서 6 -> 1 3
				//따라서 7 -> 0 4
				//따라서 8 -> 1 4
				//따라서 9 -> 1 4
				//따라서 10 -> 1 4
				//따라서 11 -> 0 5
				//이렇게 순차적으로 검사를 하면서 카운팅을 하게된다는 이론이다.0
				answer++;
				//j <-2부터 시작해서  3의 배수에 1
				//j <-3부터 시작해서  4의 배수에 1 
				//j <-4부터 시작해서  5의 배수에 1
				//을 넣어서 1인 경우 pass 0 인경우 ++를 하게 설정을 한다.
				for(int j=i;j<=n;j=j+i) {

					primeList[j] = 1;
				}
			}
		}
		System.out.println(answer);
	}

}
