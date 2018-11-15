package p1_Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 
{

	public static void main(String[] args) 
	{
		String words = "90 percent effort 100 percent of the time";
		String names = "Mike McMillian Terry McMilln Allison McMillin";
//		System.out.println("This line\\n" + words);
//		String patt = "\\w+ ";
//		String patt = "\\d+ ";
		String patt = "\\s";
//		String patt = "McM.*?";
		Pattern pattern = Pattern.compile(patt);
//		Matcher match = pattern.matcher(words);
//		System.out.println(words);
		// switch
		Matcher match = pattern.matcher(names);
		System.out.println(names);
		int count = 0;
		while(match.find())
		{
			count++;
			System.out.println("Found " + patt + " at: " + match.start());
			System.out.println("Match " + match.group() + "\n");
		}
		System.out.println("Total occurrences: " + count);

	}

}
