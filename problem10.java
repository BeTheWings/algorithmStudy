import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	    String str = sc.next();	
          /*해당 문제에 대한 회고*/
	     // 1. answer = ansqwer + 값 + 값으로 작성을 하였지만 이렇게 하기보다는 answer += 값;을 활용하면 조금더 깔끔할 것 같다.
	     // 2. 강사님은 뒤에 빈칸을 추가함으로써 이 알고리즘을 멈추었지만 나는 거기까지 생각하지 못하였고 결국 글자의 길이-1 과 i가 같으면 답을 추가하게 했다
	     // 나는 tmp라는 빈 String을 사용하였지만 강사님은 현재 값과 다음값을 비교하여 작업을 완료하셨다.
	    //나는 toString을 사용하였지만 강사님은 valueOf를 사용하였는데 두 차이는 toString은 NullPointException을 발생시킬 수 있지만 valueOf는 null인경우 null을 반환시킵니다.
		char[] charList =str.toCharArray();
	      int count = 1;
	      String answer ="";
	      String tmp = "";
	      for( int i =0;i<str.length();i++){
	    	  if(i == 0) {
	    		  tmp = Character.toString(charList[0]);
	    	  }else if(tmp.equals(Character.toString(charList[i]))) {
	    		  count++;
	    		  if(i == str.length()-1) {
	    			  answer = answer + tmp + count;
	    		  }
	    	  }else {
	    		  if(count != 1) {	    			  
    	    		  answer = answer + tmp + count; 	    		  
    			  }else {
    				  answer = answer + tmp;
    			  }
	    		  tmp = Character.toString(charList[i]);
    			  count = 1;
	    	  }
	      }
	      System.out.print(answer);

	}

}
