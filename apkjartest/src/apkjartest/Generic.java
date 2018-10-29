package apkjartest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import apkjartest.entity.Book;

/**
 * 泛型练习
 * @author 18911
 *
 */
public class Generic {

	public static void main(String[] args) {
		Book<String> book = new Book<String>("English");
		//System.out.println("book:"+book.getData());
		testClass(book);
	}
	
	public static void testDiff() {
		Book<String> book = new Book<String>("English");
		Book<Integer> age = new Book<Integer>(755);
		System.out.println("book class"+book.getClass());
		System.out.println("age class"+age.getClass());
	}
	
	public static <E> void testClass(E e) {
		//getClass().getGenericSuperclass()返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
		Type genType = e.getClass().getGenericSuperclass();
		 System.out.println(genType);
		 
		 //然后将其转换ParameterizedType getActualTypeArguments()返回表示此类型实际类型参数的 Type 对象的数组
		 Type[] param = ((ParameterizedType) genType).getActualTypeArguments();
		 System.out.println(param);
		 
		 //getSimpleName 得到类的简写名称
		 String className = ((Class<?>) param[0]).getSimpleName();
		 System.out.println(className);
		 
		 StringBuffer hql = new StringBuffer("from "+className+" t1 where 1=1");
		 System.out.println(hql);
	}
}
