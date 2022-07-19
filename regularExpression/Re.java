package regularExpression;
import java.util.regex.*;
public class Re {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "India is a country";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
	}


