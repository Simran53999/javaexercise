package com.rakuten.training;

public class StreamsOfObjectsVsIntStream {

	public static void main(String[] args) {
		Integer[] intObjects = {1,2,3,4};
		int[] ints={1,2,3,4};
		intObjects[0]++;
		ints[0]++;
		System.out.println(intObjects[0]+"--------------------"+ints[0]);
		// TODO Auto-generated method stub

	}

}
