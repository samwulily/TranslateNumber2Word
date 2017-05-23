package com.ros.dev.utility;

/** 

 * Class Int2Chinese is inherited from class Int2Word which can 
 * translate integer to Chinese words.  
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */
public class Int2Chinese extends Int2Word{

	public Int2Chinese() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Translate integer to Chinese words. 
     * @param	i	the integer which will been translated
     * @return	the Chinese words	
     */   
	@Override
	public String trans(int i) {
		// TODO Auto-generated method stub
		System.out.println("Chinese!Your integer is:"+i);
		return null;
	}

}
