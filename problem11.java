import java.util.Scanner;

public class problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int counter = sc.nextInt();	
		String str = sc.next();
		
		
		String tmp = "";
		String answer ="";
		//단어의 갯수
		/*문자는 7개 단위로 끈키게 된다*/
		
		/*1. valueof를 통해서 각 진수들을 10진수로 변환 할 수 있다.
		 *  valueof대신 parseInt를 사용해도 된다.
		 * 
		 * */
		/*subString을 통해서 문장을 끈을 수 있다.*/
		int start = 0;
		int end = 7;
		String binary = "";
	
		for(int i =0; i<counter;i++) {			
			tmp = str.substring(start, end);	
			/*tmp = str.substring(start, end).replace("#","1").replace("*","0");*/
			/*아래 처럼 for문을 통해서 해도 되지만.... replace를 이용하여 # 은 1로 *은 0으로 변환시켜도 된다.*/
			for(char c : tmp.toCharArray()) {		
				if(Character.toString(c).equals("#")) {
					binary += "1";					
				}else {
					binary += "0";					
				}		
			}
			binary = Integer.toString(Integer.valueOf(binary,2));		
			char c = (char) Integer.parseInt(binary);
			answer += Character.toString(c);
			binary="";
			/*이 과정은 tmp = str.subString(7); 로 줄일 수 있다.*/
			start = end;
			end = start + 7;	
			/**/
		}
		System.out.println(answer);
	}

}
