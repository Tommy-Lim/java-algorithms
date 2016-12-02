package Algorithms;

import java.util.Arrays;

public class TwoSum {
	
	public static void twoSum() {
        int[] numbers = new int[]{1,1,1,2,7,11,11,13};
        int target = 15;
        int sum=0;
        int[] index = new int[]{0,0};
        outerLoop:
        for(int j=0; j<numbers.length;j++){
            for(int i=j+1; i<numbers.length; i++){
                sum=numbers[i]+numbers[j];
                if(sum==target&&i!=j){
                    index[0]=j+1;
                    index[1]=i+1;
                    break outerLoop;
                }    
            }
            while(numbers[j]==numbers[j+1]){
                j++;
            }
            
        }
        System.out.println(Arrays.toString(index));
    }

	public static void twoSumSOLN(){
		int[] numbers = new int[]{1,1,1,2,7,11,11,13};
        int target = 15;
        int[] index = new int[]{0,0};
        int start = 0;
        int end = numbers.length-1;
        outerLoop:
        while(start<end){
        	if(numbers[start]+numbers[end]<target){
        		start++;
        	} else if (numbers[start]+numbers[end]>target){
        		end--;
        	} else{
        		index[0]=start+1;
        		index[1]=end+1;
        		break outerLoop;
        	}
        		
        }
        System.out.println(Arrays.toString(index));
		
	}

}
