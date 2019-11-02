import java.util.*;

public class number4 {
	public static void main(String[] args) {
		number2 n = new number2();
		Scanner in = new Scanner(System.in);
		System.out.println("input: ");
		String s = in.nextLine();
		if(s.equals(n.reverseString(s).trim()))
			System.out.println("P");
		else System.out.println("N");
	}
}
