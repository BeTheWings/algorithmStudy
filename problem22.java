import java.util.Scanner;
 
  
public class problem22 {
  public static void main(String[] args){
   int dx[] = {-1,0,1,0};
   int dy[] = {0,1,0,-1};
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	num = num+2;
    boolean check= true;
   int matrix[][] = new int[num][num];
    int answer = 0;
   for(int i =1;i<num-1;i++){
   	for(int j =1;j<num-1;j++){
    	matrix[i][j] = sc.nextInt();
    }
   }
	   for(int i =1;i<num-1;i++){
   			for(int j =1;j<num-1;j++){
              for(int k =0;k<4;k++){
                if(matrix[i][j]>matrix[i-dx[k]][j-dy[k]]){
                 check=true;
                }else{
                  check=false;
                  break;
                  }
                    
              }
              if(check) answer++;
    }
   }
    System.out.println(answer);
  }
}