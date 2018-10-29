package apkjartest.entity;
/**
 * 在泛型接口、泛型类和泛型方法的定义过程中，我们常见的如T、E、K、V等形式的参数常用于表示泛型形参，用于接收来自外部使用时候传入的类型实参
 * @author 18911
 *
 * @param <T>
 */
public class Book<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Book() {
	
	}
	

	public Book(T data) {
		super();
		this.data = data;
	}
	
}
