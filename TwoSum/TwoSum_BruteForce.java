import java.util.Scanner;
import java.util.Arrays;

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
		int[] result = new int[2];
		for (int i=0; i<nums.length; i++) {
			for (int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;

					return result;
				}
			}
		}
		return result;
	}
}
