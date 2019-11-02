import java.util.*;

public class number2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input string: ");
		String s = in.nextLine();
		System.out.println(reverseString(s));
	}


	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
