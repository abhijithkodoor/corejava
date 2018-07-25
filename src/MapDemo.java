import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		LinkedHashMap ha=new LinkedHashMap();
		ha.put(1, "Guru");
		ha.put(2, "Jack");
		ha.put(3, "Peter");
		System.out.println(ha);
		System.out.println(ha.get(2));
		List keys=(List)ha.keySet();
		ListIterator it=keys.listIterator(keys.size());
		while(it.hasPrevious()) {
			Integer key=(Integer)it.previous();
			System.out.println(ha.get(key));
		}

	}

}
