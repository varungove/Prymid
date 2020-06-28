import java.io.*;


/**
 * @author varungove
 *
 *         Algorithm to generate triangular prime factorization for Josh Marden's T550 Project.
 */
public class Prymid {

	public static void main(String[] args) throws IOException {
		while (true) {
			

			mainMenu();
		} //end of while
		
		

	}//end of main
	
	/**
	 * Prints main menu and checks input
	 * @throws IOException
	 */
	public static void mainMenu() throws IOException{
		
		System.out.println("Welcome to Prymid!");
		System.out.println("Enter the number you want to generate a Prymid for:");
		
		
		
		int choice = 0;
		int number=0;
		int primeFactorCount=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(choice<1 || choice>2310) {
			
			try {
			choice = Integer.parseInt(br.readLine());
			number = choice;
			choice = checkChoise(choice);
			}
			catch(NumberFormatException e){
				System.out.println("Invalid Input. Try again");
				choice=0;
				
			}
			
			
		}//end of while
		
		primeFactorCount = choice;
		int primeFactors[] = new int[primeFactorCount];
		int factorCount =0;
		factorCount = countFactor(number);
		
		primeFactors = primeFactorArray(number, primeFactorCount);
		int factors[] = new int[factorCount];
		
		factors = getFactors(number, factorCount);
		
		Pyramid pOne = new Pyramid(primeFactorCount, number, factorCount);
		pOne.setPrimeFactors(primeFactors);
		pOne.setFactors(factors);
		
		pOne.printFactors();
		pOne.printPrimeFactors();
		
		if(primeFactorCount == 3)
		{
			
			
			pOne.threePrime();
			//Pyramid p3Array[] = handleThree(pOne);
			
			Pyramid p3Array[] = new Pyramid[12];
			for(int i=0;i<12;i++) {
				p3Array[i] = new Pyramid(primeFactorCount, number, factorCount);
				p3Array[i].setPrimeFactors(primeFactors);
				p3Array[i].setFactors(factors);
				p3Array[i].threePrime();
				
			}
			
			
			
			
			p3Array = PermutateArrayWithDuplicates.perm(p3Array, 3);
			//right now we have array of pyramids with all perms of level 3
			
			
			//for(int i=0;i<12; i++) {
				//for(int j=0;j<3;j++) {
					//System.out.print((p3Array[i]).level3[j]);
			//	}
				//System.out.println("");
		//	}
			
			p3Array = buildLevel2(p3Array, 12);
			p3Array = buildLevel1(p3Array, 12);
			
			printThree(p3Array);
		}
		
		if(primeFactorCount == 4) {
			//System.out.println("IN HERE");
			pOne.fourPrime();
			
			Pyramid p4Array[] = new Pyramid[144];
			for(int i=0;i<144;i++) {
				p4Array[i] = new Pyramid(primeFactorCount, number, factorCount);
				p4Array[i].setPrimeFactors(primeFactors);
				p4Array[i].setFactors(factors);
				p4Array[i].fourPrime();
				
			}
			
			p4Array = PermutateArrayWithDuplicates.perm(p4Array, 4);
			p4Array = buildLevel3(p4Array, 144);
			p4Array = buildLevel2(p4Array, 144);
			p4Array = buildLevel1(p4Array, 144);
			
			printFour(p4Array);
			
			
		}//end of case 4
		
		if(primeFactorCount == 5) {
			//System.out.println("IN HERE");
			pOne.fivePrime();
			
			Pyramid p5Array[] = new Pyramid[2880];
			for(int i=0;i<2880;i++) {
				p5Array[i] = new Pyramid(primeFactorCount, number, factorCount);
				p5Array[i].setPrimeFactors(primeFactors);
				p5Array[i].setFactors(factors);
				p5Array[i].fivePrime();
				
			}
			
			p5Array = PermutateArrayWithDuplicates.perm(p5Array, 5);
			p5Array = buildLevel4(p5Array);
			p5Array = buildLevel3(p5Array, 2880);
			p5Array = buildLevel2(p5Array, 2880);
			p5Array = buildLevel1(p5Array, 2880);
			
			printFive(p5Array);
			
			
		}//end of case 5

		
		
	}//end of mainMenu
	
