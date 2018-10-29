import java.util.Scanner;
public class bt16 
{
	    public static final char SPACE =' ';
	    public static final char TAB = '\t';
	    public static final char BREAK_LINE ='\n';
	    public static final String NULL_LINE = null;
public static int countWords(String input) {
	        if (input == null) {
	            return -1;
	        }
	        int count = 0;
	        int size = input.length();
	        if(input.charAt(0)!=SPACE)
	        	count++;
	        //boolean notCounted = true;
	        for (int i = 0; i < size; i++)
	        {
	           if(input.charAt(i)==SPACE && input.charAt(i+1)!=SPACE && input.charAt(i+1)!=BREAK_LINE )
	            	count ++;	
	        }
	        return count;
	    }

public static void main(String[] args) 
{
	String str = "	hoc java	"
			+ "?  	 co ban den nang cao"
            + "      \n test";
    System.out.print("So tu la: "
            + countWords(str));

}
}
