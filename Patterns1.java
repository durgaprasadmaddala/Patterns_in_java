package Patternsinjava;

import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
	//	int n=5;
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