	public static void printThree(Pyramid[] arr) {
		
		for(int i=0; i<12; i++) {
			
			if(arr[i].level1[0]!=0) {
				System.out.println("Pyramid No. " + (i+1));
				System.out.println("    " + arr[i].level1[0] + "    ");
				System.out.println("  " + arr[i].level2[0] + "   " + arr[i].level2[1] + "  ");
				System.out.println(arr[i].level3[0] + "   " + arr[i].level3[1] + "   " + arr[i].level3[2]);;
				System.out.println("");
			}
			else
				continue;
			
			
		}
		
	}
	
public static void printFour(Pyramid[] arr) {
		
		for(int i=0; i<144; i++) {
			
			if(arr[i].level1[0]!=0) {
				System.out.println("Pyramid No. " + (i+1));
				System.out.println("      " + arr[i].level1[0] + "     ");
				System.out.println("    " + arr[i].level2[0] + "   " + arr[i].level2[1] + "  ");
				System.out.println("  " + arr[i].level3[0] + "   " + arr[i].level3[1] + "   " + arr[i].level3[2]);
				System.out.println(arr[i].level4[0] + "   " + arr[i].level4[1] + "   " + arr[i].level4[2] +"   " + arr[i].level4[3]);
				System.out.println("");
			}
			else
				continue;
			
			
		}
		
	}

public static void printFive(Pyramid[] arr) {
	
	for(int i=0; i<2880; i++) {
		
		if(arr[i].level1[0]!=0) {
			System.out.println("Pyramid No. " + (i+1));
			System.out.println("       " + arr[i].level1[0] + "     ");
			System.out.println("     " + arr[i].level2[0] + "   " + arr[i].level2[1] + "  ");
			System.out.println("   " + arr[i].level3[0] + "   " + arr[i].level3[1] + "   " + arr[i].level3[2]);
			System.out.println(" " + arr[i].level4[0] + "   " + arr[i].level4[1] + "   " + arr[i].level4[2] +"   " + arr[i].level4[3]);
			System.out.println(arr[i].level5[0] + "   " + arr[i].level5[1] + "   " + arr[i].level5[2] + "   " + arr[i].level5[3] + "   " + arr[i].level5[4]);
			System.out.println("");
		}
		else
			continue;
		
		
	}
	
}

