package com.apnacollege.recursion;
import java.lang.reflect.Array;
import java.util.*;

public class RecursionBasics {

//Recursion is method of solving a problem where the solution depends on solutions to smaller instances of the small problem
//Approch
	//1.Base case
	//2.Kaam
	//Call to same function
	/*
	public static void printDec(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n +" ");
		printDec(n-1);
	}
	public static void main(String[] args) {
		int n=10;
	printDec(n);
	}	
}
*/
//*****Call Stack*******

	
	
//************************************Q.2.Print numbers from 1 to n*******************************
	/*
	public static void printInc(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		printInc(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int n=10;
		printInc(n);
	}
}
*/
	
	
	
//******************************Q.3.Print the factorial of number***************************************
/*
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		//kaam
		int fn1=fact(n-1);
		int factorial=n*fn1;
		return factorial;
	}
	
	public static void main(String[] args) {
		int n=5;
		System.out.print(fact(n));
	}
	}
*/
	
	
	
//********************************Q.4.Print sum of first n natural number***********************************
	/*
	public static int printSumNatural(int n) {	
	if(n==1) {
		return 1;
	}
		int sum=0;
	 sum=printSumNatural(n-1);
		int sum1=n+sum;
		return sum1;
		//kaam
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println(printSumNatural(n));
	}
}
*/
	
	
//*************************************Q.5.Print Nth fibonacci number*********************************
	// In this problem there will be two stacks and they are in form of tree.
	/*
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fib1=fibonacci(n-1);
		int fib2=fibonacci(n-2);
		int fibonacci1=fib1+fib2;
		return fibonacci1;
	}
	
	public static void main(String[] args) {
	int n=25;
	System.out.println(fibonacci(n));
	
	}
	}
	*/

//*****************************Q.6.Check if a given array is sorted or not********************************
/*
	public static boolean isSorted(int[]arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		//Kaam
		if(arr[i]>arr[i+1]) {
		return false;
		}
		return isSorted(arr,i+1);
	}
	public static void main(String [] args) {
		int[] arr= {1,2,3,4,5,6};
	    int i=0;
	    System.out.println(isSorted(arr,i));
	}
	}
*/

//*******************Q.7.Write a function to find first occurance of an element in array**********************
/*
	public static int firstOccur(int[]arr,int key,int i) {
		if(i==arr.length-1) {
		return -1;
		}
		if(key==arr[i]) 
		{
			return i;
		}
		return firstOccur(arr,key,i+1);
	}
public static void main(String [] args) {
	int[] arr= {8,3,6,9,5,10,2,5,8};
	int key=5;
	int i=0;
	System.out.println(firstOccur(arr,key,i));
}
}
*/
//*************************Q.8.Write a function to find last occurance of element in array********************

/*
public static int lastOccur(int[]arr,int key,int i) {
	if(i==arr.length) {
	return -1;
	}
	int isFound=lastOccur(arr,key,i+1);
	if(isFound==-1&&arr[i]==key) 
	{
		return i;
	}
	return isFound;
}
public static void main(String [] args) {
int[] arr= {8,3,6,9,5,10,2,5,8};
int key=5;
int i=0;
System.out.println(lastOccur(arr,key,i));
}
}
*/

//*************************Q.9.Print X^n*********************************************************************

//**************************x^n=x*x^n-1******************************************************
	
	/*
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
	//kaam
		int pw=power(x,n-1);
		int power=x*pw;
		return power;
	}
	
	public static void main(String[]args) {
		System.out.println(power(2,10));
	}
}
	*/
//************************Optimized solution*********************************************************************

/*

	public static int optimizedPower(int a, int n) {
		if(n==0) {
			return 1;
		}
		int halfPower=optimizedPower(a,n/2);
		int halfPowerSq=halfPower*halfPower;
		if(n%2!=0) {
			halfPowerSq=a*halfPowerSq;
		}
		return halfPowerSq;	
	}
	public static void main(String[]args) {
		int a=2;
		int n=10;
		System.out.println(optimizedPower(a,n));
	}
	}
	*/

//***************************Q.11.Tilling Problem******************************************************************
	//Base Case=n=0 or1 then no. of ways are 1
	//figure out the choices to place the tiles horizontal or vertical
	//total ways are addition of ways
	/*
	public static int tilingProblem(int n){//size of floor(2 x n)
	if(n==0||n==1) {
		return 1;
	}
	//kaam
	int vertical=tilingProblem(n-1);
	int  horizontal=tilingProblem(n-2);
	int totalWays=vertical+horizontal;
	return totalWays;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.print(tilingProblem(4));
		
		
	}
}
	*/
	
	
//**************************Q.12.Remove duplicate from string********************************************************* 
	//take index variable to triverse the array
	//take map[] boolean type array
	//take string builder sb
	//
	
	/*
	public static void removeDuplicates(String str,int idx,StringBuilder sb,boolean [] map) {
		if(idx==str.length()) {
			System.out.print(sb);
			return;
		}
		//kaam
		char currChar=str.charAt(idx);
		if((map[currChar-'a']==true)){
			removeDuplicates(str,idx+1,sb,map);
		}
		else {
			map[currChar-'a']=true;
			removeDuplicates(str,idx+1,sb.append(currChar),map);
		}
	}
	
	public static void main(String []args) {
		String str="appnnacollege";
		removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
	}
	}
	*/
	
	
//*************************Q.13.Friends pairing problem**************************************************************
	
	/*
	
	public static int friendsPairing(int n) {
		if(n==1||n==2) {
			return n;
		}
		int single=friendsPairing(n-1);
		int pair=friendsPairing(n-2);
		int totalWays=single+(n-1)*pair;
		
return totalWays;
	}
	public static void main(String[] args) {
	System.out.print(friendsPairing(3));
	}
	}
	
	//return friendsPairing(n-1)+(n-1)*friendsPairing(n-2)**********************************************************
	
*/
	
	
//****************************Q.14.Binary String Problem************************************************************
	
	
	
	public static void printBinaryString(int n,int lastPlace,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		//kaam
		 printBinaryString(n-1,0,str+"0");
		 if(lastPlace==0) {
			 printBinaryString(n-1,1,str+"1");
		 }
		
	}
	
	public static void main(String[] args) {
		 printBinaryString(3,0,"");
		
		
	}
}
	
	



