package com.serviceImplemenation;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

import com.service.Book;
import com.service.LibraryService;
import com.service.NotFoundException;

public class LibraryServiceImplementation implements LibraryService{

	HashMap<Integer,Book> hm= new HashMap<>();
	Scanner sc= new Scanner(System.in);
	
	@Override
	public void add() 
	{
		System.out.println("enter a size of book");
		int size= sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter a book id");
			int id= sc.nextInt();
			
			System.out.println("enter a book title");
			String title= sc.next();
			
			System.out.println("enter a book author");
			String author=sc.next();
			
			System.out.println("enter a book genre");
			String genre= sc.next();
			
			System.out.println("enter a year");
			int year= sc.nextInt();
			
			System.out.println("enter a book quantity");
			int quantity= sc.nextInt();
			
		Book b= new Book(title,author,genre,year,quantity);
		hm.put(id, b);
		}
	}

	@Override
	public void remove() {
		System.out.println("enter a book id you want to delete");
		Integer ids=sc.nextInt();
		if(hm.isEmpty())
		{
			throw new NotFoundException();
		}
		
		boolean isPresent= false;
		Set<Integer> key=hm.keySet();
		Iterator<Integer> itr= key.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(ids==i)
			{
				isPresent=true;
			}
			}
		if(isPresent==true)
		{
			Iterator<Integer> itr1= key.iterator();
			while(itr1.hasNext())
			{
				Integer i=itr1.next();
				if(ids==i)
				{
					itr1.remove();
					System.out.println("Delete book succefully");
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
	}

	@Override
	public void searchByTitle() {
		
		System.out.println("enter a book title you want to search");
		String titles=sc.next();
	
		if(hm.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean isPresent=false;
		for(Map.Entry<Integer,Book> st: hm.entrySet())
		{
			if(titles.equals(st.getValue().getTitle()))
			{
				isPresent=true;
			}
		}
		if(isPresent==true)
		{
			for(Map.Entry<Integer,Book> st: hm.entrySet())
			{
				if(titles.equals(st.getValue().getTitle()))
				{
					System.out.println(st.getKey()+" "+st.getValue());
				}
			}
		}
		else
		{
			throw new NotFoundException();
		}
	}

	@Override
	public void displayList() {
		Set<Integer> key=hm.keySet();
		if(hm.isEmpty())
		{
			throw new NotFoundException();
		}
		else
		{
		Iterator<Integer> itr= key.iterator();
		System.out.println("All book lists");
		while(itr.hasNext())
		{
			Integer i= itr.next();
			System.out.println(i+" "+hm.get(i));
		}
		}
	}

	@Override
	public void displayByGenre() {
		System.out.println("enter a book genre you want to search");
		String genres=sc.next();
	
		if(hm.isEmpty())
		{
			throw new NotFoundException();
		}
		boolean isPresent=false;
		for(Map.Entry<Integer,Book> st: hm.entrySet())
		{
			if(genres.equals(st.getValue().getGenre()))
			{
				isPresent=true;
			}
		}	
		if(isPresent==true)
		{
			for(Map.Entry<Integer,Book> st: hm.entrySet())
			{
				if(genres.equals(st.getValue().getGenre()))
				{
					System.out.println(st.getKey()+" "+st.getValue());
				}
			}	
		}
		else
		{
			throw new NotFoundException();
		}
	}
}
