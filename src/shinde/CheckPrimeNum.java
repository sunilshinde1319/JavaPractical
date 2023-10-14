package shinde;

import java.util.Scanner;


class CheckPrimeNum
{
	Scanner sc= new Scanner(System.in);
	
	int n;
	void checkPrime()
	{
		boolean flag = false;
		System.out.println("Enter the Number for check : ");
		n = sc.nextInt();
		
		if(n < 0 || n ==1 ) {
			flag = false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = false;
			}
			flag = true;
		}
		
		if(flag) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	public static void main(String args[]) {
		
		CheckPrimeNum obj=new CheckPrimeNum();
		obj.checkPrime();
	}
	
}