package entity;
import java.util.Date;
public class Book {
private String ISBN;
private String Title;
private double Price;
private Date PublishDate;
private String Publisher;
private int AuthorID;
private String Name;
private int Age;
private String Country;
public Book() { 
}
public Book(String ISBN, String Title, double Price,Date PublishDate,
String Publisher,int AuthorID,String Name, int Age,String Country) {
this.ISBN = ISBN;
this.Title = Title;
this.Price = Price;
this.PublishDate = PublishDate;
this.Publisher = Publisher;
this.AuthorID = AuthorID;
this.Name = Name;
this.Age = Age;
this.Country = Country;
}
public String getIsbn() {
return ISBN;
}
public void setIsbn(String isbn) {
this.ISBN = isbn;
}
public double getPrice() {
return Price;
}
public void setPrice(double price) {
this.Price = price;
}
public String getTitle() {
return Title;
}
public void setTitle(String title) {
this.Title = title;
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

public String getName() {
	return Name;
}
public void setName(String Name) {
	this.Name = Name;
}
public int getAge() {
	return Age;
}
public void setAge(int  Age) {
	this.Age = Age;
} 
public String getCountry()  {
	return Country;
}
public void setCountry(String Country){
	this.Country = Country;
}
}