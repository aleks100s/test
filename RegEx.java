import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegEx {
public static void main(String[] args)
{
	Console console = System.console();
	if (console == null)
	{
		System.exit(1);
	}
	while (true)
	{
		Pattern pattern = Pattern.compile(console.readLine("\nEnter your regex: "));
		Matcher matcher = pattern.matcher(console.readLine("Enter string: "));
		boolean found = false;

		while (matcher.find())
		{
			console.format("I found the text \"%s\" starting at (%d) and ending at (%d).\n", matcher.group(), matcher.start(), matcher.end());
			found = true;
			System.out.print("regex");
		}
		if (!found)
		{
			console.format("No match found.\n");
		}
	}
}
}