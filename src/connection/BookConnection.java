package connection;
//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
//import java.sql.PreparedStatement;
/**
 * ���ݿ�������ࣺ���Ӻ͹ر����ݿ�
 * @author peixun
 *
 */
public class BookConnection{
	/**
	 * ������ݿ�����
	 * @return
	 */
	public Connection getConnection()
	{   
		//��ʼ��һ�����ݿ�����
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //����MYSQL JDBC��������
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
