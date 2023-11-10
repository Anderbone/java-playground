package generic;

import java.util.Arrays;

interface MyCompare<T extends Comparable<T>>{
	T min();
	T max();

	static <E extends Comparable<E>> int compareTo(E e, E e1) {
		return e.compareTo(e1);
	}
}

public class GenericCompare<E extends Comparable<E>> implements MyCompare<E>{
	E[] array;

	GenericCompare(E[] array){
		this.array = array;
	}

	@Override
	public E min() {
		return Arrays.stream(array).min(MyCompare::compareTo).get();
	}

	@Override
	public E max() {
		return null;
	}

	public static void main(String[] args) {
		Integer[] nums = {1, -2, 2, 3};
		GenericCompare<Integer> g = new GenericCompare<>(nums);
		System.out.println(g.min());
		System.out.println(g.max());}
}
