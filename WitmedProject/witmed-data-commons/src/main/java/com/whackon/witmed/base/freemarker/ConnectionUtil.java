package com.whackon.witmed.base.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b></b>
 *
 * @author Administrator
 * @date 2022/1/5
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConnectionUtil {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/witmed_db?useUnicode=true&characterEncoding=UTF-8&server" +
			"Timezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
	private static String username = "root";
	private static String userpassword = "root";

	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	static {
		try {

		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		Connection connection = threadLocal.get();
		if (connection == null){
			try {
				connection = DriverManager.getConnection(url,username,userpassword);
				threadLocal.set(connection);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return connection;
	}
}
