import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPath {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("/user/getById/.", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("/user/getById/11ea4192-1b74-51a0-aea3-00155d2f7103");
		System.out.println(matcher.matches());
		PathMatcher pathMatcher = new AntPathMatcher();
	}
}
