import java.util.*;
public class ShuffleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		b.add(8);
		b.add(9);
		b.add(10);
		b.add(11);
		b.add(12);
		System.out.println("Before shuffling"+a);
		Collections.shuffle(a);
		System.out.println("Before shuffling"+a);
		Collections.sort(a);
		System.out.println(Collections.binarySearch(a, 1));
		Collections.copy(b, a);
		System.out.println(b);
	}

}
