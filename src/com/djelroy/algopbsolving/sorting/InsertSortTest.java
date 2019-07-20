package com.djelroy.algopbsolving.sorting;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class InsertSortTest {

	private InsertSort insertSort;
	
	@Before
	public void setUp() {
		insertSort = new InsertSort();
	}
	
	
	@Test
	public void testNegativeNums() {
		int[] nums = {-3, -2, -11};
		
		insertSort.sort(nums);		
		assertThat(nums, is(new int[] {-11, -3, -2}));
	}
	
	@Test
	public void testEmpty() {
		int[] emptyArray = new int[0];		

		insertSort.sort(emptyArray);		
		assertThat(emptyArray, is(new int[0]));
	}
	
	@Test
	public void testUniqueElem() {
		int[] oneElemArray = new int[]{1};		

		insertSort.sort(oneElemArray);
		assertThat(oneElemArray, is(new int[] {1}));
	}
	
	@Test
	public void test2Elements() {
		int[] twoElemArray = new int[]{45, 3};	

		insertSort.sort(twoElemArray);
		assertThat(twoElemArray, is(new int[] {3, 45}));
		
	}

	@Test
	public void testMoreThan2Elems() {
		int[] nums = {3, 2, 1, -40};
		
		insertSort.sort(nums);
		assertThat(nums, is(new int[] {-40, 1, 2, 3}));
	}

}
