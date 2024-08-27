import java.util.StringJoiner;

public class Join {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("-");
		StringJoiner sj2= new StringJoiner("/");
		sj.add("21");
		System.out.println(sj.toString());
		sj.add("46");
		System.out.println(sj.toString());
		sj.add("16");
		System.out.println(sj.toString());
		sj2.setEmptyValue("its empty");
		sj2.add("hello");
		System.out.println(sj2.toString());
		sj.merge(sj2);
		System.out.println(sj.toString());
		
		
		
		
	}

}
