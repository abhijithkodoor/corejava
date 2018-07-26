import java.util.ArrayList;
import java.util.Collections;

public class Assignment3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(55);
		list1.add(542);
		list1.add(64653);
		list1.add(234);
		list1.add(245);
		list1.add(4554);
		list1.add(564);
		list1.add(55);
		list1.add(233);
		list1.add(234);
		
		Collections.unmodifiableCollection(list1);
		
		System.out.println(list1);
	}

}
