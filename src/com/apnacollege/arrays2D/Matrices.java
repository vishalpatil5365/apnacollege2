package com.apnacollege.arrays2D;
import java.util.*;

//**********2D arrays********************************************************************************
public class Matrices {
	/*
//*************Function For Search the key********************************************************************************
	public static boolean search(int matrix [][],int key) {
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
	     if(matrix[i][j]==key) {
	    	 System.out.println("found at cell ("+ i +" ," +j+ ")");
	    	 return true;
	     }
			}
		}
		System.out.println("key Not found");
		return false;
	}
	*/
//***************Function for Finding Largest and Smallest from array*******************************************************
	/*
public static int largest(int [][]matrix) {
	int largest=Integer.MIN_VALUE;
	int smallest=Integer.MAX_VALUE;
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) {
	if(largest < matrix[i][j]) {
		largest=matrix[i][j];
	}
	if(smallest>matrix[i][j]) {
		smallest=matrix[i][j];
	}
	
}
	}
	System.out.println(" smallest Element from array is:" +smallest);
	return largest;
	//return smallest;
	//return smallest;
}
	

	
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] [] matrix=new int[3] [3];
	int n=matrix.length, m=matrix.length;
	System.out.println("Enter elements of array");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
	System.out.print(matrix[i][j] +" ");
	}
		System.out.println(" ");
	}
	search(matrix,5);
	int Largest=largest(matrix);
	System.out.println(" Largest Element from array is:" +Largest);

}
}*/

//****************************************************************************************************************************************************************
//************************************************SPIRAL MATRIX****************************************************************************************
/*approach
 * find the boundary sides of the 2d array
 * first print top then right then bottom and last left boundary
 * then increase and decrease column and rows to print inner boundary
 * initialize the four variables with value of boundary elements 
 * */

	/*public static void printSpiral(int [][]matrix) {
		int startRow=0;
		int startColumn=0;
		int endRow=matrix.length-1;
		int endColumn=matrix[0].length-1;
		 while(startRow<=endRow && startColumn<=endColumn) {
			 //top boundary
			 for(int j=startColumn;j<=endColumn;j++) {
				 System.out.print(matrix[startRow] [j] +" ");
			 }
			 
			 //Right Boundary
			 for(int i=startRow+1;i<=endRow;i++) {
				 System.out.print(matrix[i][endColumn] +" ");
			 }
			 
			 //Bottom Boundary
			 for(int j=endColumn-1;j>=startColumn;j--) {
				 if(startRow==endRow) {
					 break;
				 }
				 System.out.print(matrix[endRow][j] +" ");
			 }
				 //left Boundary
				 for(int i=endRow-1;i>=startRow+1;i--) {
					 if(startRow==endRow) {
						 break;
					 }
					 System.out.print(matrix[i][startColumn] +" ");
			 }
			startRow++;
			endRow--;
			startColumn++;
			endColumn--;	 
		 }
		
		 System.out.println(" ");
	}
		
public static void main(String [] args) {
	int [][] matrix= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};
	printSpiral(matrix);
	
}
}*/

//*******************************DIAGONAL SUM*********************************************************************************************************
/*for primary  diagonal i==j
 * for secondary diagonal i+j==n-1
 * 
 * */
/*
	public static void diagonalSum(int [][]matrix) {
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			/*for(int j=0;j<matrix[0].length;j++) {
				if(i==j) {
					sum+=matrix[i][j];
				}
				
				else if(i+j==matrix.length-1) {
					sum+=matrix[i][j];
				}
			}
		}*/
		
		//System.out.println(sum);
	//} 
//********************************approach2********************************************************************************			
		/*sum+=matrix[i][i];
		
		sum+=matrix[i][matrix.length-1-i];
	}
		System.out.println(sum);
	}

public static void main(String[] args) {
	int [][] matrix=  {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};
	diagonalSum(matrix);
}
}
*/
//*******************search in sorted matrix******************************************************************************************************
//******************************************STAIRCASE SORTING*****************************************

	public static boolean staircaseSearch(int [][]matrix,int key) {
		int row=0;int col=matrix[0].length-1;
		while(row <matrix.length && col >=0) {
			if(matrix[row][col]==key) {
				System.out.print("Key found at ("+ row + "," + col + ")");
				return true;
			}
			
			else if(key<matrix[row][col]) {
				col--;
			}
			else {
				row++;
			}
			
		}
		System.out.println("Key not found");
		return false;
		
	}
	
	
public static void main(String[] args) {
	int[][] matrix= {{10,20,30,40},
			{15,25,35,45},
			{27,29,37,48},
			{32,33,39,50}};
	int key=33;
	staircaseSearch(matrix,key);
	
}
}
