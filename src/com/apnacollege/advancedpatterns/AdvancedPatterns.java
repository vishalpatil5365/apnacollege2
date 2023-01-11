

//**********Advanced StarPatterns***********

package com.apnacollege.advancedpatterns;
import java.util.*;

public class AdvancedPatterns {
	
//********HallowRectangle***************
	
	
	/*public static void hallowRectangle(int rows,int column){
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=column;j++){
				if(i==1 || i==rows || j==1 || j==column) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
			}
			}
			System.out.println(" ");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows to be printed");
	int rows=sc.nextInt();
	System.out.println("Enter number of column to be printed");
	int column=sc.nextInt();
	hallowRectangle(rows,column);
				

}
}*/
	
	
//**********Inverted and Rotated Half Pyramid**************
	
	/*public static void invertedPyramid(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String  [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		invertedPyramid(rows);
	}
}
*/
	
//****************Inverted half pyramid with numbers*****************
	
	/*public static void invertedHalfPyramid(int rows) {
	
		for(int i=1;i<=rows;i++) {
			int a=1;
			for(int j=1;j<=rows-i+1;j++) {
				System.out.print(a);
				a++;
			}
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		invertedHalfPyramid(rows);
	}
}*/
	
	
	
	//****************FLOYD'S Triangle***************
	
	/*public static void floydsTriangle(int rows) {
		int a=1;
		for(int i=1;i<=rows;i++) {
						for(int j=1;j<=i;j++) {
				System.out.print(a+" " );
				//a++;
			}
			//System.out.print(" ");
			
			//for(int j=1;j<i;j++) {
				//System.out.print(" ");
			//}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		floydsTriangle(rows);
	}
}
*/
	
	//************0-1 Triangle***************
	/*public static void zeroOnezero(int rows) {
		int a=1;
		for(int i=1;i<=rows;i++) {
						for(int j=1;j<=i;j++) {
							if((i+j)%2==0) {
								System.out.print(" "+"0");
							}
							else {
								System.out.print(" "+"1");
							}
				//System.out.print(a+" " );
				//a++;
			}
			//System.out.print(" ");
			
			//for(int j=1;j<i;j++) {
				//System.out.print(" ");
			//}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		zeroOnezero(rows);
		
		}
		}*/
	
	
	//**************ButterflyPattern***************
	
	/*public static void butterflyPattern(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
			
				System.out.println(" ");
	}
	}
	
	/*public static void butterflyPattern2(int rows){
		for(int i=1;i<=rows;i++) {
	for(int j=1;j<=rows-i+1;j++) {
		System.out.print("*");
		}
	for(int j=1;j<=i-1;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i-1;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=rows-i+1;j++) {
		System.out.print("*");
		}
	
	System.out.println(" ");
	}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		butterflyPattern(rows);
		butterflyPattern2(rows);
	}
}
*/

	//****************Solid Rhombus****************

	
	/*public static void solidRhombus(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
			}
		}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed ");
		int rows=sc.nextInt();
		solidRhombus(rows);
	}
	}
	*/
	
	
	//***********Hollowrectange**************
	
	
	/*public static void hallowRectangle(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++){
			if(i==1 || i==rows || j==1 || j==rows) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be print");
		int rows=sc.nextInt();
		hallowRectangle(rows);
	}
}*/
	
	
	//***********DiamondPattern**************
	
	
	public static void diamondPattern(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
			
			public static void diamondPattern2(int rows){
				for(int i=1;i<=rows;i--) {
			for(int j=1;j<=(i-1);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(rows-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int rows=sc.nextInt();
		diamondPattern(rows);
		diamondPattern2(rows);
	}
	}