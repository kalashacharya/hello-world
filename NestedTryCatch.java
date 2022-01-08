import java.io.*;
import java.util.*;

public class NestedTryCatch
{
	public static void main(String[] args) {
		int num[] = {0,1,2,3}; 
		int result=0;
		try{
			for(int i = 0; i<num.length; i++) {
				result = num[2]/num[0];
			}

			try{
				for(int i = 0; i<=num.length; i++) {
				result = num[i]/num[i-1];
			}
			System.out.println("Result = "+result);

			}catch(Exception e) {
				System.out.println("inner catch-Some Exception occured: "+e);
				e.printStackTrace();
			}
			System.out.println("Result = "+result);
		} catch(Exception e) {
				System.out.println("outer catch-Some Exception occured: "+e);
				e.printStackTrace();
		}

		System.out.println("Normal flow....");
		System.out.println("Enter your name: ");
		Scanner  sc = new Scanner(System.in);
		String line = sc.nextLine();
		
	}
	
}