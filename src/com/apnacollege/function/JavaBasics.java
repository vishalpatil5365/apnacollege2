package com.apnacollege.function;
import java.util.*;

public class JavaBasics {
	public static int primenumber(int a) {
		if(a==0 || a==1) {
			System.out.println("Yes");
		}
	
	for(int i=2;i<(a-1);i++) {
		if(a%i==0) {
			System.out.println("No");
			
		}
			else {
				System.out.println("Yes");
			}
		break;
		}
	return a ;
}
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number which is to check");
int a=scan.nextInt();
primenumber(a);
}
}
	//*****************************************************
	/*public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	public static int calculateSum(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int a=scan.nextInt();
	int b=scan.nextInt();
	int sum= calculateSum(a,b);
	System.out.println("your sum: "+ sum);
}*/
	
	//*************************Swapping of two number****************************


	/*public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int a=5;
int b=10;

int temp=a;
 a=b;
 b=temp;

System.out.println("Value of a:"+a);
System.out.println("Value of b:"+ b);
	}*/
	
	
	
	
	//******************Multiplicaton of two number**********************	
	/*public static int product(int c,int g) {
		int prod=c*g;
		return prod;

	}
    static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		int mul=product(a,b);
		System.out.println(mul);
}*/
	
	//*****************Factorial of number***************************

	/*public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
		public static void main(String[] args) {

			int fact=factorial(5);
			System.out.println(fact);
		}
	
	
	
	}*/


//****************Binomial Factorial**************************

/*public static int factorial(int n) {
	int f=1;
	for(int i=1;i<=n;i++) {
		f=f*i;
	}
return f;
}

public static int bincoeff(int a,int b) {
	
	int d=factorial(a);
	int e=factorial(b);
	int f=factorial(a-b);
	int bincoeff2=d / (e*f);
	return bincoeff2;
	//System.out.println(bincoeff);
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of n");
		int nfact=scan.nextInt();
		System.out.println("Enter value of r");
		int rfact=scan.nextInt();
		int bincoeff1=bincoeff(nfact, rfact);
		System.out.println(bincoeff1);
	}



}*/

//**********Function overloaoding************
	
	
//Multiple function with same name but different parameters
//Function overloading with number of parameter 
/*public static int sum(int a,int b) {
	return a+b;
}

public static int sum(int a,int b, int c) {
	return a+b+c;
}
	
	public static void main(String[] args) {
		int add=sum(4,5);
		int addition=sum(6,7,8);
		System.out.println(add);
		System.out.println(addition);
	}
}


//function overloading with change in data types
*/
	

//************Check whether given number is prime or not*****************
	
	/*public static int primenumber(int a) {

		
		for(int i=2;i<(a-1);i++) {
			if(a%i==0) {
				System.out.println("Given number is not prime");
				
			}
				else {
					System.out.println("Given number is prime");
				}
			break;
			}
		return a ;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number which is to check");
	int a=scan.nextInt();
	System.out.println(primenumber(a));
}
}
*/

//************Print all prime numbers within range*************

/*public static int primenumber(int a) {

		
		for(int i=2;i<(a-1);i++) {
			if(a%i==0) {
				System.out.println("Given number is not prime");
				
			}
				else {
					System.out.println("Given number is prime");
				}
			break;
			}
		return a ;
	}

public static void primeInRange(int a) {
	for(int i=2;i<a;i++) {
		primenumber(i);
		
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number which is to check");
	int a=scan.nextInt();
	primeInRange(a);
}
}
*/

//**************convert binary to decimal*****************
//
	/*public static void binToDec(int n) {
		int dec=0;
		int power=0;
		while(n>0) {
		int lastDigit=n%10;
		dec=dec + (lastDigit*(int)Math.pow(2,power));
		power++;
		n=n/10;
		}
		System.out.println(dec);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number to be converted in decimal");
		int dec=sc.nextInt();
		binToDec(dec);
	
	}
}
*/
/*
//**********Decimal to binary conversion***************
	public static void decToBin(int n) {
		int bin=0;
		int power=0;
		while(n>0) {
		int rem=n%2;
		bin=bin+ (rem*(int)Math.pow(10,power));
		power++;
		n=n/2;
		}
		System.out.println(bin);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number to be converted in binary");
		int dec=sc.nextInt();
		decToBin(dec);
	}
}*/
	
	//***********Scope**************