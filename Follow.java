class Follow{
public static void main(String args[]){

 int[] nums={2,3,5};
 int[] r=fix(nums);
 System.out.println(r);
}
public static int[] fix(int[] nums) {

	   if (nums[0] == 2 && nums[1] == 3)
	   nums[1] = 0;
	   if (nums[1] == 2 && nums[2] == 3)
              nums[2] = 0; 
              return new int[] {nums[0],nums[1],nums[2]};
}
}