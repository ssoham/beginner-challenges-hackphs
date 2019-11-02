import java.util.*;

public class number8 {
	public static void largeDiff(int[] arr1, int[] arr2) {
		int min = Collections.min(Arrays.asList(Arrays.stream(arr1).boxed().toArray(Integer[]::new)));
		int max = Collections.max(Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new)));
		System.out.println(max-min);
	}
}
