
public class Buffer1 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		
		s.append("java programmingythdtrdytr");
		System.out.println(s.capacity());
		s.insert(4, "_");
		System.out.println(s.toString());
		
		s.replace(4,17,"learning");
		System.out.println(s.toString());
		s.reverse();
		System.out.println(s.toString());
		s.delete(5, 14);
		System.out.println(s.toString());
		
	}	

}
