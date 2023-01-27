
import java.util.Scanner;

public class C_Nice_Number {

    static Scanner in = new Scanner(System.in);

    static int n;
	
	static long m;

    static void solve() {
		
		//long prime[] = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L, 101L, 103L, 107L, 109L, 113L, 127L, 131L, 137L, 139L, 149L, 151L, 157L, 163L, 167L, 173L, 179L, 181L, 191L, 193L, 197L, 199L, 211L, 223L, 227L, 229L, 233L, 239L, 241L, 251L, 257L, 263L, 269L, 271L, 277L, 281L, 283L, 293L, 307L, 311L, 313L, 317L, 331L, 337L, 347L, 349L, 353L, 359L, 367L, 373L, 379L, 383L, 389L, 397L, 401L, 409L, 419L, 421L, 431L, 433L, 439L, 443L, 449L, 457L, 461L, 463L, 467L, 479L, 487L, 491L, 499L, 503L, 509L, 521L, 523L, 541L};
		
		//System.out.println(prime.length);
		
		long primes = 2L;
		
		for(int prime = 1; prime <= n; ) {
			
			boolean ok = true;
			
			for(long j = 2L; j * j <= primes; ++j) {
				
				if(primes % j == 0L) {
					
					ok = false;
					break;
					
				}
				
			}
			
			if(ok) {
				
				if(primes == m) {
					
					++primes;
					
					continue;
					
				}
				
				if((m * primes) <= 1000000000L) {
					
				    if(prime <= n - 1) {	
				
				      System.out.print((m * primes) + " ");
				
				      ++prime;
				  
				    } else {
					  
					  System.out.print((m * primes));
				
					  ++prime;
					  
				    } 
				
				}
				
			}
			
			++primes;
			
		}
		
		System.out.println();

    }

    public static void main(String[] args) {

        n = in.nextInt();
        m = in.nextLong();

        solve();
        //C_Nice_Number c_Nice_Number = new C_Nice_Number();

    }

}
