package Collections;

import java.util.Collections;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<String> str=new Stack<>();
		
		str.push("ABC");
		str.push("BCD");
		
		str.push("CFG");
		str.push("CAA");
		
		Collections.sort(str);
		
		System.out.println(str.peek());
		System.out.println(str.pop());
		System.out.println(str);
		System.out.println(str.firstElement());
		System.out.println(str.lastElement());
	}

}
