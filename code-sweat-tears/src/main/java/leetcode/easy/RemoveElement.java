package leetcode.easy;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		System.out.println(re.removeElement(new int[]{3,2,2,3}, 3));
		System.out.println(re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
	}
	
		public int removeElement(int[] nums, int val) {
        
			int counter = 0;
			for(int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
	                nums[counter++] = nums[i];
	            }
			}
			
			return counter;
    }
}
