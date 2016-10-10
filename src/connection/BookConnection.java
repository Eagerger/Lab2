package connection;
//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
//import java.sql.PreparedStatement;
/**
 * 数据库操作父类：连接和关闭数据库
 * @author peixun
 *
 */
public class BookConnection{
	/**
	 * 获得数据库连接
	 * @return
	 */
	public Connection getConnection()
	{   
		//初始化一个数据库连接
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //加载MYSQL JDBC驱动程序
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://fprcigagcuxv.rds.sae.sina.com.cn:10596/root","root","w199642");}
			catch (Exception e) {
				System.out.print("Error loading Mysql Driver!");
				e.printStackTrace();
				}
		
		return conn;
	}
	 public void closeConnection(Connection con)
	    {
	        if(con!=null)
	            try {
	                con.close();
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	    }


	
}
