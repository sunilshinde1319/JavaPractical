package shinde;

import java.util.Scanner;

class MultiplicationTable {

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number for print the table :");
			int table_no=sc.nextInt();
			
			for (int i = 1; i <=10; i++) {
				
				System.out.println(table_no +" * " +i +" = " +(table_no*i));
			}
		}
}
