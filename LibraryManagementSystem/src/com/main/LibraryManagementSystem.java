package com.main;

import java.util.Scanner;

import com.controller.BookController;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		
		BookController b= new BookController();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to library management system\n Enter the below choice to perform operation");
		System.out.println("==============================================================");
		char ch;
		do {
			System.out.println("1. Add a book");
			System.out.println("2. Delete a book");
			System.out.println("3. Search by book title");
			System.out.println("4. Display all list of books");
			System.out.println("5. Display by book genre");
			
			System.out.println("enter a choice");
			int choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				b.operation(choice);
				break;
			case 2:
				b.operation(choice);
				break;
			case 3:
				b.operation(choice);
				break;
			case 4:
				b.operation(choice);
				break;
			case 5:
				b.operation(choice);
				break;
			default:
				System.out.println("invalid choice please try again later");
			}
			System.out.println("do you want to continue Y/N");
			ch= sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		System.out.println("Thank you!");
	}
}
