//arrays is an list of elements of the same data type placed in contiguous memory location

package com.apmnacollege.arrays;
import java.util.*;

public class Arrays {
	/*Scanner sc=new Scanner(System.in);
	int [] marks=new int[100];
	System.out.println("Enter marks of subjects");
	marks[0]=sc.nextInt();
	marks[1]=sc.nextInt();
	marks[2]=sc.nextInt();
	System.out.println("phy = "+ marks[0]);
	System.out.println("che = "+ marks[1]);
	System.out.println("math = "+ marks[2]);
	
	marks[0]=marks[0]+3;
	System.out.println("phy ="+ marks[0]);
	 int percentage=(marks[0]+marks[1]+marks[2])/3;
	 System.out.println("percentage :" + percentage);
	 
	 System.out.println(marks.length);
}
}*/
	
	
//****************Passing of arrays as argument************************************************************************************
	
	//At the time of passing array as an argument we passing by use of call by reference, so the changes made in supplimentory function will be reflected in original array.
	
	// **********Linear Search**********
	
	/*public static int linearSearch(int numbers[] ,int key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==key) {
				return i;
			}
			
		}
		
		return -1;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers= {20,45,67,89,36,37,85};
		System.out.println("Enter the number which is to check");
		int key=sc.nextInt();
		int index=linearSearch(numbers,key);
		
		if(index == -1) {
			System.out.println("NOT FOUND");
		}
		else {
			System.out.println("key is at" + index);
		}

	
	
}
}*/
	
	
//**********Find largest number from array*********************************************************************************
	//Integer.MIN_VALUE= -infinity;
	//Integer.MAX_VALUE= +infinity;
//package com.apmnacollege.arrays;
//import java.util.*;
/*
//public class Arrays {
	public static int getLargest(int numbers []) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			}
			if(smallest>numbers[i]) {
				smallest=numbers[i];
				
			}
		}
		System.out.print(smallest);
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0;i<5;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.print( getLargest(numbers));
	}
}
*/

//***********Binary search*****************************************************************************************************
//It used for sorted arrays
	
	/*start=0 , end=n-1
			while(start<=end)
				find mid =  (start+end)/2 ****
				compare mid==key
				if equal= print found
				if  mid small= right ********update start by mid+1***********
				if  mid big= left   ********* update end by mid-1*********
	*/
	
	/*public static int binarySearch(int numbers[],int key) {
		int start=0;
		int end=numbers.length-1;
	while(start<=end) {
			int mid=(start+end)/2;
			//comparisons
			if(numbers[mid]==key) {
			return mid;
		}
			 if(numbers[mid]<key)//right
				 {
				start=mid+1; 
			}
			 else //left
			 { 
				 end=mid-1;
			 }
			 
	}
	return -1;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int [] numbers= {34,56,77,99,100,125,130,145,167};
		System.out.println("Enter number to be search from array");
		int key=sc.nextInt();
		int index=binarySearch(numbers,key);
		if(index==-1) {
			System.out.println("NOT FOUND");
		}
		else {
			System.out.println("key is at : "+ index);
		}
	}
	}*/
	
	
//*****************Reverse an array************************************************************************************************
	/*public static void reverseArray(int[]numbers) {
		int start=0;
		int last=numbers.length-1;
		while(start<last) {
			int temp=0;
			temp=numbers[start];
			numbers[start]=numbers[last];
			numbers[last]=temp;
			 start++;
			 last--;
			 
			
		}
		
	}
	

	public static void main(String[] args) {
		int[ ] numbers= { 2,3,4,5,6,7};
		reverseArray(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
	
}*/


//************Pairs in array**********find all possible combination of pairs************************************************************

/*public static void printPairs(int[] numbers) {
	int a=numbers.length;
	
	for(int i=0;i<numbers.length;i++) {
		int curr=numbers[i];
		for(int j=i+1;j<numbers.length;j++) {
			System.out.print("("+curr+","+""+numbers[j]+")");
		}
		System.out.println(" ");
	}
}
public static void main(String[] args) {
	int []numbers= {2,4,6,8,10};
	printPairs(numbers);
}
}
*/

//***************print subArrays****************************************************************************************************
	
