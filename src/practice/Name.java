package practice;

import java.io.IOException;

class Derived {
	 public void getDetails() throws IOException, Exception {
		System.out.println("Derived");
	}
 }
public class Name extends Derived {
 
	 public void getDetails() throws Exception {
			System.out.println("Name");
}
	public static void main(String[] args) throws IOException, Exception {
		Derived b= new Name();
		b.getDetails();
	}
}
