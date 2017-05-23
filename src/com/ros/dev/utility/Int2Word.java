package com.ros.dev.utility;

/** 

 * Class Int2Word is the abstract super class for all class translate integer to human language words. 
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */  

public abstract class Int2Word {
	
	/*
	 * March integer to English and Chinese words,from 0 to 19, 
	 * the first element represent integer
	 * the second element represent English words
	 * the third element represent Chinese words
	 */
	public static final Data dataarr[] = {
		new Data(0,"zero","��"),
       	new Data(1,"one","һ"),
       	new Data(2,"two","��"),
       	new Data(3,"three","��"),
       	new Data(4,"four","��"),
       	new Data(5,"five","��"),
       	new Data(6,"six","��"),
       	new Data(7,"seven","��"),
       	new Data(8,"eight","��"),
       	new Data(9,"nine","��"),
       	new Data(10,"ten","ʮ"),
       	new Data(11,"eleven","ʮһ"),
       	new Data(12,"twelve","ʮ��"),
       	new Data(13,"thirteen","ʮ��"),
       	new Data(14,"fourteen","ʮ��"),
       	new Data(15,"fifteen","ʮ��"),
       	new Data(16,"sixteen","ʮ��"),
       	new Data(17,"seventeen","ʮ��"),
       	new Data(18,"eighteen","ʮ��"),
       	new Data(19,"nineteen","ʮ��")
	};
	
	/*
	 * March integer to English and Chinese words,20,30,40,50,60,70,80 and 90, 
	 * the first element represent integer
	 * the second element represent English words
	 * the third element represent Chinese words ( to be finished )
	 */
	public static final Data dataTensarr[] = {
       	new Data(20,"twenty",""),
       	new Data(30,"thirty",""),
       	new Data(40,"forty",""),
       	new Data(50,"fifty",""),
       	new Data(60,"sixty",""),
       	new Data(70,"seventy",""),
       	new Data(80,"eighty",""),
       	new Data(90,"ninety","")
	};
	
	public static final int ZERO = 0;
	
	public static final int TEN = 10;
	
	public static final int TWENTY = 20;
	
	public static final int ONEHUNDRED = 100;
	
	public static final int ONETHOUSAND = 1000;
	
	public static final int ONEMILLION = 1000000;
	
	public static final int ONEBILLION = 1000000000; 
	
	public Int2Word() {
		// TODO Auto-generated constructor stub
			
	}

	/**
     * Translate integer to human language words. 
     * @param	i	the integer which will been translated
     * @return	the human language words	
     */   
	public abstract String trans(int i);

}
