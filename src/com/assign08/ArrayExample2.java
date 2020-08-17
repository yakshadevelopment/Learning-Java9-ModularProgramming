package com.assign08;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int marks[][]={
			{101,78},
			{102,67},
			{103,89},
			{104,76}
			
	};
	System.out.println("Before Shorting");
	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i][0]+" "+marks[i][1]);
	}
	
	
	for(int i=0;i<marks.length;i++)
	{
		for(int j=i+1;j<marks.length;j++)
		{
			if(marks[i][1]>marks[j][1])
			{
				int temp0=marks[i][0];
				int temp=marks[i][1];
				
				marks[i][1]=marks[j][1];
				marks[i][0]=marks[j][0];
				
				marks[j][1]=temp;
				marks[j][0]=temp0;
			}
		}
	}
	System.out.println("After Shorting");	
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i][0]+" "+marks[i][1]);
		}
		
	
	
	
	
	
	
	

	}

}

//
