package arrayStudy;

import java.util.Arrays;

public class ArrayEg2 {

	public static void main(String[] args)
	{
		
		int rollNum[]= {19,11,17,16,12,18,13,14,15};
		
		System.out.println(rollNum[2]);
		
		System.out.println("==========using static for loop=============");
		
	
		for(int i=0;i<=5;i++)
		{
			System.out.println(rollNum[i]);
			
		}
		System.out.println("============using dyanamic for loop========");
				   
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("=========sorting array-->Descending order=====");
		
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("============================================");
		
		char grade[]= {'D','A','B','C'};
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("================================================");
		
		Arrays.sort(grade);
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		 
		System.out.println("=================================================");
		
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
		
		
		
		
		
		
	}

}
