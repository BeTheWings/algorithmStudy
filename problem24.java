import java.util.Scanner;

public class problem24 {
    //인텔리제이는 pvsm + tab을 누르면 main형식을 만들어준다.
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int num =sc.nextInt();
            int maxSum = num;
            num = num / 2 +1;
            int numList[] = new int[num];
            for(int i =0;i<num;i++){
                numList[i] = i+1;
            }
            int lt = 0;
            int answer = 0;
            int sum = 0;
           for(int rt =0;rt<num;rt++) {
            	sum +=numList[rt];
            	if(sum==maxSum) answer++;
            	while(sum>=maxSum) {
            		sum -=numList[lt++];
            		if(sum==maxSum) answer++;
            	}
            	
            	
            }
            System.out.println(answer);

    }
}
