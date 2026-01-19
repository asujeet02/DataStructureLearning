package com.cg.arrays;
import java.util.Scanner;

public class ArrayInsertion {
	
	public void insertAtInArray(int arr[],int n,int x,int pos)
	{
		for(int i=n-2;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=x;
	}
	
	public int findIndex(int arr[], int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public void deleteElementInArray(int arr[],int key)
	{
		int pos=findIndex(arr, key);
		if(pos==-1)
			System.out.println("Element to be deleted not found in the array!");
		else 
		{
			for(int i=pos;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		}
	}
	
	public void reversedArray(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length/2;i++)
		{
				temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
		}
	}
	
	public void traverseArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The element at index "+i+" is "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayInsertion arrayInsertion=new ArrayInsertion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array!");
		int size=sc.nextInt();
		if(size>0)
		{
			int arr[]=new int[size];
			System.out.println("Enter "+size+" values in the array!");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			//arrayInsertion.insertAtInArray(arr, size, 5, 3);
			arrayInsertion.reversedArray(arr);
			System.out.println("Enter the element to be removed");
			int elementToBeRemoved=sc.nextInt();
			arrayInsertion.deleteElementInArray(arr, elementToBeRemoved);
			arrayInsertion.traverseArray(arr);
		}
		else 
		{
			System.out.println("Invalid size of an array mentioned!");
		}
	}

}
