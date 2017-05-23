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
		new Data(0,"zero","零"),
       	new Data(1,"one","一"),
       	new Data(2,"two","二"),
       	new Data(3,"three","三"),
       	new Data(4,"four","四"),
       	new Data(5,"five","五"),
       	new Data(6,"six","六"),
       	new Data(7,"seven","七"),
       	new Data(8,"eight","八"),
       	new Data(9,"nine","九"),
       	new Data(10,"ten","十"),
       	new Data(11,"eleven","十一"),
       	new Data(12,"twelve","十二"),
       	new Data(13,"thirteen","十三"),
       	new Data(14,"fourteen","十四"),
       	new Data(15,"fifteen","十五"),
       	new Data(16,"sixteen","十六"),
       	new Data(17,"seventeen","十七"),
       	new Data(18,"eighteen","十八"),
       	new Data(19,"nineteen","十九")
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
