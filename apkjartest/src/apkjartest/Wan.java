/**  
 * @Project: apkjartest
 * @Title: Wan.java
 * @Package: apkjartest
 * @Description: TODO
 * @author: QIJJ 
 * @since: 2018��9��8�� ����11:27:56
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
 * @since: 2018��9��8�� ����11:27:56 
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
		System.out.println("foreach��ʱ��"+(endTime-startTime));
		long st = System.nanoTime();
		for (int i = 0; i < num.length; i++) {
			numb += Integer.parseInt(num[i].trim().toString());
		}
		long et = System.nanoTime();
		System.out.println("forѭ����ʱ��"+(et-st));
		int ff = num.length;
		long sts = System.nanoTime();
		for (int i = 0; i < ff; i++) {
			numb += Integer.parseInt(num[i].trim().toString());
		}
		long ets = System.nanoTime();
		System.out.println("forѭ����ʱ ѭ�����ȶ��������棺"+(ets-sts));
	}
	
	public static void test(){
		//ʵ����arrayList
        List<Integer> arrayList = new ArrayList<Integer>();
        //ʵ����linkList
        List<Integer> linkList = new LinkedList<Integer>();

        //����10��������
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkList.add(i);
        }

        Integer array = 0;
        //��forѭ��arrayList
        long arrayForStartTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            array = arrayList.get(i);
        }
        long arrayForEndTime = System.currentTimeMillis();
        System.out.println("��forѭ��arrayList 10��λ���ʱ�䣺" + (arrayForEndTime - arrayForStartTime) + "����");
        
        //��forѭ��arrayList �����ȷ�������
        int z = arrayList.size();
        long aft = System.currentTimeMillis();
        for (int i = 0; i < z; i++) {
            array = arrayList.get(i);
        }
        long af = System.currentTimeMillis();
        System.out.println("��forѭ��arrayList10��Σ������ȷ������� ������ʱ�䣺" + (af - aft) + "����");

        //��foreachѭ��arrayList
        long arrayForeachStartTime = System.currentTimeMillis();
        for (Integer in : arrayList) {
            array = in;
        }
        long arrayForeachEndTime = System.currentTimeMillis();
        System.out.println("��foreachѭ��arrayList 10��λ���ʱ�䣺" + (arrayForeachEndTime - arrayForeachStartTime) + "����");

        //��forѭ��linkList
        long linkForStartTime = System.currentTimeMillis();
        Integer link = 0;
        for (int i = 0; i < linkList.size(); i++) {
            link = linkList.get(i);
        }
        long linkForEndTime = System.currentTimeMillis();
        System.out.println("��forѭ��linkList 10��λ���ʱ�䣺" + (linkForEndTime - linkForStartTime) + "����");

        
       //��forѭ��linkList �����ȷ�������
        int zz = linkList.size();
        long lst = System.currentTimeMillis();
        Integer li = 0;
        for (int i = 0; i <zz ; i++) {
            li = linkList.get(i);
        }
        long lfet = System.currentTimeMillis();
        System.out.println("��forѭ��linkList,�����ȷ�������  10��λ���ʱ�䣺" + (lfet - lst) + "����");

        
        
        //��froeachѭ��linkList
        long linkForeachStartTime = System.currentTimeMillis();
        for (Integer in : linkList) {
            link = in;
        }
        long linkForeachEndTime = System.currentTimeMillis();
        System.out.println("��foreachѭ��linkList 10��λ���ʱ�䣺" + (linkForeachEndTime - linkForeachStartTime) + "����");
	}
}
