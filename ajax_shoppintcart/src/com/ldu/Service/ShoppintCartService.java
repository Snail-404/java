package com.ldu.Service;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ldu.bean.Book;

public class ShoppintCartService {
	private Map<String, Book> items = new HashMap<String, Book>();
	private String bookName;

	public void addToCart(String name, int price) {
		this.bookName=name;
		// �ж�map���Ƿ����и���
		if (items.containsKey(name)) {
			// ��������ø���������1
			Book book = items.get(name);
			book.setCount(book.getCount() + 1);
		} else {
			// ���û�����½�һ�����󣬼���map��
			Book book1 = new Book();
			book1.setBookName(name);
			book1.setCount(1);
			book1.setPrice(price);

			items.put(name, book1);
		}
	}

	// ���㹺�ﳵ���������Ŀ
	public int getBookCount() {
		int totalCount = 0;
		for (Book b : items.values()) {
			totalCount += b.getCount();
		}
		return totalCount;
	}

	// ���㹺�ﳵ������ܼ۸�
	public int getTotalPrice() {
		int totalPrice = 0;
		for (Book b : items.values()) {
			totalPrice += b.getPrice()*b.getCount();
		}
		return totalPrice;
	}

	public String getBookName() {
		return bookName;
	}
	@JsonIgnore
	public Map<String, Book> getItems() {
		return items;
	}

	public void setItems(Map<String, Book> items) {
		this.items = items;
	}
}
