package com.ldu.bean;

public class Book {
	private String bookName;
	private int price;
	private int count;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", count="
				+ count + "]";
	}
	
	
}
