package pack1;

import java.util.HashSet;

public class DuplicateStringExample 
{
	public static void main(String[] args)
	{
		String s1 = "hello welcome welcome to java java";
		String s2[] = s1.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(String data: s2)
		{
			set.add(data);
		}
		System.out.println(set);
		
	}

}
