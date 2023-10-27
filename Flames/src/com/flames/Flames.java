package com.flames;

import java.util.Scanner;
public class Flames {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to flames lets know what shows");
		boolean b=false;
		while(!b){
			System.out.println("Enter your First Person Name: ");
			String s1=sc.next();
			System.out.println("Enter your second person Name:");
			String s2=sc.next();
			
			String s=flames(s1,s2);
			System.out.println("after flames you got: "+s);
			
			System.out.println("1.continue to check other names");
			System.out.println("2.Exit");
			int a=sc.nextInt();
			if(a==1)
			{
				continue;
			}
			else if(a==2)
			{
				System.exit(0);
			}
			else
			{
				System.exit(0);
			}
		}
		
	}
	public static String flames(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		String s4="";
		String s5="";
		int k=0;
		for(int i=0;i<c1.length;i++)
		{
			
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j]&&c1[i]!='1')
				{
					c2[j]='1';
					c1[i]='1';
					
					break;
				}
			}
			
			if(c1[i]!='1')
			{
				s4=s4+c1[i];	
			}
			
			
		}
		
		for(int i=0;i<c2.length;i++)
		{
			
			for(int j=0;j<c1.length;j++)
			{
				if(c2[i]==c1[j]&&c2[i]!='1')
				{
					c2[i]='1';
					c1[j]='1';
					
					break;
				}
			}
			
			if(c2[i]!='1')
			{
				s5=s5+c2[i];	
			}
		}
		int length=s4.length()+s5.length();
		String flames="flames";
		int index=0;
		while(flames.length()>1)
		{
			int removalindex=(index+length-1)%flames.length();
			flames=flames.substring(0,removalindex)+flames.substring(removalindex+1);
			index=removalindex%flames.length();
		}
		 String result="";
		 switch(flames)
		 {
		 case "f":
			 result="Friends";
			 break;
		 case "l":
			 result="Love";
			 break;
		 case "a":
			 result="Affection";
			 break;
		 case "m":
			 result="Marriage";
			 break;
		 case "e":
			 result="Enemy";
			 break;
		 case "s":
			 result="Sister";
			 break;
		 }
		
		
		
		return result ;
	}
}
