package test;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		List list2=list1;
		List<String> list3=new ArrayList();
		for(Object obj:list3) {
			System.out.println(obj);
		}
	}
}
