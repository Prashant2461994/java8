package com.jlcindia.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		Predicate<Integer> isEven = (i)->{return i%2==0?true:false;};
	    List<Integer> myList = new ArrayList<Integer>();	
	    myList.add(1);
	    myList.add(2);
	    myList.add(3);
	    myList.add(4);
	    myList.add(5);
	    myList.add(6);
	    myList.add(7);
	    myList.add(8);
	    myList.add(9);
	    myList.add(10);
	   
	    /****PASSING PREDICATE REFRENCE*/
	  //  myList.removeIf(isEven);
	    
	    /****PASSING LAMBDA EXPRESSION*/
	    myList.removeIf((i)->i%2==0);
	    
	    System.out.println("***********removed using predicate*********");
	    
	    System.out.println(myList);
	    
	    
	}
}
