package Patternsinjava;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//decrease left triangle
		
		int n=6;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
