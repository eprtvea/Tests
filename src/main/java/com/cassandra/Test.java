package com.cassandra;

import static com.datastax.spark.connector.japi.CassandraJavaUtil.javaFunctions;
import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapToRow;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;



public class Test {
	
	public static void main(String[] args) {
		SparkConf conf = new SparkConf();
		conf.setAppName("SparkRestClient");
		conf.set("spark.cassandra.connection.host","10.172.11.59");
		conf.setMaster("spark://dllu0003:7077");
		
		JavaSparkContext jsc = new JavaSparkContext(conf);
		
		List<CassandraCgiWorkspaceidBean> l = new ArrayList<>();
		l.add(getCassandraCgiWorkspaceidBean());
		
		JavaRDD<CassandraCgiWorkspaceidBean> cassandraRDD = jsc.parallelize(l);
				
		javaFunctions(cassandraRDD)
		.writerBuilder("spark", "cgiworkspaceidtable", mapToRow(CassandraCgiWorkspaceidBean.class))
		.saveToCassandra();
		
	}
	
	public static CassandraCgiWorkspaceidBean getCassandraCgiWorkspaceidBean() {

		CassandraCgiWorkspaceidBean casObj = new CassandraCgiWorkspaceidBean("hi","there");
		return casObj;

	}
}


