package InterviewDemo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.next();
		System.out.println("Enter your Age: ");
		int age = s.nextInt();
		System.out.println("Enter your Gender: ");
		char gender = s.next().charAt(0);
		System.out.println("Enter your phone no : ");
		long phno = s.nextLong();
		System.out.println("-------------------------------------");
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender : " + gender);
		System.out.println("PhoneNo : " + phno);
		s.close();
	}
}
