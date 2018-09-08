/**  
 * @Project: apkjartest
 * @Title: Wan.java
 * @Package: apkjartest
 * @Description: TODO
 * @author: QIJJ 
 * @since: 2018年9月8日 上午11:27:56
 * @Copyright: 2018. All rights reserved.
 * @Version: v1.0   
 */
package apkjartest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**  
 * @ClassName Wan
 * @Description: TODO  
 * @author: QIJJ  
 * @since: 2018年9月8日 上午11:27:56 
 */
public class Wan {

	String redColor = "red";
	String blueColor = "blue";
	String greenColor = "grenn";
	
	
	public static void main(String[] args) {
		test();
		
	}
	public static void haha(){
		Scanner scanner = new Scanner(System.in);
		String numstr = scanner.nextLine();
		String num[] = numstr.split(",");
		int numb = 0;
		long startTime = System.nanoTime();
		for (String rbg : num) {
			numb += Integer.parseInt(rbg.trim().toString());
		}
		long endTime = System.nanoTime();
		System.out.println("foreach耗时："+(endTime-startTime));
		long st = System.nanoTime();
		for (int i = 0; i < num.length; i++) {
			numb += Integer.parseInt(num[i].trim().toString());
		}
		long et = System.nanoTime();
		System.out.println("for循环耗时："+(et-st));
		int ff = num.length;
		long sts = System.nanoTime();
		for (int i = 0; i < ff; i++) {
			numb += Integer.parseInt(num[i].trim().toString());
		}
		long ets = System.nanoTime();
		System.out.println("for循环耗时 循环长度定义在外面："+(ets-sts));
	}
	
	public static void test(){
		//实例化arrayList
        List<Integer> arrayList = new ArrayList<Integer>();
        //实例化linkList
        List<Integer> linkList = new LinkedList<Integer>();

        //插入10万条数据
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkList.add(i);
        }

        Integer array = 0;
        //用for循环arrayList
        long arrayForStartTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            array = arrayList.get(i);
        }
        long arrayForEndTime = System.currentTimeMillis();
        System.out.println("用for循环arrayList 10万次花费时间：" + (arrayForEndTime - arrayForStartTime) + "毫秒");
        
        //用for循环arrayList 将长度放在外面
        int z = arrayList.size();
        long aft = System.currentTimeMillis();
        for (int i = 0; i < z; i++) {
            array = arrayList.get(i);
        }
        long af = System.currentTimeMillis();
        System.out.println("用for循环arrayList10万次，将长度放在外面 。花费时间：" + (af - aft) + "毫秒");

        //用foreach循环arrayList
        long arrayForeachStartTime = System.currentTimeMillis();
        for (Integer in : arrayList) {
            array = in;
        }
        long arrayForeachEndTime = System.currentTimeMillis();
        System.out.println("用foreach循环arrayList 10万次花费时间：" + (arrayForeachEndTime - arrayForeachStartTime) + "毫秒");

        //用for循环linkList
        long linkForStartTime = System.currentTimeMillis();
        Integer link = 0;
        for (int i = 0; i < linkList.size(); i++) {
            link = linkList.get(i);
        }
        long linkForEndTime = System.currentTimeMillis();
        System.out.println("用for循环linkList 10万次花费时间：" + (linkForEndTime - linkForStartTime) + "毫秒");

        
       //用for循环linkList 将长度放在外面
        int zz = linkList.size();
        long lst = System.currentTimeMillis();
        Integer li = 0;
        for (int i = 0; i <zz ; i++) {
            li = linkList.get(i);
        }
        long lfet = System.currentTimeMillis();
        System.out.println("用for循环linkList,将长度放在外面  10万次花费时间：" + (lfet - lst) + "毫秒");

        
        
        //用froeach循环linkList
        long linkForeachStartTime = System.currentTimeMillis();
        for (Integer in : linkList) {
            link = in;
        }
        long linkForeachEndTime = System.currentTimeMillis();
        System.out.println("用foreach循环linkList 10万次花费时间：" + (linkForeachEndTime - linkForeachStartTime) + "毫秒");
	}
}
