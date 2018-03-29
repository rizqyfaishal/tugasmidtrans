import java.util.*;
import java.io.*;

public class Problem2 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()); // Number of transcations
		HashMap<String, Boolean> emails = new HashMap<String, Boolean>();
		HashMap<String, Boolean> phones = new HashMap<String, Boolean>();
		HashMap<String, Boolean> cards = new HashMap<String, Boolean>();
		int count = 0;
		for(int i = 0;i<n;i++) {
			String[] transcation = in.readLine().split(" "); // format id<space>email<space>phone<card>
			String id = transcation[0];
			String email = transcation[1];
			String phone = transcation[2];
			String card = transcation[3];
			if(!emails.containsKey(email) ) {
				emails.put(email, true);
				phones.put(phone, true);
				cards.put(card, true);
				count++;
			} else if(!phones.containsKey(phone)) {
				emails.put(email, true);
				phones.put(phone, true);
				cards.put(card, true);
			} else if(!cards.containsKey(card)) {
				emails.put(email, true);
				phones.put(phone, true);
				cards.put(card, true);
			}
		}
		System.out.println(count);
	}
}