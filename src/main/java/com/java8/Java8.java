package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Java8 {

	public static void main(String[] args) {
		
		
//		Default Methods for Interfaces
//		DefualtInterface def = new DefualtInterface() {
//			@Override
//			public double Calcutate(int a) {
//				return a + 1;
//			}
//		};
//		
//		System.out.println(def.Calcutate(10));
//		System.out.println(def.sqrt(100));
//		
		
		
//		Lambda expressions
/*		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names,(a,b) -> a.compareTo(b));
		System.out.println(names);*/
		
//		Predicates
//		Predicate<String> predicate = (s) -> s.length() > 0;
//		System.out.println(predicate.test(""));
		
//		Functions
//		Function<String,Integer> toInteger = Integer::valueOf;
//		System.out.println(toInteger.apply("1"));
		
//		Optionals 
//		Optional<String> optional = Optional.of("bam");
//		System.out.println(optional.isPresent());
	
		
//		Streams
//		List<String> stringCollection = new ArrayList<>();
//		stringCollection.add("ddd2");
//		stringCollection.add("aaa2");
//		stringCollection.add("bbb1");
//		stringCollection.add("aaa1");
//		stringCollection.add("bbb3");
//		stringCollection.add("ccc");
//		stringCollection.add("bbb2");
//		stringCollection.add("ddd1");
//
//		stringCollection
//		.stream()
//		.filter(s -> s.startsWith("a"))
//		.forEach(s -> System.out.println(s));
		
//		int max = 1000000;
//		List<String> values = new ArrayList<>(max);
//		for (int i = 0; i < max; i++) {
//		    UUID uuid = UUID.randomUUID();
//		    values.add(uuid.toString());
//		}

//		Sequential Sort
//		long t0 = System.nanoTime();
//
//		long count = values.stream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("sequential sort took: %d ms", millis));
//		
		
//		Parallel Sort
//		long t0 = System.nanoTime();
//
//		long count = values.parallelStream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("parallel sort took: %d ms", millis));
		
		
		
	}

}
