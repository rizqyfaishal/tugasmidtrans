import java.io.*;
import java.util.*;

public class Problem5 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()); // Jumlah Bus
		String[] time = in.readLine().split(":"); // Waktu yang ditentukan
		// convert time to integer of minutes
		// dilakukan normalisasi waktu dalam satu hari, dalam hitungan menit, inspired by timestamp unix
		int timeInt = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
		String[] bus = new String[n];
		int[] A = new int[n];
		int[] D = new int[n];
		int count = 0;
		for(int i = 0;i<n;i++) {
			String schedule = in.readLine();
			String[] temp1 = schedule.split(" A ");
			String[] temp2 = temp1[1].split(" D ");
			bus[i] = temp1[0];
			String[] temp3 = temp2[0].split(":");
			int a = Integer.parseInt(temp3[0])*60 + Integer.parseInt(temp3[1]);
			String[] temp4 = temp2[1].split(":");
			int d = Integer.parseInt(temp4[0])*60 + Integer.parseInt(temp4[1]);
			if(a <= timeInt && timeInt <= d) {
				count++;
			}
		}
		System.out.println(count);
		// Solusi mempunyai kompleksitas O(n) karena untuk menentukan count akan di increment atau tidak
		// diperlukan pengecekan waktu singgah dan waktu pergi untuk semua jadwal
	}
}