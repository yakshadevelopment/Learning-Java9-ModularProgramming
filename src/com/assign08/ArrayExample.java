package com.assign08;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int element=56;
		int arr[]={20,30,50,56,78,30};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element){
				flag=true;
			System.out.println(""+arr[i]+" flound at "+(i+1)+" Position");
			break;
			}
		}
		
		if(!flag)
		{
			System.out.println("Element Not Found");
		}

	}

}

//
