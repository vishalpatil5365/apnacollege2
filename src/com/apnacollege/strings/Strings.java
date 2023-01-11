package com.apnacollege.strings;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//**********Strings are IMMUTABLE**********

public class Strings {
	/*public static void printLetters(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i) +" ");
			
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//char[] arr= {'a','b','c','d'};
	//String str="abcd";
	//System.out.println("Enter any name");
	//String name=sc.next();
	//System.out.println(name);
	//String name1=sc.nextLine();
	//System.out.println(name1);
	//String fullName="vishal patil";
	//System.out.println(fullName.length());
//*******concatenation*************************
	String name="vishal";
	String lastName="patil";
	String fullName=name+lastName;
	System.out.println(fullName.length());
	System.out.println(fullName.charAt(0));
	printLetters(fullName);
}
}
*/

//********************************************Check weather given string is palindrome or not**********************************
//***Q.1.
	
	/*public static boolean isPalindrome(String str) {
		//int n=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				System.out.println("Given string is not a palindrime ");
				return false;
			}
	
		}
		
		return true;
		
	}
	
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to be checked");
	String str=sc.next();
	System.out.println(isPalindrome(str));
		
		
}
}*/

//***Q.2.Given route containing four sides (north,south,east,west)find the shortest path to reach the destination******************************
	
	/*public static float getShortestPath(String path) {
		int x=0;int y=0;
		for(int i=0;i<path.length();i++) {
			char dir=path.charAt(i);
			//south
			if(dir=='S') {
				y--;
			}
			
			else if(dir=='N') {
				y++;
			}
			
			else if(dir=='E') {
				x++;
			}
			else {
				x--;
			}
		}
		int	X2=x*x;
		int Y2=y*y;
		
		return (float)Math.sqrt(X2+Y2);
		
	}
	
	public static void main(String [] args) {
		 String path="WNEENESENNN";
		System.out.println(getShortestPath(path));
		
	}
	}
	*/
//*******for checking the two strings are equal or not we can use .equals() which checks at value level****************************
	/*public static void main(String [] args) {
	
	String s1="tony";
	String s2="tony";
	String s3= new String("tony");
   if(s1==s2) {
	   System.out.println("strings are equal");
   }
   else { 
	   System.out.println("strings are not equal");
   }
   
   if(s1.equals(s3)) {
	   System.out.println("strings are equal");
   }
   else {
	   System.out.println("string are not equal");
   }
	}
}
*/

//************************************************SubString Functions************************************************************************
	//***while printing substring print starting index and exclude ending index**** 
	/*public static String subString(String str,int si,int ei) {
		String subString="";
		for(int i=si;i<ei;i++) {
			subString+=str.charAt(i);
		}
		
		return subString;
	}*/
	
//public static void main(String[] args) {
	//String str="Hello World";
	//System.out.println(subString(str,0,5));
	//System.out.println(str.substring(0,5));
//}
//}

//Q.3.************************************For a given set of strings print the largest string************************************************
///Hint- Lexicographic order*****************
// *********use compareTo() function****
 /*public static void largestString(String[]fruits) {
	String largest=fruits[0];
	for(int i=1;i<fruits.length;i++) {
		if(largest.compareTo(fruits[i])<0){
			largest=fruits[i];
		}
	}
	System.out.println(largest);
}
	
	public static void main(String []args) {
		String [] fruits= {"apple","mango","banana"};
	largestString(fruits);
	}
	
}*/

//*************Interning******************************************************************************************************************
//*****************String builders***********
//*************toString()****************
/*public static void main(String [] args) {
	 StringBuilder sb=new StringBuilder("");
	 for(char ch='a';ch<='z';ch++) {
		 sb.append(ch);
	 }
	 System.out.println(sb.length());
	 
	 
	 
}
}
*/

//Q.4.*************For a given string convert first letter of each string into capital**********************************************
	//"hi,i am shradha"
	/*public static String toUpperCase(String str) {
		StringBuilder sb=new StringBuilder();
		char ch=Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) ==' ' && i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String [] args) {
		String str="hi,i am shradha";
		System.out.println(toUpperCase(str));
	}
}*/
	
//**************************STRING COMPRESSION*****************************************************
	/*//aaabbbcccdddd   = a3b3c3d4
	public static String compression(String str) {
		StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		int count=1;
		while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
			count++;
			i++;
		}
		  sb.append(str.charAt(i));
		  if(count>1) {
			  sb.append(count);
		  }
		
	}
		
	return sb.toString();	
	}
	
	public static String getUniqueChar(String str) {
		
		List result = Stream.of(str).distinct().collect(Collectors.toList());
		return result.stream().toString();
		
	}
	
	
	
public static void main(String [] args) {
	String str="aaabbbccccddddd";
	System.out.println(compression(str));
	System.out.println(getUniqueChar(str));
	
}
}
	*/
	/*
	public static int strstr(String s, String x,int i) {
    if(i==s.length()-1){
        return -1;
    }
    if(x.charAt(0)==s.charAt(i)){
        return i ;
    }
    return strstr(s,x,i+1);
    //Kaam
}
	public static void main(String[] args){
	    String s="GeeskForGeeks";
	    int i=0;
	    String x="For";
	    System.out.println(strstr(s,x,i));
}
}*/
	public static int palinArray(int[] a, int n)
    {
      for(int i=0;i<a.length/2;i++){
          if(a[i]==a[a.length-1-i]){
              return 1;
          }
          else{
              return 0; 
          }
      }
	return n;    
        
    }
}
	
	
	
	
