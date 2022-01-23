package com.lockedme;

import java.io.File;
import java.util.Scanner;

public class LockedMe {
	
	public static String filePath="C:\\Users\\sdornala\\Desktop\\Myfile";
	public static String errorMsg="Something went wrong,Please contact lockedme@lkf.com";

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stu
		System.out.println("******** Welcome to LockedMe.com *********");
		System.out.println("###########################################");
		System.out.println("\t1.Display All Files\t\n\t2.Add a new filet\t\n\t3.Delete a file\t\n\t4.search a filet\t\n\t5.Exit");
		System.out.println("Please enter your choice");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		switch (x) {
		case 1:displayFiles();
		break;
		case 2:addFile();
		break;
		case 3:deleteFile();
		break;
		case 4:searchFile();
		break;
		case 5:System.exit(0);;	
		break;
		default:System.out.println("Invalid Option Entered");
			break;
		}
		
	}

	private static void searchFile() {
		// TODO Auto-generated method stub	
	}

	private static void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	private static void addFile() {
		// TODO Auto-generated method stub
		
	}

	private static void displayFiles() {
		// TODO Auto-generated method stub
		try 
		{
			File file=new File(filePath);
			File[] listoffiles=file.listFiles();
			if(listoffiles.length==0)
				System.out.println("No Files Found in directory");
			else
			{
				for(var l:listoffiles)
					System.out.println(l.getName());
			}
			
		
		} 
		catch (Exception e) 
		{
			System.out.println(errorMsg);
		}
	}
	
}
		