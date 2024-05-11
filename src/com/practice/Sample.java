package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Sample {

	public static void main(String[] args) {

/*
		Functional fun=(s)->
			System.out.println(s);
		fun.run("Srikar");
*/
/*	
		int arr[]= {3,3,4,7,8};
		int d=5;
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					sum=arr[i]+arr[j]+arr[k];
					if(sum%d==0)
						count++;
					}
			}
		}
		
		System.out.println(count );
*/
/*		
		int n = 36;
		int b = 0;
		StringBuffer str = new StringBuffer();
		while (n != 1) {
			b = n % 2;
			n = n / 2;
			str.append(b);
			if (n == 0 || n == 1)
				str.append(n);
		
		}
		System.out.println(str.reverse());
		
		String binary=str.toString();
		System.out.println(binary);
		
		int pos=0;
		for(char c:binary.toCharArray()) {
			pos++;
			if(c=='1')
				System.out.print(pos);
				
		}
*/
/*		
		Function<String,Integer>fun=(s)->s.length();
		System.out.println(fun.apply("Srikar"));
		
		Predicate<String> pre=(s)->s.length()>7;
		System.out.println(	pre.test("Srikar"));
		
		Consumer<String> con=(s)->System.out.println(s);
		con.accept("Srikar");
		
		Supplier<String> sup=()->("Srikar");
		System.out.println(sup.get());
*/
		int arr[]= {3,3,4,7,8};
		
		Arrays.stream(arr).sorted().count();
		System.out.println(Arrays.stream(arr).sorted().count());
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("m", "1");
		map.put("b", "2");
		map.put("a", "0");
		
		
		TreeMap<String,String> treeMap=new TreeMap<>(map);
		treeMap.entrySet().stream().forEach(System.out::println);
		
		
		
	}

}
