import java.util.Scanner;

public class problem20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n+2;
		int[][] matrix = new int[n][n];
		for(int i  =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				//5 3 7 2 3 3 7 1 6 1 7 2 5 3 4 4 3 6 4 1 8 7 3 5 2
				if(i==0 || i==n-1) {
					matrix[i][j] = 0;
				}else if(j==0|| j==n-1){
				
					matrix[j][i] = 0;					
				}else {					
					matrix[i][j] = sc.nextInt();
				}
			}
			
		}

		int k =0;
		int counter = 0;
		for(int i =1;i<n;i++) {
			for( int j = k+1;j<k+2;j++) {
				/*
				 *        0000
				 * 		  0110	
				 *        0110
				 *        0000
				 * */
				
				// math 
				if(j<n-1) {				
					if(matrix[i][j]>matrix[i-1][j]) {
						System.out.println(matrix[i][j]);
						counter++;
					}else if(matrix[i][j]>matrix[i+1][j]) {
						System.out.println(matrix[i][j]);
						counter++;					
					}else if(matrix[i][j]>matrix[i][j-1]) {
						System.out.println(matrix[i][j]);
						counter++;
					}else if(matrix[i][j]>matrix[i][j+1]) {
						System.out.println(matrix[i][j]);
						counter++;
					}
				}
			}
			k = i+2;
			System.out.println();
		}
		
		System.out.println("counter"+counter);
	/*	for(int i  =0;i<n;i++) {
			for(int j =0;j<n;j++) {				
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
*/
	}
		}