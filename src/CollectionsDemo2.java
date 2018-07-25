import java.util.*;
public class CollectionsDemo2 {

	public static void main(String[] args) {
		Vector v=new Vector(3);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("one");
		v.add("two");
		v.add("three");
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("four");
		System.out.println(v.capacity());
		System.out.println(v.size());
		LinkedList l1=new LinkedList();
		l1.add("java");
		l1.add("c++");
		l1.add("php");
		l1.add("python");
		//reading using for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		//reading using iterator
		Iterator it =v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator It=v.listIterator(v.size());
		
		while (It.hasPrevious()) {
			System.out.println(It.previous());
		}

	}

}
