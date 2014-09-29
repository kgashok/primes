package primeFactors;

import java.util.*;


public class PrimeFactors {
  public static List<Integer> generate(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    
    // the famous three line code for generating prime factors
    for (int candidate = 2; n > 1; candidate++ )
      for (; n % candidate == 0; n /= candidate)
        primes.add(candidate);
	
    return primes;
  }
}

/*
public class PrimeFactors {
  public static List<Integer> generate(int n) {
    List<Integer> primes = new ArrayList<Integer>();
	// int candidate = 2;
	// while (n > 1) {
	for (int candidate = 2; n > 1; candidate++ )
    	// while (n % candidate == 0) {
    	for (; n % candidate == 0; n /= candidate)
    		primes.add(candidate);
	
    return primes;
  }
}
*/