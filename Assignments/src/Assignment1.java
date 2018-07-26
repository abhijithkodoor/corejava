import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(55);
		list1.add(542);
		list1.add(64653);
		list1.add(234);
		list1.add(245);
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(4554);
		list2.add(564);
		list2.add(55);
		list2.add(233);
		list2.add(234);
		
		for (Integer object : list1) {
			if(!list2.contains(object)) {
				list2.add(object);
			}
		}
		
		System.out.println(list2);
	}

}
