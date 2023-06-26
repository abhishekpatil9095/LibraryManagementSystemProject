package com.controller;

import com.service.NotFoundException;
import com.serviceImplemenation.LibraryServiceImplementation;

public class BookController {

	private LibraryServiceImplementation library;
	
	public BookController()
	{
		this.library= new LibraryServiceImplementation();
	}
	
	public void operation(int option)
	{
		switch(option)
		{
		case 1:
			library.add();
			break;
		case 2:
			try
			{
				library.remove();
			}
			catch(NotFoundException e)
			{
				e.getMessage();
			}
			
			break;
		case 3:
			try
			{
				library.searchByTitle();
			}
			catch(NotFoundException e)
			{
				e.getMessage();
			}
			break;
		case 4:
			try
			{
				library.displayList();
			}
			catch(NotFoundException e)
			{
				e.getMessage();
			}
			break;
		case 5:
			try
			{
			library.displayByGenre();
			}
			catch(NotFoundException e)
			{
				e.getMessage();
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
