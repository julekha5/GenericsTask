package genericpack;

import java.util.Scanner;

public class Maximum<T> {

	T a;
	T b;
	T c;

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Maximum(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/*
	 * Method for finding maximum number (int,float,string)
	 */
	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

		T max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		Maximum mx = new Maximum(args, args, args);
		System.out.println("Welcome to Generic Practice Problem");
		System.out.println("The Max Integer is:" + mx.findMax(7, 8, 9));
		System.out.println("The Max Float is:" + mx.findMax(4.6, 5.3, 6.7));
		System.out.println("The Max String is:" + mx.findMax("apple", "banana", "peach"));

	}
}
