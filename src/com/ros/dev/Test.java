package com.ros.dev;


import java.io.IOException;
import java.util.Scanner;

import com.ros.dev.utility.Int2Chinese;
import com.ros.dev.utility.Int2English;
import com.ros.dev.utility.Int2Word;


/** 

 * Class Test is used to test class Int2Word method trans by manual. 
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */  
public class Test {

	public static void main(String[] args){
		
		try{
				
			Int2Word toEng = new Int2English();
	        Int2Word toChi = new Int2Chinese();
	               
	        Scanner in = new Scanner(System.in);
	        char c = 'e';     
	        while(c!='q'){
	        	System.out.print("Please input an integer,from 0 to 999,999,999\r\n");
	            int i;
	            i = in.nextInt();
	            System.out.print("Please choose:\r\n"
	            		+ "q for quit\r\n"
	            		+ "e for output English:\r\n"
	            		+ "c for output Chinese.\r\n");
	            c = (char) System.in.read();
	        	switch(c) 
	            { 
	               case 'e': 
	            	   toEng.trans(i);
	                   break; 
	               case 'c': 
	            	   toChi.trans(i);
	                   break; 
	               default: 
	                   System.out.println("Sorry but I don't understand you."); 
	                   break; 
	            }
	        } 
	        in.close(); 
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.out.println("IOException:"+ioe.getMessage());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception:"+e.getMessage());
		}finally{
			System.out.println("Test finish!");
		}
	}
}
