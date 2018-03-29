import java.util.*;
import java.io.*;

class Customer{
	public ArrayList<String> emails;
	public ArrayList<String> phones;
	public ArrayList<String> cards;

	public Customer(String email, String phone, String card) {
		emails = new ArrayList<String>();
		phones = new ArrayList<String>();
		cards = new ArrayList<String>();
		emails.add(email);
		phones.add(phone);
		cards.add(card);
	}

	public boolean equals(Customer b) {
		for(int i = 0;i<b.emails.size();i++) {
			if(emails.contains(emails.get(i))) {
				emails.add(emails.get(i));
				return true;
			}
		}

		for(int i = 0;i<b.phones.size();i++) {
			if(phones.contains(phones.get(i))) {
				phones.add(phones.get(i));
				return true;
			}
		}

		for(int i = 0;i<b.cards.size();i++) {
			if(cards.contains(cards.get(i))) {
				cards.add(cards.get(i));
				return true;
			}
		}
		return false;

	}
}
public class Problem2 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine()); // Number of transcations
		ArrayList<Customer> cs = new ArrayList<Customer>();
		int count = 0;
		for(int i = 0;i<n;i++) {
			String[] transcation = in.readLine().split(" "); // format id<space>email<space>phone<card>
			String id = transcation[0];
			String email = transcation[1];
			String phone = transcation[2];
			String card = transcation[3];
			Customer temp = new Customer(email, phone, card);
			if(!cs.contains(temp)) {
				cs.add(temp);
				count++;
			}
		}
		System.out.println(count);
	}
}