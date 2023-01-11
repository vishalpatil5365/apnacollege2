package com.apnacollege.bitmanipulation;
import java.util.*;

public class BitMan {
//****LEFT SHIFT OPERATOR********
   //**5<<2**
//****FORMULA****
//**********************(a<<b=a*2^b)********************************************************************
/*
public class BitMan {
public static void main(String[]args) {
	System.out.println(5<<2);
	
}
}
*/

//*********************RIGHT SHIFT OPERATOR***************************************************************
//*****5>>2****
//******FORMULA********
//*********************************(a>>b=a/2^b)***********************************************
	/*
		public static void main(String[]args) {
			System.out.println(6>>1);
			
		}
		}*/
	
	
//************************************************************************************************************
	//*************Q.1. Check if a number is odd or even***************************************
	//********For this we have to use & operator with 1*****************
	
	/*public static void oddOreven(int n) {
		int bitMask=1;
		if((n & bitMask)== 0) {
			System.out.println("Given number is even ");
		}
		else {
			System.out.println("Given number is odd");
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to be check");
	int n=sc.nextInt();
	oddOreven(n);
	}
}*/

//**************************************************************************************************************
//**************************************OPERATIONS*************************************
//1. GET ith bit
//2.SET ith bit
//3.Clear ith bit

	/*public static int getIthBit(int n,int i) {
		int bitMask=1<<i;
		if((n & bitMask)==0) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of n and i");
		int n=sc.nextInt();
		int i=sc.nextInt();
		System.out.println(getIthBit(n, i));
		
	}
}
*/
//*************************Set Bit*********************************************************************************
	/*public static int setIthBit(int n,int i) {
		int bitMask=1<<i;
		return (n | bitMask);
		
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of n and i");
		int n=sc.nextInt();
		int i=sc.nextInt();
		System.out.println(setIthBit(n, i));
		
	}
}
*/
//******************************CLEAR BIT**************************************************************************
/*
	public static int clearIthBit(int n,int i) {
	int bitMask=~(1<<i);
	return (n & bitMask);
	
}
//********************update 0 or 1**********************************************************************************
public static int updateIthBit(int n,int i,int newBit) {
	 n=clearIthBit(n,i);
	int BitMask=newBit<<i;
	return (n | BitMask);
	
	
}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of n and i");
	int n=sc.nextInt();
	int i=sc.nextInt();
	System.out.println(updateIthBit(n, i,1));
	

}
}
*/
//***************************CLEAR LAST i BITS*****************************************************************************
/*public static int clearIthBit(int n,int i) {
	int bitMax=~(0)<<i;
	return(n&bitMax);
	
}

public static void main(String []args) {
	System.out.println(clearIthBit(15,2));
	
}
}
*/
//********Clear Range Of Bitss***********************************************************************************************
	//n=100111010011, i=2, j=7
	/*
	public static int clearRangeOfBits(int n,int i,int j) {
		int a=((~0)<<(j+1));
		int b=(1<<i)-1;
		int bitMask=(a|b);
		return(n&bitMask);
		
	}
	
	
	
	
	public static void main(String [] args) {
		 System.out.println(clearRangeOfBits(10,2,4));
		
	}
}*/
	
//****Q.2.Check weather given number is power of 2 or not*************************************************************************
/*
	public static boolean checkPowerOfTwo(int n) {
		return((n & n-1))==0;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPowerOfTwo(15));	
	}
}
*/
//*****Q.3.Count set bits in a number************************************************************************************************
/*
	public static int countSetBit(int n) {
		int count=0;
		while(n>0) {
			if((n&1)!=0){
				count++;
			}
			n=n>>1;
			
		}
		return count;
		
	}
	
	public static void main(String [] args) {
		System.out.println(countSetBit(10));
		
	}
}
	*/
//*****************************************************************FAST EXponentiation*************************************************
	
	public static int fastExponentiation(int a,int n) {
		
		int ans=1;
		while(n>0) {
			if((n&1)!=0) {
				ans=a*ans;
			}
			a=a*a;
			n=n>>1;
		}
		return ans;
	}
	public static void main(String []args) {
		System.out.println(fastExponentiation(5,3));
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	