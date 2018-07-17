package com.djelroy.algopbsolving.sorting;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class BubbleSort {
	
	static void sort(int[] elems) {
		int tmp = -1;
		
		for(int j = elems.length - 1; j >= 0; j--) {
			for(int i = 0; i < j; i++) {
				if(elems[i] > elems[i + 1]) {
					tmp = elems[i + 1];
					elems[i + 1] = elems[i];
					elems[i] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] elems = {5, 4, 1, 13, 2, 1};
		
		IntConsumer print = i -> System.out.print(i + " ");
		
		System.out.print("Array before bubble sort: [ ");
		Arrays.stream(elems).forEach(print);
		System.out.println("]");
		
		System.out.print("\nArray after bubble sort: [ ");

		BubbleSort.sort(elems);
		Arrays.stream(elems).forEach(print);
		System.out.println("]");
		
	}
}
