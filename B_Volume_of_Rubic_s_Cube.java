import java.util.Scanner;

public class B_Volume_of_Rubic_s_Cube {
	
	static Scanner in = new Scanner(System.in);
	
	static int testCases;
	
	static long n;
	
	static void solve() {
		
		long ans = n * n * n;
		
		System.out.println(ans);
		
	}
	
	public static void main(String [] priya) {
		
		testCases = in.nextInt();
		
		for(int t = 0; t < testCases; ++t) {
			
			n = in.nextLong() * 3L;
			
			System.out.print("Case " + (t + 1) + ": ");
			
			solve();
			
		}
		
	}
	
}