package com.apnacollege.sorting;

//********************Bubble Sort**************************************************************************************
//Large elements are come to the end of array by swapping the adjacent element

public class BasicSorting {
	
	/*public static void bubbleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
//public static void printArr(int[]arr) { 
//	for(int i=0;i<arr.length;i++) {
	//	System.out.println(arr[i]);
//}	
//}
	
public static void main(String[] args) {
	int [] arr= {5,4,1,3,2};
	bubbleSort(arr);
	//printArr(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
}	
}
}*/
	
	
//***************************************Selection Sort*********************************************************************
//Pick up the smallest from the unsorted array and put it at the beginning
	
	/*public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
			}
		int temp=arr[smallest];
		arr[smallest]=arr[i];
		arr[i]=temp;
	}
	}
	
	public static void main(String[] args) {
		int [] arr= {5,4,1,3,2};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
*/
	
//*********************Insertion Sort*********************************************************************************************
//Pick an element from unsorted part and place in right position sorted path
	/*public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
			//find out the correct position to insert
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			//insert the element
			arr[prev+1]=curr;
			
			}
		
			}
	
	
	public static void main(String[] args) {
		int []arr= {5,4,1,3,2};
		insertionSort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
	}
}*/
//*********************Inbuilt Sort****************************************************************************************************
	//import java.util.Arrays;
	//Arrays.sort(arr);
	//Arrays.sort(arr,si,ei);
	
	//*************Reverse order sort*************
	//import java.util.Collections;
	//Arrays.sort(arr,Collections.reverseOrder());
	//Arrays.sort(arr,si,ei ,Collections.reverseOrder());
	
	
//*********************Counting sort****************************************************************************************************
	public static void counting(int [] arr) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest=Math.max(largest, arr[i]);
		}
		int [] count=new int[largest+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		//sorting
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[j]=i;
				j++;
				count[i]--;
				
			}
		}
		
	}
	public static void main(String [] args) {
		int [] arr= {5,4,1,3,2};
		counting(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
	}
}
	