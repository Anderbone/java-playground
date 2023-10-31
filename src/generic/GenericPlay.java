package generic;
import java.util.Arrays;

public class GenericPlay {
	public static <T extends Comparable<? super T>, V extends T> boolean isInArray(T t, V[] v) {
		return Arrays.asList(v).contains(t);
	}

	public static void main(String[] args) {
		Integer[] nums = {1, 2, 3};
		System.out.println(isInArray(1, nums));
		System.out.println(isInArray(4, nums));
		String[] strs = {"a", "b", "c"};
		System.out.println(isInArray("a", strs));
		System.out.println(isInArray("d", strs));
	}
}
