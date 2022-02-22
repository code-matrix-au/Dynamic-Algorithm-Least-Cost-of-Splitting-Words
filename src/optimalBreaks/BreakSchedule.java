package optimalBreaks;

import java.util.ArrayList;
import java.util.*;

public class BreakSchedule {

	// Use this class to implement programs for Tasks 2 & 3. Your file must not
	// change the package name,
	// nor the class name. You must not change the names nor the signatures of the
	// two program stubs
	// in this file. You may augment this file with any other method or
	// variable/data declarations that you
	// might need to implement the dynamic programming strategy requested for Tasks
	// 2&3.
	// Make sure however that all your declarations are public.

	ArrayList<Integer> arr= new ArrayList<Integer>();
	HashMap<String,Integer> mem = new HashMap<String,Integer>();

	int totalCost(String word, ArrayList<Integer> breakList) { // TODO Complete for Task 2
		if (breakList == null) {
			breakList = new ArrayList<Integer>();
		}
		breakList.removeIf(i -> (i >= word.length() - 1));
		
		System.out.println(word);
		System.out.println(breakList);
		

		if(mem.containsKey(word)) {  // check from memory if we have already calculated.
			System.out.println("from memory");
		return mem.get(word);
		}

		if (breakList.isEmpty() | (word.length() <= 1)) {
			mem.put(word,0);
			System.out.println("return: 0 got calculated");
			return 0;

		} else if (breakList.size() == 1) {
			mem.put(word, word.length());
			System.out.println("return: "+ word.length() + " got calculated");
			return word.length();

		} else {

			int min = 999999999;

			for (int i = 0; i < breakList.size(); i++) {

				ArrayList<Integer> Llist = new ArrayList<Integer>();
				ArrayList<Integer> Rlist = new ArrayList<Integer>();
				String lstring = word.substring(0, breakList.get(i) + 1);
				String Rstring=word.substring(breakList.get(i) + 1, word.length());
				
				for (int j = 0; j < i; j++) {
					Llist.add(breakList.get(j));
				}

				for (int j = i + 1; j < breakList.size(); j++) {
					Rlist.add(breakList.get(j)-breakList.get(i)-1);
				}

				int cost = word.length() + totalCost(lstring, Llist) + totalCost(Rstring, Rlist);
				
				if (cost < min) {
					min = cost;
					arr.add(breakList.get(i));
					
				}

			}
			
			mem.put(word,min);
			System.out.println("min: "+ min + " got calculated");
			System.out.println(arr);
			return min;
		}
	}
	
	
	
	
	// Precondition: word is a string and breakList is an array of integers in
	// strictly increasing order
	// the last element of breakList is no more than the number of characters in
	// word.
	// Postcondition: Return the minimum total cost of breaking the string word into
	// |breakList|+1 pieces, where
	// the position of each each break is specified by the integers in breakList.
	// Refer to the assignment specification for how a single break contributes to
	// the cost.

			

	// Precondition: word is a string and breakList is an array of integers in
	// strictly increasing order
	// the last element of breakList is no more than the number of characters in
	// word.
	// Postcondition: Return the schedule of breaks so that word is broken according
	// to the list of
	// breaks specified in breakList which yields the minimum total cost.

	ArrayList<Integer> breakSchedule(String word, ArrayList<Integer> breakList) { // TODO Complete for Task 3
		if (breakList == null  ) {
			return null;
		}
		breakList.removeIf(i -> (i >= word.length() - 1));
		
		if(breakList.size() == 1) {
			ArrayList<Integer> breakorder = new ArrayList<Integer>();
			breakList.add(breakList.get(0));
			return breakorder;
		}
		
		totalCost(word, breakList);
		
		
		if(arr.isEmpty()) {
			return null;
		}
		Collections.reverse(arr);
		ArrayList<Integer> breakorder = new ArrayList<Integer>();
		for(int i=0; i< breakList.size();i++) {
			breakorder.add(arr.get(i));
			
		}
		return breakorder;

	}
	
	
	

	
	

	
	
	
	
	
	
}
