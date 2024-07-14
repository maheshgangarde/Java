package test.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		//System.out.println(hs);
		hs.remove(40);
		hs.add(50);
		//Print Hash Set
		/*for(Integer IntD:hs)
		{
			System.out.println(IntD);
		}*/
		Iterator itr= hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