	public static Pyramid[] buildLevel4(Pyramid[] arr) {
	
	int i=0;
	while(i<2880) {
		if((arr[i].level5[0])!=0) {
			
			
			arr[i].level4[0]=(arr[i].level5[0] * arr[i].level5[1]);
			arr[i].level4[1] = arr[i].level5[2];
			arr[i].level4[2] = arr[i].level5[3];
			arr[i].level4[3] = arr[i].level5[4];
			
			arr[i+1].level4[0]=(arr[i+1].level5[0] * arr[i+1].level5[1]);
			arr[i+1].level4[1] = arr[i+1].level5[2];
			arr[i+1].level4[2] = arr[i+1].level5[3];
			arr[i+1].level4[3] = arr[i+1].level5[4];
			
			arr[i+2].level4[0]=(arr[i+2].level5[0] * arr[i+2].level5[1]);
			arr[i+2].level4[1] = arr[i+2].level5[2];
			arr[i+2].level4[2] = arr[i+2].level5[3];
			arr[i+2].level4[3] = arr[i+2].level5[4];
			
			arr[i+3].level4[0]=(arr[i+3].level5[0] * arr[i+3].level5[1]);
			arr[i+3].level4[1] = arr[i+3].level5[2];
			arr[i+3].level4[2] = arr[i+3].level5[3];
			arr[i+3].level4[3] = arr[i+3].level5[4];
			
			arr[i+4].level4[0]=(arr[i+4].level5[0] * arr[i+4].level5[1]);
			arr[i+4].level4[1] = arr[i+4].level5[2];
			arr[i+4].level4[2] = arr[i+4].level5[3];
			arr[i+4].level4[3] = arr[i+4].level5[4];
			
			arr[i+5].level4[0]=(arr[i+5].level5[0] * arr[i+5].level5[1]);
			arr[i+5].level4[1] = arr[i+5].level5[2];
			arr[i+5].level4[2] = arr[i+5].level5[3];
			arr[i+5].level4[3] = arr[i+5].level5[4];
			
			arr[i+6].level4[1]=(arr[i+6].level5[1] * arr[i+6].level5[2]);
			arr[i+6].level4[0] = arr[i+6].level5[0];
			arr[i+6].level4[2] = arr[i+6].level5[3];
			arr[i+6].level4[3] = arr[i+6].level5[4];
			
			arr[i+7].level4[1]=(arr[i+7].level5[1] * arr[i+7].level5[2]);
			arr[i+7].level4[0] = arr[i+7].level5[0];
			arr[i+7].level4[2] = arr[i+7].level5[3];
			arr[i+7].level4[3] = arr[i+7].level5[4];
			
			arr[i+8].level4[1]=(arr[i+8].level5[1] * arr[i+8].level5[2]);
			arr[i+8].level4[0] = arr[i+8].level5[0];
			arr[i+8].level4[2] = arr[i+8].level5[3];
			arr[i+8].level4[3] = arr[i+8].level5[4];
			
			arr[i+9].level4[1]=(arr[i+9].level5[1] * arr[i+9].level5[2]);
			arr[i+9].level4[0] = arr[i+9].level5[0];
			arr[i+9].level4[2] = arr[i+9].level5[3];
			arr[i+9].level4[3] = arr[i+9].level5[4];
			
			arr[i+10].level4[1]=(arr[i+10].level5[1] * arr[i+10].level5[2]);
			arr[i+10].level4[0] = arr[i+10].level5[0];
			arr[i+10].level4[2] = arr[i+10].level5[3];
			arr[i+10].level4[3] = arr[i+10].level5[4];
			
			arr[i+11].level4[1]=(arr[i+11].level5[1] * arr[i+11].level5[2]);
			arr[i+11].level4[0] = arr[i+11].level5[0];
			arr[i+11].level4[2] = arr[i+11].level5[3];
			arr[i+11].level4[3] = arr[i+11].level5[4];
			
			arr[i+12].level4[2]=(arr[i+12].level5[2] * arr[i+12].level5[3]);
			arr[i+12].level4[1] = arr[i+12].level5[1];
			arr[i+12].level4[0] = arr[i+12].level5[0];
			arr[i+12].level4[3] = arr[i+12].level5[4];
			
			arr[i+13].level4[2]=(arr[i+13].level5[2] * arr[i+13].level5[3]);
			arr[i+13].level4[1] = arr[i+13].level5[1];
			arr[i+13].level4[0] = arr[i+13].level5[0];
			arr[i+13].level4[3] = arr[i+13].level5[4];
			
			arr[i+14].level4[2]=(arr[i+14].level5[2] * arr[i+14].level5[3]);
			arr[i+14].level4[1] = arr[i+14].level5[1];
			arr[i+14].level4[0] = arr[i+14].level5[0];
			arr[i+14].level4[3] = arr[i+14].level5[4];
			
			arr[i+15].level4[2]=(arr[i+15].level5[2] * arr[i+15].level5[3]);
			arr[i+15].level4[1] = arr[i+15].level5[1];
			arr[i+15].level4[0] = arr[i+15].level5[0];
			arr[i+15].level4[3] = arr[i+15].level5[4];
			
			arr[i+16].level4[2]=(arr[i+16].level5[2] * arr[i+16].level5[3]);
			arr[i+16].level4[1] = arr[i+16].level5[1];
			arr[i+16].level4[0] = arr[i+16].level5[0];
			arr[i+16].level4[3] = arr[i+16].level5[4];
			
			arr[i+17].level4[2]=(arr[i+17].level5[2] * arr[i+17].level5[3]);
			arr[i+17].level4[1] = arr[i+17].level5[1];
			arr[i+17].level4[0] = arr[i+17].level5[0];
			arr[i+17].level4[3] = arr[i+17].level5[4];
			
			arr[i+18].level4[3]=(arr[i+18].level5[3] * arr[i+18].level5[4]);
			arr[i+18].level4[0] = arr[i+18].level5[0];
			arr[i+18].level4[2] = arr[i+18].level5[2];
			arr[i+18].level4[1] = arr[i+18].level5[1];
			
			arr[i+19].level4[3]=(arr[i+19].level5[3] * arr[i+19].level5[4]);
			arr[i+19].level4[0] = arr[i+19].level5[0];
			arr[i+19].level4[2] = arr[i+19].level5[2];
			arr[i+19].level4[1] = arr[i+19].level5[1];
			
			arr[i+20].level4[3]=(arr[i+20].level5[3] * arr[i+20].level5[4]);
			arr[i+20].level4[0] = arr[i+20].level5[0];
			arr[i+20].level4[2] = arr[i+20].level5[2];
			arr[i+20].level4[1] = arr[i+20].level5[1];
			
			arr[i+21].level4[3]=(arr[i+21].level5[3] * arr[i+21].level5[4]);
			arr[i+21].level4[0] = arr[i+21].level5[0];
			arr[i+21].level4[2] = arr[i+21].level5[2];
			arr[i+21].level4[1] = arr[i+21].level5[1];
			
			arr[i+22].level4[3]=(arr[i+22].level5[3] * arr[i+22].level5[4]);
			arr[i+22].level4[0] = arr[i+22].level5[0];
			arr[i+22].level4[2] = arr[i+22].level5[2];
			arr[i+22].level4[1] = arr[i+22].level5[1];
			
			arr[i+23].level4[3]=(arr[i+23].level5[3] * arr[i+23].level5[4]);
			arr[i+23].level4[0] = arr[i+23].level5[0];
			arr[i+23].level4[2] = arr[i+23].level5[2];
			arr[i+23].level4[1] = arr[i+23].level5[1];
			
			i = i+24;
		}
		else
			break;
	}
	return arr;
}//end of Build level 4
	
