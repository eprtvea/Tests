package com.java8;

public interface DefualtInterface {
	double Calcutate(int a);
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
