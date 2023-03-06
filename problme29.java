import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problme29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		ArrayList<Character>sArr = new ArrayList<Character>();	

		for(char c :first.toCharArray()) {
			sArr.add(c);
		}
		HashMap<Character, Integer> amap = new HashMap<Character, Integer>();
		
		for(char c: second.toCharArray()) {
			amap.put(c, amap.getOrDefault(c, 0)+1);
		}
		
		
		int L =second.length()-1;	
		HashMap<Character, Integer> bmap = new HashMap<Character, Integer>();
		for(int i=0;i<L;i++) {
			bmap.put(sArr.get(i), bmap.getOrDefault(sArr.get(i), 0)+1);
		}
		
		int lt =0;
		int count = 0;
		for(int rt=L; rt<sArr.size();rt++) {
			bmap.put(sArr.get(rt), bmap.getOrDefault(sArr.get(rt), 0)+1);
			if(amap.equals(bmap)) {
				count++;
			}
			bmap.put(sArr.get(lt), bmap.get(sArr.get(lt))-1);
			
			if(bmap.get(sArr.get(lt))==0) {
				bmap.remove(sArr.get(lt));
			}
			lt++;
			
		}
					
		System.out.println(count);
	}

}
