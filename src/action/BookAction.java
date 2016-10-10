package action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import connection.BookConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import entity.Book;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
import sun.awt.AppContext;
import model.*;
public class BookAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	private String AuthorName;
	private String ISBN;
	private String Title;
	private double Price;
	private Date PublishDate;
	private String Publisher;
	private int AuthorID;
	private String AbanISBN;
	
	private String BookTitle;
	private ArrayList srst,lrst,irst; 
	
	public String getAuthorName() {
		return AuthorName;
		}
	public void setAuthorName(String AuthorName) {
		this.AuthorName = AuthorName;
		}
	public String getBookTitle() {
		return BookTitle;
		}
	public void setBookTitle(String BookTitle) {
		this.BookTitle = BookTitle;
		}
	public String getAbanISBN() {
		return AbanISBN;
		}
	public void setAbanISBN(String AbanISBN) {
		this.AbanISBN = AbanISBN;
		}
	
	
	public String getIsbn() {
		return ISBN;
		}
	public void setIsbn(String Isbn) {
		this.ISBN = Isbn;
		}
	
	public double getPrice() {
		return Price;
		}
		public void setPrice(double Price) {
		this.Price = Price;
		}
		public String getTitle() {
		return Title;
		}
		public void setTitle(String Title) {
		this.Title = Title;
		} 
		public Date getPublishDate() {
		return PublishDate;
		}
		public void setPublishDate(Date PublishDate) {
		this.PublishDate = PublishDate;
		} 
		public String getPublisher() {
		return Publisher;
		}
		public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
		} 
		public int  getAuthorID() {
			return AuthorID;
		}
		public void setAuthorID(int  AuthorID) {
			this.AuthorID = AuthorID;
		}
	
	     public String showlist() throws SQLException
	    {
	    	  
	           String sql ="select * from Book natural join Author";
	           lrst = BookModel.findsql(sql);
	           ActionContext.getContext().put("lrst", lrst);
	         
	           return SUCCESS;
	    }
	     public String showinformation() throws SQLException
		    {
		    	  
		           String sql ="select * from Book natural join Author where Title = '"+BookTitle+"'" ;
		           irst = BookModel.findsql(sql);
		           ActionContext.getContext().put("irst", irst);
		           return SUCCESS;
		    }
	    
	    public String delete()
	    {
	    	BookModel model=new BookModel();
	        model.delete(AbanISBN);
	     
			return SUCCESS;
	       
	    }
	   
   
	    public String searchA() throws SQLException
	    {      
	       
	       String sql ="select * from Book a join Author b where a.AuthorID = b.AuthorID and b.Name = '"+AuthorName+"'";
           srst = BookModel.findsql(sql);
           ActionContext.getContext().put("srst", srst);
           return SUCCESS;
		}
	   
	  

	}
	   
	    

