package pythonproj;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		char ch='a';
		int ascii=ch;
		int castascii=(int)ch;
		System.out.println(castascii);
		System.out.println("write the input here:");
		
		Scanner scan = new Scanner(System.in);
		int var=scan.nextInt();
		
		System.out.println(var);
		 int number = 3;
		 boolean isPrime1;
	        
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	    
	    }
	}
	private static boolean isPrime(int number) {
		
		return false;
	}


	}


