package sqoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;

public class DownloadBySqoop {

	/**
	 * 从hdfs导出到Mysql
	 * @param ip 数据库服务器地址
	 * @param database 数据库名
	 * @param username 数据库用户名
	 * @param password 数据库密码
	 * @param table 表名
	 * @param src hdfs文件地址
	 * @param map map数
	 * @return
	 */
	public static String exportHDFStoSQL(String ip, String database,String username, 
			String password, String table, String src, String map){
		
		Configuration conf = new Configuration();
		// 必须配置conf，否则无法提交至集群
		conf.set("mapreduce.framework.name", "yarn");  
	    conf.set("yarn.resourcemanager.address", "tseg0:8032");
	    conf.set("yarn.resourcemanager.scheduler.address", "tseg0:8030");        
	    conf.set("fs.defaultFS", "hdfs://tseg0:9010");
	    
	    String mySqlURL = "jdbc:mysql://" + ip + ":3306" + "/" + database;
	    String[] options = getOptions(mySqlURL, username, password, table, src, map);
	    
	    //打印sqoop导出参数
	    for(String op : options)
	    	System.out.println("--options--	" + op);
	    
	    try {
	    	System.out.println("ExportBySqoop---run");
		    int ret = Sqoop.runTool(options, conf);
		    if(ret != 0){
		    	throw new RuntimeException("Sqoop failed - return code " + Integer.toString(ret));
		    }
		    System.out.println("Sqoop Job Complete!");
	    } catch(Exception e){
	    	e.printStackTrace();
	    	return "false";
	    }
		return "true";
	}
	
	/**
	 * 配置sqoop导出参数
	 * @param url JDBC url
	 * @param username 数据库密码
	 * @param password 数据库用户名
	 * @param tableName 表名
	 * @param src hdfs文件地址
	 * @param map map数
	 * @return
	 */
	public static String[] getOptions(String url, String username, String password, String tableName, String src, String map){
		
		String[] options = new String[30];
		int current = 0;
		
		options[current ++] = "export";
		options[current ++] = "--connect";
		options[current ++] = url;
//		options[current ++] = "--hadoop-mapred-home"; // web工程必须指定HADOOP_HOME，否则无法找到Hadoop相关依赖包
//		options[current ++] = "/home/tseg/hadoop-2.6.0";
		options[current ++] = "--username";
		options[current ++] = username;
		options[current ++] = "--password";
		options[current ++] = password;
		options[current ++] = "--table";
		options[current ++] = tableName;
		options[current ++] = "--export-dir";
		options[current ++] = src;
		options[current ++] = "-m";
		options[current ++] = map;
		
		while(current < options.length){
			options[current ++] = "";
		}
		
		return options;
	}
	
	public static void main(String[] args) {
		
		//测试参数		
		String ip = "tseg0";
		String database = "bcpdm_web";
		String dbUser = "bcpdm";
		String dbPassword = "bcpdm";
		String tableName = "company_info_test22"; // 该表必须存在，并且为空
		String src = "hdfs://tseg0:9010/user/tseg/saijinchen/company_info";
		String map = "1";
				
		DownloadBySqoop.exportHDFStoSQL(ip, database, dbUser, dbPassword, tableName, src, map);
	}
	
}
