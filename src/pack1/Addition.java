package pack1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Addition 
{
	public static void main(String[] args) 
	{
		String s1 = "Mohammed Tameem";
		Map<Character,Long> map = s1.chars()
				.mapToObj(c-> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		
	}

}
