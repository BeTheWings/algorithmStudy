import java.util.HashMap;
import java.util.Scanner;

public class problme27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		/*HashMap에 T는 char value 는 Integer*/
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
			//getOrDefault x 가 있으면 x를 없으면 0을 return시키는 함수
		}
		System.out.println(map.containsKey('A'));
		int answer = Integer.MIN_VALUE;
		char c = 0;
		for(char x :map.keySet()) {
			if(answer<map.get(x)) {
				answer = map.get(x);
				c = x;
			}
		}
		System.out.println(c);

		
	}

}
