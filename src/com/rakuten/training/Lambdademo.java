
/*
*package com.rakuten.training;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambdademo {
	public static int echecker(String s1, String s2) {// arity is two strings in , one int out, if this non static then it can't be called like it - Lambda 
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		//List<String> strings = new ArrayList<>(Arrays.asList(SortDemo.strings));
		//Collections.sort(strings, (s1,s2) -> s1.length() - s2.length());
		System.out.println(strings);
//		Collections.sort(strings,LambdaDemo::eChecker);
		Lambdademo obj = new Lambdademo();
		Collections.sort(strings,obj::eChecker);
		System.out.println(strings);
	}
	
	String lengthier = betterString ("hi","Hello" ,(s1,s2 -> s1.length()>s2.length());
	System.out.println();
	
}
*/