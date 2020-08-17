package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();// generic
		System.out.println("-------------------Using Array-----------");
		list.add("Ram");
		list.add("Sita");
		list.add("Ravan");
		System.out.println(list);
		System.out.println("-------------------Using For Loop-----------");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------Using For enhanced-----------");
		for(String temp:list)
		{
			System.out.println(temp);
		}
		
		System.out.println("-------------------Using Iterator-----------");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
