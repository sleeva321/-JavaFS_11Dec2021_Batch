package com.javaquiz.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GetScore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileReader fr=new FileReader("C:\\Users\\sdornala\\Desktop\\files\\JavaQuiz.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		var file=Files.readAllLines(Paths.get("C:\\Users\\sdornala\\Desktop\\files\\JavaQuiz.txt"));
		boolean flag=false;
		for(var e:file)
		{
			var data=e.split(",");
			if(data[0].equalsIgnoreCase(name))
			{
				System.out.println("Score for "+name+" is "+data[1]);
				flag=true;
				break;
			}
		}
		
		if (flag==false)
		{
			System.out.println("Name Not Found");
		}
		
		
	}

}
