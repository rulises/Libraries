import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;


public class Problem1 {

	/**
	 * Find the last element of a list.
	 * Example:
	 * ?- my_last(X,[a,b,c,d]).
	 * Output
	 * X = d
	 * @param args
	 */
	//ARRAYLIST BUILT-IN METHODS IMPLEMENTATION
	static ArrayList<Integer> alist = new ArrayList<Integer>();
	public static Integer findLastElement(){
		if(alist.isEmpty() )
			return null;
		return alist.get(alist.size()-1);
	}
	//ITERATION IMPLEMENTATION
	static LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	public static Integer findLastElement_iter(){
		if(linkedlist.isEmpty() )
			return null;
		Iterator<Integer> it = linkedlist.iterator();
		Integer i = 0;
		while(it.hasNext())
		{
		    i = it.next();
		}
		return i;
	}
	public static Integer findLastElement_iter2(){
		if(linkedlist.isEmpty() )
			return null;
		Integer i = 0;
		for(Integer each : linkedlist){
			i = each;
		}
		return i;
	}
	//RECURSIVE IMPLEMENTATION
	public static Integer findLastElement_rec(LinkedList<Integer> l){
		if(l.isEmpty())
			return null;
		if(l.size()==1)
			return (Integer) l.getFirst();
		else
			return findLastElement_rec((LinkedList<Integer>) l.subList(1, l.size()-1));
		
	}
	//BUILT-IN LIST METHODS
	public static Integer findLastElement_tail(){
		if(linkedlist.isEmpty() )
			return null;
		return linkedlist.getLast();
	}
	// Tests
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array List Tests");
		System.out.println("Test1:");
		System.out.println( alist.toString() );
		Integer lastelement =  findLastElement();
		String result;
		if (lastelement == null){
			result = "none";
		}
		else
			result = lastelement.toString();
		System.out.println("Last Element: " + result);
		
		alist.add(3);
		alist.add(1);
		alist.add(3);
		alist.add(4);
		
		System.out.println("Test2:");
		System.out.println( alist.toString() );
		lastelement =  findLastElement();
		if (lastelement == null){
			result = "none";
		}
		else
			result = lastelement.toString();
		System.out.println("Last Element: " + result);
		
		
		System.out.println("Linked List Tests");
		System.out.println("Test1:");
		System.out.println( linkedlist.toString() );
		lastelement =  findLastElement_iter();
		if (lastelement == null){
			result = "none";
		}
		else
			result = lastelement.toString();
		System.out.println("Last Element: " + result);
		
		linkedlist.add(3);
		linkedlist.add(1);
		linkedlist.add(3);
		linkedlist.add(4);
		
		System.out.println("Test2:");
		System.out.println( linkedlist.toString() );
		lastelement =  findLastElement_iter();
		if (lastelement == null){
			result = "none";
		}
		else
			result = lastelement.toString();
		System.out.println("Last Element: " + result);
		
	}
	
	

}
