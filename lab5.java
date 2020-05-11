import java.util.Scanner;
//Tyler Hernandez
public class lab5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length: ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {//The user will enter (length) amount of integers
			System.out.println("Array Element " + (i+1) + ":");
			arr[i] = scan.nextInt();
		}//ends for
		System.out.println(findLocalMinima(arr) + " is the index at which the minima occurs");
		
		double[][] arrA = new double[3][3];
		double[][] arrB = new double[3][3];
		System.out.println("Please enter your first 3x3 matrix");
		for(int i=0; i<3; i++) {//the user will input the 2d array inside these for loops
			for (int x=0; x<3; x++) {
				arrA[i][x]= scan.nextDouble();
			}// ends x for
		}//ends i for
		
		System.out.println("Please enter your second 3x3 matrix");
		for(int i=0; i<3; i++) {//the user will input the 2d array inside these for loops
			for (int x=0; x<3; x++) {
				arrB[i][x]= scan.nextDouble();
			}// ends x for
		}//ends i for
		
		print(multiplyMatrix(arrA, arrB));
		
	}//ends main
	
	
	public static int findLocalMinima(int[] a) {
		int minimum= a[0];
		int index=0;
		for (int i=1; i<a.length; i++) {
			if (minimum > a[i]) {
				minimum = a[i];
				index=i;
			}//ends if
		}//ends for
		return index;
	}//ends func
	
	/*
	 * 1   2   3 | 0     2      4 		\ 5.3	23.9	24
	 * 4   5   6 | 1    4.5   2.2  = 	\11.6	56.3	58.2
	 * 7   8   9 | 1.1  4.3   5.2		\17.9	88.7	92.4
	 */
	
	/*																			4    + 4.4 + 15.6
	 * a   b   c | 1     2      3 		\(a*1 + b*4 + c*7) 	(a*2 + b*5 + c*8) 	(a*3 + b*6 + c*9)
	 * d   e   f | 4     5   	6  = 	\11.6	56.3	58.2
	 * g   h   i | 7  	 8   	9		\17.9	88.7	92.4
	 */
	
	/*	Array a	 					|  Array b																		
	 * a[0][0]   a[0][1]   a[0][2] 	| b[0][0]   b[0][1]   b[0][2] 	 \(a[0][0]*b[0][0] + a[0][1]*b[1][0] + a[0][2] * b[2][0]) 	(a*2 + b*5 + c*8) 	(a*3 + b*6 + c*9)
	 * a[1][0]   a[1][1]   a[1][2] 	| b[1][0]   b[1][1]   b[1][2]  = \11.6	56.3	58.2
	 * a[2][0]   a[2][1]   a[2][2]	| b[2][0]   b[2][1]   b[2][2]    \17.9	88.7	92.4
	 */
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double [][] c = new double[3][3];
//		
//		c[0][0]= (a[0][0] * b[0][0]) + (a[0][x+1] * b[x+1][0]) + (a[0][x+2] * b[x+2][0]);
//		c[0][1]= (a[0][0] * b[0][1]) + (a[0][x] * b[1][1]) + (a[0][2] * b[2][1]);
//		c[0][2]= (a[0][0] * b[0][2]) + (a[0][1] * b[1][2]) + (a[0][2] * b[2][2]);
//		
//		c[1][0]= (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0]);
//		c[1][1]= (a[0][1] * b[0][0]) + (a[0][1] * b[1][1]) + (a[0][2] * b[2][1]);
//		c[1][2]= (a[0][2] * b[0][0]) + (a[0][1] * b[1][2]) + (a[0][2] * b[2][2]);
//		
//		c[2][0]= (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0]);
//		c[2][1]= (a[0][0] * b[0][1]) + (a[0][1] * b[1][1]) + (a[0][2] * b[2][1]);
//		c[2][2]= (a[0][0] * b[0][2]) + (a[0][1] * b[1][2]) + (a[0][2] * b[2][2]);
		
		for(int i=0;i<3;i++){  
			for(int x=0;x<3;x++){    
				c[i][x]=0;      
				for(int z=0;z<3;z++){      
					c[i][x]+=a[i][z]*b[z][x];      
					}//ends z
				}//ends x loop     
			} //ends i 
		return c;
	}//ends multiplyMatrix
	
	public static void print(double [][] arr) {
		for(int i=0; i<3; i++) {//the user will input the 2d array inside these for loops
			for (int x=0; x<3; x++) {
				System.out.print(arr[i][x] + ", ");
			}// ends x for
			System.out.println();
		}//ends i for
	}

}//ends class
