import java.util.Scanner;
  
public class problem12 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String strLine = sc.next();
        String str = sc.next();
         char[] charList = strLine.toCharArray();  
        int pivot = 1000;
        int[] left = new int[100];
        int[] right = new int[100];
        int[] answer = new int[100];

        /*1. pivot을 기준으로 str과 strLine을 비교한다.*/
        /*2. 3개의 배열까지 필요 하지 않다. right배열과 answer배열의 값을 비교하여 넣어주면된다. */
        /*3. Math함수에 대해서 이해 및 공부가 필요하다.*/
        int location =0;
        for(char s : charList){
        
            if(Character.toString(s).equals(str)){                
                pivot = 0;
                left[location] = pivot;
            }else{
                pivot++;
                left[location] = pivot;
            }
            location++;
        }
        int rightLocation = strLine.length();
        for(int i =rightLocation-1; i>=0;i--){
            if(Character.toString(charList[i]).equals(str)){                
                pivot = 0;
                right[i] = pivot;
            }else{
                pivot++;
                right[i] = pivot;
            }
            location--;
        }
        /*아래의 if문 대신 Math.Min을 사용해서 코드의 길이를 줄일 수도 있다.*/
        for(int i =0;i<rightLocation;i++){
            
            if(left[i]<right[i]){
                answer[i] = left[i];
            }else {
                answer[i] = right[i];
            }
            System.out.print(answer[i]+" ");        
        }

   }
}