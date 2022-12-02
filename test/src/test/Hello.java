package test;

import java.util.Scanner;

import Password.CreateRandomPassKey;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Enter Frist name, last name,choice");
		Scanner sc = new Scanner(System.in);
		String F_name= sc.next();
		String L_name= sc.next();
		int Choise= sc.nextInt();
		String dep = null;
		if(Choise == 1) {
			dep= "Techanical";
		}
		else if(Choise == 2) {
			dep="Admin";
		}
		else if(Choise == 3) {
			dep="Human Resources";
		}
		else{
			dep="Legal";
		}
		
		Emp Obj = new Emp(F_name,L_name,dep);
		
		DisplayEmail show = new DisplayEmail();
		String Email= show.CreateMail(F_name,L_name,dep);
		System.out.println("Email is:- "+Email);
		
		CreateRandomPassKey Passkey = new CreateRandomPassKey();
		System.out.println("PassWord is :- "+Passkey.NewPass());
		sc.close();
	}
}
