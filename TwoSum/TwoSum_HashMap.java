import java.util.*;

public class TwoSum{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                // Input Array
                System.out.println("Please enter the size of the array");
                int arr_size = 0;
                if (sc.hasNextInt()) {
                        arr_size = sc.nextInt();
                }

                int[] arr = new int[arr_size];

                System.out.println("Enter the elements of the array:");
                for (int i=0; i<arr_size; i++) {
                        if(sc.hasNextInt()){
                                arr[i] = sc.nextInt();
                        }
                }

                // Input target
                System.out.println("Please enter target");
                int target = 0;
                if (sc.hasNextInt()) {
                        target = sc.nextInt();
                }


                int[] result = twoSum(arr,target);
                System.out.println(Arrays.toString(result));
        }


        public static int[] twoSum(int[] nums, int target) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			
                        if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i],i);
                }
		return new int[2];
        }
}