	/*public static void printSubArrays(int[] numbers) {
	 int ts=0;
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i;j<numbers.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
					//System.out.print(numbers[k]+" ");
					int sum=0;
					
	
				}
				ts++;
				System.out.println(" ");
					
			}
			System.out.println(" " );
		}
		
		System.out.println("total subarrays :" + ts);
	}
	
	public static void main(String[] args) {
		int [] numbers= {2,4,6,8,10};
		printSubArrays(numbers);
	}
}*/


//************Print maximum Sum of subarrays********************************************************************************************
	/*public static void printMaxSubArrays(int[] numbers) {
		int max=Integer.MIN_VALUE;
		int currSum=0;
			for(int i=0;i<numbers.length;i++) {
				int start=i;
				for(int j=i;j<numbers.length;j++) {
					int end=j;
					currSum=0;
					for(int k=start;k<=end;k++) {
						//System.out.print(numbers[k]+" ");
					currSum+=numbers[k];
					}
					System.out.println("currSum :"+currSum);
						if(max<currSum) {
							max=currSum;
						}
				}
			}
			
			System.out.println("Max sum is :"+ max);
		}
		
		public static void main(String[] args) {
			int [] numbers= {1,-2,6,-1,3};
			printMaxSubArrays(numbers);
		}
	}*/

//*****************Caluclate sum by using prefix array*************************************************************************************
	//to calculate sum of subarrays use this**********prefix[end]-prefix[start-1]
	//to calculate prefix array use this**********prefix[i-1]+arr[i]

/*public static void printMaxSubArrays(int[] numbers) {
	int max=Integer.MIN_VALUE;
	int currSum=0;
	int prefixArray []=new int[numbers.length];
	prefixArray[0]=numbers[0];
	for(int i=1;i<prefixArray.length;i++) {
		prefixArray[i]=prefixArray[i-1]+numbers[i];
	
	}
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i;j<numbers.length;j++) {
				int end=j;
				currSum= start==0? prefixArray[end]:prefixArray[end]-prefixArray[start-1];
				}
					if(max<currSum) {
						max=currSum;
					}
			}
		System.out.println("Max sum is :"+ max);
		}
		
	
	public static void main(String[] args) {
		int [] numbers= {1,-2,6,-1,3};
		printMaxSubArrays(numbers);
	}
}
*/

//**************Kadane's Algorithm****************************************************************************************************
	//***********Take 0 on spot of negative value*******************
	/*public static void kadanesAlgorithm(int[] numbers) {
		int max=Integer.MIN_VALUE;
		int CS=0;
		
	for(int i=0;i<numbers.length;i++) {
		CS=CS+numbers[i];
		if(CS<0) {
			CS=0;
		}
		max=Math.max(CS,max);
						}
	System.out.println("our max number is:" + max);
	}
			
		
		public static void main(String[] args) {
			int [] numbers= {-2,-3,4,-1,-2,1,5,-3};
		kadanesAlgorithm(numbers);
		}
	}
	*/
	
//**********Trapping Rainwater**********************************************************************************************************
	//Water level=min(MaxLeft,MaxRight)
	//Trapped Water=Water Level-Height
	//Calculate the array of right and left boundary
	
	/*public static int trappedWater(int []height) {
		int n=height.length;
	//Calculate leftMax boundary array
		int [] leftMax=new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1], height[i]);
		}
		
		// Calculate rightMax boundary array
		int [] rightMax=new int[n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(rightMax[i+1],height[i] );
		}
		
		//Loop
		int trappedWater=0;
		for(int i=0;i<n;i++) {
			
		//Calculate water level
			 int waterlevel=Math.min(leftMax[i], rightMax[i]);
			 //Calculate trapped Water
			 trappedWater+=waterlevel-height[i];
			
		}
		return trappedWater;
	}

	public static void main(String [] args) {
		int [] height= {4,2,0,6,3,2,5};
		System.out.println("trapped Water" + trappedWater(height));
		
	}
}*/
	
//******************Buy & Sell stocks***************************************************************************************************
//profit = selling price-buying price
	/*public static int buyAndSellStocks(int[] prices) {
		int buyPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<prices.length;i++) {
			if(buyPrice<prices[i]) {
				int profit=prices[i]-buyPrice;// todays profit
				maxProfit=Math.max(maxProfit, profit);
				
			}
			else {
				buyPrice=prices[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int [] prices= {7,1,5,3,6,4};
		System.out.println(buyAndSellStocks(prices));
	}
}*/
	
	    //Function to find a continuous sub-array which adds up to a given number.
	    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        ArrayList<Integer> list=new ArrayList();
	        for(int i=0;i<arr.length;i++){
	            int start=i;
	            for(int j=i;j<arr.length;j++){
	                int end=j;
	                int cs=0;
	                for(int k=start;k<end;k++){
	                    cs+=arr[k];
	                    if(cs==s){
	                        System.out.println(start +" "+end);
	                    }
	                }
	                
	            }
	                }
			return null;
	                
	                
	            }
	    
	    public static void main(String[] args){
	        //Scanner sc=new Scanner(System.in){
	        //int n=sc.nextInt();
	       // for(int i=0;i<=n-1;i++){
	        int arr[]={1,2,3,7,5};

	       // int s=sc.nextInt();
	       subarraySum(arr,5,12);
	         
	            
	    }
	    }

	