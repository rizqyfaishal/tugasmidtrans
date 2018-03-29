import java.io.*;
import java.util.*;

public class Problem7 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()); // Jumlah operasi
		ArrayList<String> daftar = new ArrayList<String>();
		for(int i = 0;i<n;i++) {
			String[] op = in.readLine().split(" ");
			if(op[0].equals("add")) {
				daftar.add(op[1]);
			} else {
				Iterator<String> it = daftar.iterator();
				String prefix = op[1];
				int count = 0;
				while(it.hasNext()) {
					String name = it.next();
					if(name.length() > prefix.length() && name.substring(0, prefix.length()).equals(prefix)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}