package com.ros.dev.utility;

/** 

 * Class Int2WordException is inherited from super class Exception.
 
 * This class is used to store exception message and throw exception when exception happens. 
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */  

public class Int2WordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Int2WordException (){
		super();
	}

	public Int2WordException (String msg){
		super(msg);
	}
	
	public Int2WordException (String msg,Throwable cause){
		super(msg,cause);
	}
	
	public Int2WordException (Throwable cause){
		super(cause);
	}
	
}