	public static Pyramid[] buildLevel3(Pyramid[] arr, int x) {
		
		if(x==144) {
		int i=0;
		while(i<144) {
			if((arr[i].level4[0])!=0) {
				
				
				arr[i].level3[0]=(arr[i].level4[0] * arr[i].level4[1]);
				arr[i].level3[1] = arr[i].level4[2];
				arr[i].level3[2] = arr[i].level4[3];
				
				arr[i+1].level3[0]=(arr[i+1].level4[0] * arr[i+1].level4[1]);
				arr[i+1].level3[1] = arr[i+1].level4[2];
				arr[i+1].level3[2] = arr[i+1].level4[3];
				
				arr[i+2].level3[2]=(arr[i+2].level4[2] * arr[i+2].level4[3]);
				arr[i+2].level3[1] = arr[i+2].level4[1];
				arr[i+2].level3[0] = arr[i+2].level4[0];
				
				arr[i+3].level3[2]=(arr[i+3].level4[2] * arr[i+3].level4[3]);
				arr[i+3].level3[1] = arr[i+3].level4[1];
				arr[i+3].level3[0] = arr[i+3].level4[0];
				
				arr[i+4].level3[1]=(arr[i+4].level4[1] * arr[i+4].level4[2]);
				arr[i+4].level3[0] = arr[i+4].level4[0];
				arr[i+4].level3[2] = arr[i+4].level4[3];
				
				arr[i+5].level3[1]=(arr[i+5].level4[1] * arr[i+5].level4[2]);
				arr[i+5].level3[0] = arr[i+5].level4[0];
				arr[i+5].level3[2] = arr[i+5].level4[3];
				
				i = i+6;
			}
			else
				break;
		}
		return arr;
		
		}//4 prime case
		
		if(x==2880) {
			int i=0;
			while(i<2880) {
				if((arr[i].level5[0])!=0) {
					
					
					arr[i].level3[0]=(arr[i].level4[0] * arr[i].level4[1]);
					arr[i].level3[1] = arr[i].level4[2];
					arr[i].level3[2] = arr[i].level4[3];
					
					arr[i+1].level3[0]=(arr[i+1].level4[0] * arr[i+1].level4[1]);
					arr[i+1].level3[1] = arr[i+1].level4[2];
					arr[i+1].level3[2] = arr[i+1].level4[3];
					
					arr[i+2].level3[2]=(arr[i+2].level4[2] * arr[i+2].level4[3]);
					arr[i+2].level3[1] = arr[i+2].level4[1];
					arr[i+2].level3[0] = arr[i+2].level4[0];
					
					arr[i+3].level3[2]=(arr[i+3].level4[2] * arr[i+3].level4[3]);
					arr[i+3].level3[1] = arr[i+3].level4[1];
					arr[i+3].level3[0] = arr[i+3].level4[0];
					
					arr[i+4].level3[1]=(arr[i+4].level4[1] * arr[i+4].level4[2]);
					arr[i+4].level3[0] = arr[i+4].level4[0];
					arr[i+4].level3[2] = arr[i+4].level4[3];
					
					arr[i+5].level3[1]=(arr[i+5].level4[1] * arr[i+5].level4[2]);
					arr[i+5].level3[0] = arr[i+5].level4[0];
					arr[i+5].level3[2] = arr[i+5].level4[3];
					//possible
					i = i+6;
				}
				else
					break;
			}
			return arr;
			
			}//4 prime case
		
		return arr;
	}
	
