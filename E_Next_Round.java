import java.util.Scanner;

//BD GIRLS' CODING CONTEST 2022 - MOCK

public class E_Next_Round {
	
	static Scanner in = new Scanner(System.in);
	
	static int testCases, n;
	
	static long a[];
	
	static long x;
	
	static void solve() {
		
		int num = 0;
		
		for(long i : a) {
			
			if(i >= x) {
				
				++num;
				
			}
			
		}
		
		System.out.println(num);
		
	}
	
	public static void main(String [] priya) {
		
		testCases = 1;
		
		for(int t = 0; t < testCases; ++t) {
			
			n = in.nextInt();
			
			x = in.nextLong();
			
			a = new long[n];
			
			for(int i = 0; i < n; ++i) {
				
				a[i] = in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
}