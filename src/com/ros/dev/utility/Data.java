package com.ros.dev.utility;

/** 

 * Class Data is used to match integer to English, Chinese words etc. 
 
 * @author  Jun 
 
 * @version 1.01, 25/03/17 
 
 */  
public class Data {
	int i;
	String enword;
	String cnword;
	public Data(int i,String en,String cn){
		this.i = i;
		this.enword = en;
		this.cnword = cn;
	}

	public String getEnWord(){
		return this.enword;
	}
	
	public String getCnWord(){
		return this.cnword;
	}
	
}

  