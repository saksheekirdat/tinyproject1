package capg;

import java.util.stream.Collectors;

public class domain {
public static void main(String args[])
{
	insertSpace("example");
}

private static void insertSpace(String s) {
	// TODO Auto-generated method stub
	StringBuilder result = new StringBuilder();
	s.chars().forEach(c -> result.append((char)c).append(' '));
	System.out.println(result.toString().trim());
	assertThat(result.toString().trim(),is("e x a m p l e"));
	
}

private static void assertThat(String trim, Object object) {
	// TODO Auto-generated method stub
	
}

private static Object is(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
