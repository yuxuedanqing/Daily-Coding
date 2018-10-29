package apkjartest;

import apkjartest.entity.Book;

/**
 * 泛型练习
 * @author 18911
 *
 */
public class Generic {

	public static void main(String[] args) {
		Book<String> book = new Book<String>("English");
		System.out.println("book:"+book.getData());
	}
	
}
