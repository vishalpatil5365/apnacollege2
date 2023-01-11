package com.apnacollege.divideandconquer;
import java.util.*;
public class DivideAndConquer {

//****************************Merge sort*********************************
	//Approch
	//1) Divide
    //Calculate Mid like bubble search  by ****si+(ei-si)/2****
    //2)mergesort(left)
	//mergesort(right)
	//3)merge
/*	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeSort(int[]arr,int si,int ei) {
		int mid=si+(ei-si)/2;
		if(si>=ei) {
			return;
		}
		mergeSort(arr,si,mid);//left part
		mergeSort(arr,mid+1,ei);//right part
		merge(arr,si,mid,ei);
	}
	public static void merge(int[]arr,int si,int mid,int ei) {
		int []temp=new int[ei-si+1];
		int i=si;//iterator for left part
		int j=mid+1;//iterator for right part
		int k=0;//iterator for temp array
		
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}
			else {
				temp[k]=arr[j];
				j++;
			}
		k++;
		}
		// for remaining elements of array
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
		
		//copy temp array to original array
		for(k=0,i=si;k<temp.length;k++,i++) {
			arr[i]=temp[k];
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int []arr= {6,3,9,5,2,8};
		mergeSort(arr,0,arr.length-1);
		printArr(arr);
	}
	
}
*/
	
//****************************************Quick sort***********************************************************************
//*********************Pivot and Partition*********************************************************

//Pivot (last element)
//Partition(parts)
//quick Sort(left)
//Quick Sort(right)


/*
public static void printArr(int [] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	
public static void quickSort(int[] arr,int si,int ei) {
	if(si>=ei) {
		return;
	}
	int pidx=partition(arr,si,ei);
	quickSort(arr,si,pidx-1);
	quickSort(arr,pidx+1,ei);
}

public static int partition(int [] arr,int si,int ei) {
int pivot=arr[ei];
int i=si-1;
for(int j=si;j<ei;j++) {
if(arr[j]<=pivot) {
	i++;
	int temp=arr[j];
	arr[j]=arr[i];
	arr[i]=temp;
}
}
i++;
int temp=pivot;
arr[ei]=arr[i];
arr[i]=temp;
	return i;
}

	
	public static void main(String[] args) {
		int [] arr= {6,3,9,8,2,5};
		quickSort(arr,0,arr.length-1);
		printArr(arr);
		
	}
}
*/
//******************************Worst case time complexity is occurs when pivot is  always smallest or largest element***************************
//time complexity will be O(n^2)

//*********************************Search in rotated sorted array*********************************************
//*****************************************Modify binary search*******************************************
	//Q.1. search for value in rotated array

	public static int search(int[] arr,int tar,int si,int ei) {
		
		if(si>ei) {
			return -1;
		}
		//kaam
		int mid=si+(ei-si)/2;
		
		//case found
		if(arr[mid]==tar) {
			return mid;	
		}
		
		//mid on line 1
		if(arr[si]<=arr[mid]) {
			//case a:left part
		if(arr[si]<=tar && tar<=arr[mid]) {
			return search(arr,tar,si,mid-1);
		}
		else {
			//case b:right part
			return search(arr,tar,mid+1,ei);
		}
			
		}
		//mid on line 2
		else {
			//case c:right part
			if(arr[mid]<=tar && tar<=arr[ei]) {
				return search(arr,tar,mid+1,ei);
			}
			else {
				//left part
				return search(arr,tar,si,mid-1);
			}
			
		}
	}
	
	
	
	
	
public static void main(String [] args) {
	int []arr= {4,5,6,7,0,1,2};
	int tar=0;
	int tardex=search(arr,tar,0,arr.length-1);
	System.out.print(tardex);
}
}






















