package collectionPlay;

import java.util.Arrays;

public class ArrayPlay {

	private static final int[] myArr;

	static
		{
		myArr = new int[10];
		myArr[0] = -1;
		myArr[1] = 5;
		myArr[2] = 2;
		myArr[3] = -8;
		myArr[9] = 100;

		}

	public static void main(String[] args) {
//        minValueFromArr();
		firstFive();
	}

	public static int firstFive() {
		int sum = Arrays.stream(myArr).limit(5).sum();
		System.out.println(sum);
		return sum;
	}

	private static void minValueFromArr() {
		int minn = Arrays.stream(myArr).min().getAsInt();
		System.out.println(minn);
	}
}
