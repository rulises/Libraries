import java.util.ArrayList;
import java.util.LinkedList;


public class Problem2 {

	/**
	 * 1.02 (*) Find the last but one element of a list.
	 * NOTE: This methods were build to show different mechanisms, so some of them
	 * appear to be inefficient or redundant, but is for the sake of practice
	 * @param args
	 */
	static ArrayList<Integer> alist = new ArrayList<Integer>();
	//ARRAYLIST BUILT-IN METHODS IMPLEMENTATION
	static Integer find1(){
		if(alist.size() <= 1)
			return null;
		return alist.get(alist.size()-2);
	}
	
	static LinkedList<Integer> llist = new LinkedList<Integer>();
	//ITERATION IMPLEMENTATION
	static Integer find2(){
		if(llist.size()<=1)
			return null;
		Integer butLast= 0;
		int count = 0;
		for(Integer i:llist){
			count++;
			butLast = i;
			if(count == llist.size()-2)
				break;
		}
		return butLast;
		
	}
	//RECURSIVE IMPLEMENTATION
	static Integer find4(LinkedList<Integer> l){
		if(l.size()<=1)
			return null;
		else if (l.size()<= 2)
			return (Integer) l.getFirst();
		return (Integer) find4((LinkedList<Integer>) l.subList(1, l.size()-1));
		
	}
	//BUILT-IN LIST METHODS
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
