/**
 * @author varungove
 * 
 *         This class contains all information for a Pyramid
 *
 */
public class Pyramid {
	
	private int size;
	private int mainNumber;
	private int factorSize;
	private int[] primeFactors;
	private int[] factors;
	
	public int[] level1;
	public int[] level2;
	public int[] level3;
	public int[] level4;
	public int[] level5;

	
	/**
	 * Constructor with prime factorization count to guage No. of levels
	 * @param n
	 */
	public Pyramid(int n, int num, int x) {
		size=n;
		factorSize=x;
		mainNumber = num;
		primeFactors = new int[n];
		factors = new int[x];
		
		level1 = new int[1];
		level1[0] = num;
		
		level2 = new int[2];
		level3 = new int[3];
		level4 = new int[4];
		level5 = new int[5];
	}
	
	
	/**
	 * Sets all the prime factors
	 * @param n
	 */
	public void setPrimeFactors(int n[]) {
		for(int i=0; i<size; i++) {
			primeFactors[i] = n[i];
		}
		
		
		
		
	}//end of set factors
	
	/**
	 * Sets all the prime factors
	 * @param n
	 */
	public void setFactors(int n[]) {
		for(int i=0; i<factorSize; i++) 
			factors[i] = n[i];
		}
	
	
	/**
	 * Print a list of factors
	 */
	public void printFactors() {
		System.out.println("Factors:");
		for(int i=0; i<factorSize; i++) 
			System.out.println(factors[i]);
		
	}
	
	/**
	 * Print a list of factors
	 */
	public void printPrimeFactors() {
		System.out.println("Prime Factors:");
		for(int i=0; i<size; i++) 
			System.out.println(primeFactors[i]);
		
	}
	
	public void threePrime() {
		
		for(int i=0;i<3;i++) {
			level3[i] = primeFactors[i];
		}
		
	//	level2[0]=0;
	//	level2[1]=0;
		
		
	}//end of threePrime
	
	public void fourPrime() {
		
		for(int i=0; i<4; i++) {
			level4[i] = primeFactors[i];
		}
	}
	
	public void fivePrime() {
		
		for(int i=0; i<5; i++) {
			level5[i] = primeFactors[i];
		}
	}
	
	
	
}//end of class
