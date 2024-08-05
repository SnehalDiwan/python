package pythonproj;

public class ReverseString {
	
	public static String getRev(String name) {
		String rev="";
		int len=name.length();
		for(int i=len-1; i>=0; i--) {
			 rev=rev+name.charAt(i);
			
		}return rev;
	}

	public static void main(String[] args) {
		System.out.println(getRev("snehal"));

	}

}
