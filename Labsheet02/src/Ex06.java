
public class Ex06 {

	public static void main(String[] args) {
		
		ArrayController nums = new ArrayController();
		nums.display("All elements: ");
		
		int[] new_nums = new int [nums.getSize()-1];
		
		int delete_index = 2;
		
		for (int i=0; i<delete_index; i++) {
			
		}
		
		
		for (int i=delete_index; i<nums.getSize();  i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted idex 2: ");
	}

}
