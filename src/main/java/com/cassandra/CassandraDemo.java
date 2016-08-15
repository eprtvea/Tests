package com.cassandra;

import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

import com.datastax.spark.connector.japi.CassandraJavaUtil;
import com.datastax.spark.connector.japi.CassandraRow;
import com.datastax.spark.connector.japi.rdd.CassandraJavaRDD;

public class CassandraDemo {

	public static void main(String[] args) {
		SparkConf sparkConf = new SparkConf();
		sparkConf.setAppName("Spark-Cassandra Integration");
		sparkConf.setMaster("spark://dllu0003:7077");
		sparkConf.set("spark.cassandra.connection.host", "127.0.0.1");

		JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);

		String keySpaceName = "excelsior";
		String tableName = "emp";

		CassandraJavaRDD<CassandraRow> cassandraRDD = CassandraJavaUtil.javaFunctions(javaSparkContext)
				.cassandraTable(keySpaceName, tableName);

		JavaRDD<EmpBean> userRDD = cassandraRDD.map(new Function<CassandraRow, EmpBean>() {

			private static final long serialVersionUID = 1L;

			public EmpBean call(CassandraRow row) throws Exception {
				EmpBean empbean = new EmpBean();
				empbean.setEmpid(row.getInt("empid"));
				empbean.setDepitd(row.getInt("deptid"));
				empbean.setFirst_name(row.getString("first_name"));
				empbean.setLast_name(row.getString("last_name"));
				return empbean;
			}

		});

		List<EmpBean> listEmpBeans = userRDD.collect();

		for (EmpBean e : listEmpBeans) {
			System.out.println(e.getFirst_name());
		}

		System.out.println("here");

	}

}
