package Arrays_and_Strings;

import java.util.Scanner;

public class allSubstrings {
    
    public static void printSubstring(String str) {
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubstring(str);
	}
}
