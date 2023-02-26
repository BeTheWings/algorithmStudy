import java.util.HashMap;
import java.util.Scanner;

public class problme26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*HashMap에 T는 char value 는 Integer*/
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		String s = sc.next();
			for(char x : s.toCharArray()) {
				map1.put(x, map1.getOrDefault(x, 0)+1);
				//getOrDefault x 가 있으면 x를 없으면 0을 return시키는 함수
			}			
		s = sc.next();
			for(char x : s.toCharArray()) {
				map2.put(x, map2.getOrDefault(x, 0)+1);
				//getOrDefault x 가 있으면 x를 없으면 0을 return시키는 함수
			}	
			
			String check = "YES";
			for(char x:map1.keySet()) {
				if(map1.get(x)!=map2.get(x)) {
					check = "NO";
				}				
			}
			System.out.println(check);
	}

}
