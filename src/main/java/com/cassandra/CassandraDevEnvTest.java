package com.cassandra;

import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

import com.datastax.spark.connector.japi.CassandraJavaUtil;
import com.datastax.spark.connector.japi.CassandraRow;
import com.datastax.spark.connector.japi.rdd.CassandraJavaRDD;

public class CassandraDevEnvTest {

	public static void main(String[] args) {

		SparkConf sparkConf = new SparkConf();
		sparkConf.setAppName("Spark-Cassandra Integration");
		sparkConf.setMaster("spark://dllu0003:7077");
		sparkConf.set("spark.cassandra.connection.host", "10.172.11.59");

		JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);

		String keySpaceName = "cap_er1";
		String tableName = "engagementreports";

		CassandraJavaRDD<CassandraRow> cassandraRDD = CassandraJavaUtil.javaFunctions(javaSparkContext)
				.cassandraTable(keySpaceName, tableName);

		JavaRDD<CassandraDevEnvBean> userRDD = cassandraRDD.map(new Function<CassandraRow, CassandraDevEnvBean>() {

			private static final long serialVersionUID = 1L;

			public CassandraDevEnvBean call(CassandraRow row) throws Exception {
				CassandraDevEnvBean bean = new CassandraDevEnvBean();
				bean.setCoursekey(row.getString("coursekey"));
				bean.setEngagementreport(row.getString("engagementreport"));
				return bean;
			}

		});

		List<CassandraDevEnvBean> listEmpBeans = userRDD.collect();

		for (CassandraDevEnvBean e : listEmpBeans) {
			System.out.println(e.getCoursekey() + " " + e.getEngagementreport());
		}

		System.out.println("here");

	}

}
