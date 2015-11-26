package sqoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;

/**
 * sqoop导入（从Mysql到HDFS）
 * @author tseg
 *
 */
public class UploadBySqoop {
 
	/**
	 * sqoop导入
	 * @param ip 数据库服务器地址
	 * @param database 数据库名
	 * @param tableName 表名
	 * @param dbUser 数据库用户名
	 * @param dbPassword 数据库密码
	 * @param dstHdfs 目的地址
	 * @return
	 * @throws IOException
	 */
	 public static String importSQLtoHDFS(String ip, String database, String tableName, String dbUser, String dbPassword, String columns, String dstHdfs, String map) throws IOException {
		 
		  Configuration conf = new Configuration();
	        
	      conf.set("mapreduce.framework.name", "yarn");  
	      conf.set("yarn.resourcemanager.address", "tseg0:8032");
	      conf.set("yarn.resourcemanager.scheduler.address", "tseg0:8030");        
	      conf.set("fs.defaultFS", "hdfs://tseg0:9010");
	        
		  String dst = "hdfs://tseg0:9010" + dstHdfs;
		  String url = "jdbc:mysql://" + ip + ":3306" + "/" + database;
		  String[] column = columns.split(",");
		  String split = column[0]; // 以第一个属性列为split
		  
		  String[] options = getOptions(url, tableName, dbUser, dbPassword, columns, split, dst, map);	
		  for(int i = 0; i < options.length; i ++) {
			  System.out.println("--options--	" + options[i]);
		  }
	 
		  try {
			  System.out.println("UpLoadBySqoop---run");			  
			  final int ret = Sqoop.runTool(options, conf);
			  if (ret != 0) {
			    throw new RuntimeException("Sqoop failed - return code " + Integer.toString(ret));
			  }
			  System.out.println("Sqoop Job Complete!");
			  
		  } catch(Exception e) {
			  e.printStackTrace();
			  return "false";
		  }
		  	return "true";	 
	 }

	 /**
	  * 获取sqoop导入参数
	  * @param url JDBC url
	  * @param tableName 表名
	  * @param dbUser 数据库用户名
	  * @param dbPassword 数据库密码
	  * @param dstHdfs 导入地址
	  * @return
	  */
	 public static String[] getOptions(String url, String tableName, String dbUser, String dbPassword, String columns, String split, String dstHdfs, String map) {
		 String[] options = new String[30];
		 int current = 0;
	 
		 options[current ++] = "import";
		 options[current ++] = "--connect";
		 options[current ++] = url;
//		 options[current ++] = "--hadoop-mapred-home";//web工程必须指定HADOOP_HOME，否则无法找到Hadoop相关依赖包
//		 options[current ++] = "/home/tseg/hadoop-2.6.0";
		 options[current ++] = "--username";
		 options[current ++] = dbUser;
		 options[current ++] = "--password";
		 options[current ++] = dbPassword;
		 options[current ++] = "--table";
		 options[current ++] = tableName;
		 options[current ++] = "--columns"; // 选择要导入的列
		 options[current ++] = columns; // 以逗号分隔的
		 options[current ++] = "--split-by";
		 options[current ++] = split;
		 options[current ++] = "--target-dir";
		 options[current ++] = dstHdfs;
		 options[current ++] = "-m";
		 options[current ++] = map;
		 
		 while (current < options.length) {
			 options[current++] = "";
		 }
	 
		 return options;
	 }
	 
	 public static void main(String[] args) throws IOException {
			
		//测试参数
		String	ip = "tseg0";
		String	database = "bcpdm_web";
		String	table = "company_info";
		String	uname = "bcpdm";
		String	passwd = "bcpdm";
//		String columns = "company_id,company_name";
		String columns = "company_id,company_name,company_description";
		String	dstHdfs = "/user/tseg/saijinchen/sqoop20";
		String map = "1";
		
		UploadBySqoop.importSQLtoHDFS(ip, database, table, uname, passwd, columns, dstHdfs, map);
	}
	 
}
