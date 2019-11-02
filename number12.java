import java.util.*;

public class number12 {
	public static void commonChar(String s) {
		int[] count = new int[256];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		int max = -1;
		char r =' ';
		for(int i = 0; i<s.length(); i++) {
			if(max < count[s.charAt(i)]) {
				max = count[s.charAt(i)];
				r = s.charAt(i);
			}
		}
		System.out.println(r);
	}	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input: ");
		String s = in.nextLine();
		commonChar(s);
	}
}

