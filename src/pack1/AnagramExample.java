package pack1;
import java.util.Arrays;

public class AnagramExample 
{
	public static void main(String[] args) {
		
		String s1 = "keep";
		String s2 ="peek";
		char[] s3 = s1.toCharArray();
		char[] s4= s2.toCharArray();	
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		boolean status = Arrays.equals(s3, s4);
		
		if(status)
			System.out.println("string are anagrams");
		else
			System.out.println("string are not anagrams");
		
		
	}

}
