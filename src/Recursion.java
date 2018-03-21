

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if(list.size() == 1) return list;
		List<?> sub = list.subList(1, list.size());
		if(list.get(0) == list.get(1) ) {
			list.remove(0);
			unique(list);
		} else{
			unique(sub); 
		}
		return list;

	}
	
	/**
	 *Find Fibonacci number by use tail-recursion.
	 * @param n index of fibonacci  
	 * @return long number as fibonacci number.
	 */
	public static long fibonacci(int n) {
		 return fibHelper(n,1,0);
		}
	
	/**
	 * Helper method of Fibonacci method.
	 * @param n index of fibonacci  
	 * @param start first index. 
	 * @param b second index.
	 * @return value of fibonacci number.
	 */
	public static long fibHelper(int n, long start, long next){
		if (n == 1) return next;
		if(n == 0) return start;
		return fibHelper(n-1,next,start+next);
	}

}
