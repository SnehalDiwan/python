package pythonproj;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0;
		int n1=0;
		int n2=1;
		for(int i=0; i<10;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	
	System.out.println(sum);
		
		

	}

}
