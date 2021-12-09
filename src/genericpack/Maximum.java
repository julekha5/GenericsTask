package genericpack;

import java.util.Scanner;

public class Maximum {
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

	// Take input as a string
	public void findMaxString() {
		Maximum mx = new Maximum();
		System.out.println("Enter 3 Strings ");
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();

		System.out.println("Maximum String is:"+mx.findMax(str1, str2, str3));
	}

	public static void main(String[] args) {
		Maximum mx = new Maximum();
		System.out.println("Welcome to Generic Practice Problem");
		mx.findMaxString();

	}
}
