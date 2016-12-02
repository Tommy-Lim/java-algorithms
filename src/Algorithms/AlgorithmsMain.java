package Algorithms;

public class AlgorithmsMain {

	public static void main(String[] args){
		
		//**************REMOVE DUPLICATES
		
		//Prints all elements of sorted array excluding duplicates
		//Algorithms.RemoveDuplicatesSortedArray.RemoveAndPrint();
		
		//Prints and "slides" out duplicates and return length of new array
		//Algorithms.RemoveDuplicatesSortedArray.RemoveAndPrintAndChangeArray();
		
		//Prints and "slides" out duplicates and return array using length - online soln
		//Algorithms.RemoveDuplicatesSortedArray.RemoveAndPrintAndChangeArraySOLN();
		
		//**************FIND SUM
		
		//FIND SUM of target within sorted array - good for any array
		//Algorithms.TwoSum.twoSum();
		
		//FIND SUM - solution which has start and end points and converges knowing array is sorted
		//Algorithms.TwoSum.twoSumSOLN();
		
		//**************HASH MAP
		
		//HASH MAP - Find if two phrases are made of the same letters; anagram
		//Algorithms.HashAnagram.HashAnaMINE();
		
		
		//Their solution which sorts the two arrays then says if they equal each other
		//Algorithms.HashAnagram.isAnagramSORT();
		
		//Their solution which counts and adds each instance of a character for one string and deducts for the other.  If final counts==0 then they are the same
		//Algorithms.HashAnagram.isAnagramARRAY(); 
		
		//Their solution which counts one string then says deduct for other and if result ever less than zero, then end.
		//Algorithms.HashAnagram.isAnagramARRAYQuick();
		
	}
	
}
