package chap1;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class maytinhbotui 
{
	public static void main(String []ccc)
	{
		int numberfirst;
		int numbersecond;
		String caculate;
		Scanner sc=new Scanner(System.in);
	
		System.out.print("numberfirst :");
		numberfirst=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("numbersecond :");
		numbersecond=sc.nextInt();
		
		
		System.out.print("caculate :");
		caculate=sc.nextLine();
		
		sc.close();
		System.out.print("numberfirst :"+numberfirst);
		System.out.print("numbersecond :" +numbersecond );
		System.out.println("caculate :"+caculate);
	}
	

}
