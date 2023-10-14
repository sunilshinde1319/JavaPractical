package shinde;

import java.util.Scanner;

class FibonacciSeries {
	public static void main(String args[])
	{
		// 0 1 1 2 3 5
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number for print the fibbonaci series: ");

		int no=sc.nextInt();
		
		int a=0,b=1;
		int c;
		
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
