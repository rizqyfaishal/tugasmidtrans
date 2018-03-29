import java.io.*;
import java.util.*;

public class Problem6 {
	public static void main(String[] args) throws IOException{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 char[] st1 = in.readLine().toCharArray();
		 char[] st2 = in.readLine().toCharArray();

		 int[] countChar1 = new int[26];
		 int[] countChar2 = new int[26];
		 for(int i = 0;i<st1.length;i++) {
		 	countChar1[st1[i] - 'a']++;
		 }
		 for(int i = 0;i<st2.length;i++) {
		 	countChar2[st2[i] - 'a']++;
		 }
		 int count = 0;
		 for(int i = 0;i<countChar1.length;i++) {
		 	if(Math.abs(countChar2[i] - countChar1[i]) > 0) {
		 		count++;
		 	}
		 }
		 System.out.println(count);
		
	}
}