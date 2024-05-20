package com.nt.lamda;

import java.util.Arrays;


interface sum {
	public int sum1(int a, int b);

}

public class DuplicateOccurence {

	public static void main(String[] args) {
		String str = "javaavv";

		char[] arr = str.toCharArray();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break; // Exit the inner loop when characters are no longer equal
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + "   " + count);
				i = i + count - 1; // Skip counting already processed characters
			}
		}
		
	  
		
	}
}

