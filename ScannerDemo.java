package amazon;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		long  phone;
		String name;
		String Address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		name= sc.next();
		System.out.println("Enter age :");
		age=sc.nextInt();
		System.out.println("Phone number :");
		phone=sc.nextLong();
		System.out.println("Enter Address :");
		Address=sc.next();
		System.out.println("Hello "+name +" !!!! "
				+ "Dont you think being "+age +" is great");
		//	System.out.println(sc.nextInt());
	}

}
