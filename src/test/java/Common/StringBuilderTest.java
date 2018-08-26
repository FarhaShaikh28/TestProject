package Common;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder build=new StringBuilder("Hello");
		
		build.append(" World");
		System.out.println(build);
		
		build.delete(6, 11);
		System.out.println(build);
		
		build.insert(6, "World");
		
		System.out.println(build);
		

	}

}