	public static Pyramid[] buildLevel1(Pyramid[] arr, int x) {
		
		for(int i=0;i<x;i++) {
			arr[i].level1[0] = arr[i].level2[0] * arr[i].level2[1];
		}
		
		return arr;
	}
	
	public static Pyramid[] buildLevel2(Pyramid[] arr, int x) {
		
		if(x==12) {
		for(int i=0;i<x;i++) {
			if((arr[i].level3[0])!=0) {
				
				if((i%2)==0) {
					arr[i].level2[0] = (arr[i].level3[0] * arr[i].level3[1]);
					arr[i].level2[1] = arr[i].level3[2];
				}
				else
				{
					arr[i].level2[1] = (arr[i].level3[1] * arr[i].level3[2]);
					arr[i].level2[0] = arr[i].level3[0];
					
				}
				
			}
			else
				break;
			
		}
		}//3primecase
		
		if(x==144) {
			for(int i=0;i<x;i++) {
				if((arr[i].level4[0])!=0) {
					
					if((i%2)==0) {
						arr[i].level2[0] = (arr[i].level3[0] * arr[i].level3[1]);
						arr[i].level2[1] = arr[i].level3[2];
					}
					else
					{
						arr[i].level2[1] = (arr[i].level3[1] * arr[i].level3[2]);
						arr[i].level2[0] = arr[i].level3[0];
						
					}
					
				}
				else
					break;
				
			}
			}//4primecase
		
		if(x==2880) {
			for(int i=0;i<x;i++) {
				if((arr[i].level5[0])!=0) {
					
					if((i%2)==0) {
						arr[i].level2[0] = (arr[i].level3[0] * arr[i].level3[1]);
						arr[i].level2[1] = arr[i].level3[2];
					}
					else
					{
						arr[i].level2[1] = (arr[i].level3[1] * arr[i].level3[2]);
						arr[i].level2[0] = arr[i].level3[0];
						
					}
					
				}
				else
					break;
				
			}
			}//5primecase
		
		
		
		return arr;
	}//end of level 2
	
	
	public static Pyramid[] handleThree(Pyramid one) {
		
		Pyramid p3Array[] = new Pyramid[12];
		
		for(int i=0; i<12; i++) {
			p3Array[i] = one;
		}
		
		return p3Array;
		
	}//end of handleThree
	
