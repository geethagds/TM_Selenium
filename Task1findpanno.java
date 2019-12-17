package Findtextfilesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1findpanno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File fs=new File("F:\\seleniumtasks\\TM_selenium_oct","pandata" );
		
	fs.createNewFile();
				FileWriter fw=new FileWriter(fs, true);
		
		PrintWriter pw=new PrintWriter(fw);
		
		String pandata="lving, and, in some BGLPG5632A cases, machine learning, AI";
		
		pw.println(pandata);		
	
		pw.flush();
		
		pw.close();
		fw.close();
	
		
	FileReader fr=new FileReader(fs);
		
		BufferedReader br=new BufferedReader(fr);
		
		String data=br.readLine();
		
		
		
	
		
		String Pattern="[A-z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern p=java.util.regex.Pattern.compile(Pattern);
		
		Matcher match=p.matcher(pandata);
		
	while(match.find())
		
	{
		
		String result=match.group();
		
		System.out.println(result);
	}
		
		
			
		}
			
			

}
		
		
		
		
		
		
		
		
		
		
		

	