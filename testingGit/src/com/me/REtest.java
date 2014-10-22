package com.me;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Random r = new Random();
		//r.nextInt(100);
		int i=0,num;
		while(i<=30)
		{
			num = r.nextInt(4);
			//System.out.println(num);
			i++;
		}
		
	
			  
			  int min = -100;
			  int max = 0;

			  Random ra = new Random();
			  int j;
			  //= ra.nextInt(max - min + 1) + min;
			  i=0;
			 // String marks=String.valueOf(j);
			  while(i<=30)
				{
				   j = ra.nextInt(max - min + 1) + min;
				   System.out.println(j);
					//num = ra.nextInt(200);
					//System.out.println(num);
					//i++;
				}
			*/
		
		Date date1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyHHmmssS");
		System.out.println("Simple date : "+sdf.format(date1));
		
		File chromedriver = new File("lib/chromedriver.exe");
		System.out.println("chrome : "+chromedriver.getAbsolutePath());
		
		String email = "prashant.parekh@kiwiqa.com";
		String[] splitted = email.split("(\\@)");
		System.out.println("string 1 "+splitted[1]);
		Date date = new Date();
		System.out.println("date full "+date);
		String stringdate = String.valueOf(date).replace(" ","");
		System.out.println("date time "+ splitted[0]+"+"+stringdate+"@"+splitted[1]);
		
	}

}
