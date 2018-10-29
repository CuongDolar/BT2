import java.util.Scanner;
public class bt17
{
	public static boolean isCheckSuatHien(String s1,String s2)
	{
		if(s1.contains(s2))
			return true;
		return false;
		
	}
	
public static void main(String[] args) 
{
	String s1,s2;
	Scanner sc=new Scanner(System.in);
    System.out.print("Nhap s1 :");
    s1=sc.nextLine();
    System.out.print("Nhap s2 :");
    s2=sc.nextLine();
    if(isCheckSuatHien(s1,s2))
    	System.out.print("S1 chua s2 ");
    else
    	System.out.print("S1 khong chua s2 ");
    sc.close();
}
}