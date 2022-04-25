package pack1;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateChars 
{
	public static void main(String[] args) 
	{
		String s1 ="hello welcome welcome to java";
		char ch[] = s1.toCharArray();
		HashSet set = new HashSet();
		for(char c:ch)
		{
			set.add(c);
		}
		System.out.println(set);
		
	  
	}

}
