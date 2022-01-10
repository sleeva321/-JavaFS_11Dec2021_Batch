package com.javaquiz.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaQuiz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		var name=sc.nextLine();
		var result=0;
		System.out.println("1.What is a correct syntax to output \"Hello World\" in Java?");
		System.out.println(" 1.Console.WriteLine(\"Hello World\"); \n 2.print (\"Hello World\"); \n 3.System.out.println(\"Hello World\");  \n 4.echo(\"Hello World\");");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your option");
		int input=sc1.nextInt();
		if (input==3)
		{
			result=result+20;
		}
		System.out.println("2.Which data type is used to create a variable that should store text?");
		System.out.println(" 1.String \n 2.char \n 3.string  \n 4.Txt");
		
		System.out.println("Enter your option");
		int input1=sc1.nextInt();
		if (input1==1)
		{
			result=result+20;
		}
		
		System.out.println("3.Which method can be used to find the length of a string?");
		System.out.println(" 1.getLength() \n 2.getSize() \n 3.len()  \n 4.length()");
		
		System.out.println("Enter your option");
		int input2=sc1.nextInt();
		if (input2==4)
		{
			result=result+20;
		}
		
		System.out.println("4.Which method can be used to return a string in upper case letters?");
		System.out.println(" 1.upperCase() \n 2.tuc() \n 3.touppercase() \n 4.toUpperCase()");
		
		System.out.println("Enter your option");
		int input3=sc1.nextInt();
		if (input3==4)
		{
			result=result+20;
		}
		
		System.out.println("4.What is the correct way to create an object called myObj of MyClass?");
		System.out.println(" 1.class myObj = new MyClass(); \n 2.MyClass myObj = new MyClass();  \n 3.class MyClass = new myObj(); \n 4.new myObj = MyClass();");
		
		System.out.println("Enter your option");
		int input4=sc1.nextInt();
		if (input4==2)
		{
			result=result+20;
		}
		
//	System.out.println("Your result is :"+result);
		
		
		FileWriter fw=new FileWriter("C:\\Users\\sdornala\\Desktop\\files\\JavaQuiz.txt",true);
		fw.write(name +","+result+"\n" );
		
		
		sc.close();
		fw.close();
		sc1.close();
		

	}

}