	/**
	 * Checks if number is valid or not
	 * Checks bounds, prime vs composite, number of prime factors
	 * @param n
	 * @return
	 */
	public static int checkChoise(int n) {
		
		//checking bounds
		if(n<=0 || n>2310) {
			System.out.println("Number is out of bounds. Please enter number within 0 to 200");
			return -1;
		}
		
		
		//checking if the number is prime or not
		int factors = 0;
        int j = 1;

        while(j <= n)
        {
            if(n % j == 0)
            {
                factors++;
            }
            j++;
        }//end of while
        
        if(factors == 2) {
        	System.out.println("The number you entered is prime. Please enter another one");
			return -1;
        	
        }
        
       
        
        
        int primeCount = primeFactorCount(n);
        
       
        
        if(primeCount<3) {
        	System.out.println("The prime factorization is less than 3. Please enter another number");
			return -1;
        	
        }
        
        if(primeCount>5) {
        	System.out.println("The prime factorization is greater than 5. Please enter another number");
			return -1;
        	
        }
        
        
      	
		
		return primeCount;
	}//end of checkChoise
	
	
	public static boolean checkPrime(int n) {
		
		int factors = 0;
        int j = 1;

        while(j <= n)
        {
            if(n % j == 0)
            {
                factors++;
            }
            j++;
        }//end of while
		
		if(factors == 2)
			return true;
		else
			return false;
	} //end of checkPrime
	
	/**
	 * Returns an array of factors for a given number
	 * 
	 * @param n Original number
	 * @param f Number of factors
	 * @return
	 */
	
	public static int[] getFactors(int n, int f) {
		int factors[] = new int[f];
		
		int j=2;
		int count=0;
		while(j<n)
		{
			if(n % j ==0) 
			{
				factors[count] = j;
				count++;
			}
			j++;
		}
		
		
		return factors;
	}//end of get factors
	
	
	/**
	 * Counts the number of prime factors for a given number
	 * 
	 * @param n Original number
	 * @param f Number of factors
	 * @return
	 */
    public static int primeFactorCount(int n) 
    { 
    	int count=0;
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            count++;
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                count++;
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case when
        // n is a prime number greater than 2 
        if (n > 2) 
            count++;
        
        return count;
    } 
    
 
    /**
	 * Returns array of prime factors for a given number
	 * 
	 * @param n Original number
	 * @param f Number of factors
	 * @return
	 */
    public static int[] primeFactorArray(int n, int size) 
    { 
    	int count[] = new int[size];
    	int counter = 0;
    	
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
        	count[counter] = 2;
            counter++;
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
            	count[counter] = i;
                counter++;
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case when
        // n is a prime number greater than 2 
        if (n > 2) 
        {
        	count[counter] = n;
            counter++;
        }
        
        return count;
    } // end of prime Factor Array
    
    
    
    /**
	 * Returns number of factors
	 * 
	 * @param n Original number
	 * 
	 * @return
	 */
    public static int countFactor(int n) {
    	int factors = 0;
        int j = 2;

        while(j < n)
        {
            if(n % j == 0)
            {
                factors++;
            }
            j++;
        }//end of while
        
        return factors;
    	
    } //end of countFactor

}//end of class
