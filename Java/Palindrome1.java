import java.util.*;
public class Palindrome1 {

	public static void main(String[] args) {
		String temp,str="hi iam going to watch racecar with car number as 545";
		StringTokenizer st= new StringTokenizer(str);
		StringJoiner sj=new StringJoiner(",");
		while(st.hasMoreElements())
		{
			temp=st.nextToken().toLowerCase();
			if(temp.contentEquals(new StringBuffer(temp).reverse()))
			sj.add(temp);
		}
		System.out.println(sj.toString());

	}

}
