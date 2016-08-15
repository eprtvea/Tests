package com.spark;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkExecutor {
	
	public static void main(String[] args) {
		

		SparkConf conf = new SparkConf();
		conf.setAppName("SparkThread");
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
		JavaRDD<String> rdd = sc.parallelize(places);
		
		System.out.println(rdd.collect().size());
	}

}
