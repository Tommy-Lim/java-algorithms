package Algorithms;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
	
	public static void RemoveAndPrint() {
		int[] numbers = new int[]{1,2,3,3,3,4,4,5};
		System.out.println(numbers[0]);
		for(int i=0; i<(numbers.length-1); i++){	
			if(numbers[i]!=numbers[i+1]){
				System.out.println(numbers[i+1]);
			}
		}	
	}
	
	public static void RemoveAndPrintAndChangeArray() {
		int[] numbers = new int[]{1,2,2};
		int count = 1;
		System.out.println("Begin array is: "+Arrays.toString(numbers));
		if(numbers.length==0) {
			count = 0;
		} else if(numbers.length==1){
			count = 1; 
		} else {	
			for(int i=0; i<(numbers.length-1)&&(numbers[i]!=numbers[numbers.length-1]); i++){	
				while(numbers[i]==numbers[i+1]&&numbers[i]!=numbers[numbers.length-1]){
					for(int j=i; j<(numbers.length-1); j++){
						numbers[j]=numbers[j+1];
					}
					//System.out.println(Arrays.toString(numbers));
				}
				count++;
			}
		}	
		System.out.println("count is:"+count);
		System.out.println("Final array is: "+Arrays.toString(numbers));
		System.out.println("Final array is: "+Arrays.toString(Arrays.copyOfRange(numbers, 0, count)));
	}	

	public static int RemoveAndPrintAndChangeArraySOLN(int nums[]){
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
}
