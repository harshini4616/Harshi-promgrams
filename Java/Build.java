import java.util.StringTokenizer;

public class Build {

	public static void main(String[] args) {
		String str=("hi i'm learing java");
		StringTokenizer s = new StringTokenizer(str);
		System.out.println(s.countTokens());
		System.out.println(s.nextToken());
		System.out.println(s.countTokens());
		while(s.hasMoreElements())
		{
			System.out.println(s.nextToken());
		}

			}

}
