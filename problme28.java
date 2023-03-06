import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problme28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int arr[] = new int[n];
		/*HashMap에 T는 char value 는 Integer*/

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<s-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			//없으면 0 을 return하고 1을 더해라
		}
		int lt = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int rt=s-1;rt<n;rt++) {
			
			map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		for(int i =0;i<answer.size();i++) {
			System.out.print(answer.get(i)+" ");
				
		}
		
	}

}
