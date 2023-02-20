import java.util.Scanner;

public class problem24_1 {
    //인텔리제이는 pvsm + tab을 누르면 main형식을 만들어준다.
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int num =sc.nextInt();
            int answer = 0;
            int cnt = 1;
            
            num--;
            while(num>0) {
            	cnt++;
            	if(num%cnt==0) answer++;
            }
            System.out.println(answer);

    }
}
