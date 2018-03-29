import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Problem3{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] phones = new String[n];
		String[] normalizedPhone = new String[n];
		// String pattern = "^((\\??\\+)|(\\*?0)|(\\(0+)\\))([0-9]+)";
		// Pattern regex = Pattern.compile(pattern);
		for(int i = 0;i<n;i++) {
			String phone = in.readLine();
			phones[i] = phone;
			if(phone.length() > 2) {
				phone = phone.replaceAll("\\-| |\\.|/|\\+|\\?|\\*", "");
				if(phone.indexOf("(null)") == -1 && phone.indexOf("()") == -1) {
					phone = phone.replaceAll("\\(|\\)", "");
				}
				phone = phone.replaceAll("^0", "62");
			}
			normalizedPhone[i] = phone;
		}

		for(int i = 0;i<normalizedPhone.length;i++) {
			System.out.println(normalizedPhone[i]);
		}
	}
}