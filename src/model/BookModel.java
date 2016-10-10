package model;
import java.sql.*;
import java.util.ArrayList;


import entity.Book;
import connection.BookConnection;
 
public class BookModel {
	
	public static   ArrayList<Book> findsql(String sql)
    {
        ArrayList<Book> list=new ArrayList<Book>();
         try
         {
             BookConnection connection=new BookConnection();
             Connection mycon=connection.getConnection();
             Statement st=mycon.createStatement();
             ResultSet set=st.executeQuery(sql);  
	            while(set.next())
	            {    Book book=new Book();
	            	 book.setIsbn(set.getString("ISBN"));
	                 book.setTitle(set.getString("Title"));
	                 book.setPrice(set.getDouble("Price"));
	                 book.setPublisher(set.getString("Publisher"));
	                 book.setPublishDate(set.getDate("PublishDate"));
	                 book.setAuthorID(set.getInt("AuthorID"));
	              
	                 book.setAge(set.getInt("Age"));
	                 book.setName(set.getString("Name"));
	                 book.setCountry(set.getString("Country"));
	                 list.add(book);
	                 
	                 System.out.println(set.getString("Name")); 
	                
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return list;
	    }


	    
	
    public void delete(String AbanISBN)
    {
            try {
                BookConnection connection=new BookConnection();
                Connection mycon=connection.getConnection();
                Statement st=mycon.createStatement();
                
                st.executeUpdate("delete from Book where ISBN='"+AbanISBN+"'");
               // String sql ="delete from Book where ISBN='"+AbanISBN+"'";
                connection.closeConnection(mycon);
            } catch (Exception e) {
                
            }
    }
  
  // TODO:输入作者名字，查询该作者所著的全部图书的题目
   
}