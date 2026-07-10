import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		System.out.println("Length = " + numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.println("Length = " + numlist.size());
		System.out.println("All elements = " + numlist);
		
		
		int update_index = 2;
		int update_element = 20;
		
		numlist.set(update_index, update_element);
		System.out.println("Length = " + numlist);
		
		numlist.remove(2);
		System.out.println("Length = " + numlist);
		
		numlist.remove(14);
		System.out.println("Length = " + numlist);
	}

}
