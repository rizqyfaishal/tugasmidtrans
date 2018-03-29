import java.io.*;
import java.util.*;

public class Problem1{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()); // Masukkan input jumlah kalimat, asumsinya selalu 2,
		// karena hanya dua address yang akan dibandingkan
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		int countAll = 0;
		String[][] wordsOfWords = new String[n][];
		for(int i = 0;i<n;i++) {
			// Masukkan setiap kalimat
			// Dan di split berdasarkan kata, separator bisa spasi, -, koma, titik
			String[] kalimat = in.readLine().toLowerCase().split(" ");
			wordsOfWords[i] = new String[kalimat.length];
			for(int j = 0; j< kalimat.length;j++) {
				countAll++;
				wordsOfWords[i][j] = kalimat[j];
				if(words.containsKey(kalimat[j])) {
					words.put(kalimat[j], words.get(kalimat[j]) + 1);
				} else {
					words.put(kalimat[j], 1);
				}
			} 
		}
		// Menghiting probabilitas kemiripan setiap kata
		double[] count = new double[n];
		for(int i = 0;i < wordsOfWords.length;i++) {
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			// Untuk menyimpan kemunuculan setiap kata dalam kalimat
			for(int j = 0;j<wordsOfWords[i].length;j++) {
				if(hs.containsKey(wordsOfWords[i][j])) {
					hs.put(wordsOfWords[i][j], hs.get(wordsOfWords[i][j]) + 1);
				} else {
					hs.put(wordsOfWords[i][j], 1);
				}
			}
			Set<String> keys = hs.keySet();
			Iterator<String> it = keys.iterator();

			while(it.hasNext()) {
				String key = it.next();
				count[i] += (((double)hs.get(key)/(double)words.get(key)) / (double)countAll);
			}


		}
		if(count[1] > count[0]) {
			System.out.println(count[0] / count[1]);
		} else {
			System.out.println(count[1] / count[0]);
		}
	}
}

// Akan lebih bagus jika menggunakan N-Gram atau algoritma viterbi
// Karena pada solusi di atas setiap kata masih indepnenden
// Jadi setiap kata yang berbeda dalam kalimat akan dianggap sama probabilitasnya