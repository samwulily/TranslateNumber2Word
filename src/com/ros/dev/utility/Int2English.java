package com.ros.dev.utility;
/** 

 * Class Int2English is inherited from class Int2Word which can 
 * translate integer to English words.  
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */
public class Int2English extends Int2Word{

	public Int2English() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Translate integer to English words. 
     * @param	i	the integer which will been translated
     * @return	the English words	
     */   
	@Override
	public String trans(int i) {
		// TODO Auto-generated method stub
		System.out.print("English!Your integer is:"+i);
		String output = null;
		try{
			output = lessthanOneBillion(i);			
		}catch (Int2WordException iwe){
			System.err.println(iwe.getMessage());
		}
		if(null!=output){
			System.out.println(" English word is:" + output);
		}
		return output;
	}
	
	/**
     * Translate integer to English words if the integer great than or equal to zero and less than twenty.
     * @param		i	the integer which will be translate
     * @return 		the English words
     * @exception 	Int2WordException if
     * 				i is less than zero or great than nineteen.
     */   
	public String lessthan20(int i) throws Int2WordException {
		String str = null;
		if(i>=Int2Word.ZERO&&i<Int2Word.TWENTY){
			str = Int2Word.dataarr[i].getEnWord();
		}else{
			throw new Int2WordException("Out of range!Input must great than or "
					+ "equal to zero and less than 20");
		}
		return str;
	}
	
	/**
     * Translate integer to English words if the integer great than or equal to zero and less than one hundred.
     * @param		i	the integer which will be translate
     * @return 		the English words
     * @exception 	Int2WordException if
     * 				i is less than zero or great than ninety nine or 
     * 				throw exception from method lessthan20.
     */   
	public String lessthan100(int i) throws Int2WordException{
		String str = null;
		if(i>=Int2Word.ZERO&&i<Int2Word.ONEHUNDRED){
			if(i<Int2Word.TWENTY){
				str = lessthan20(i);
			}else{
				int tens = i/Int2Word.TEN;
				int units = i%Int2Word.TEN;
				String strTens = Int2Word.dataTensarr[tens-2].getEnWord();
				String strUnits = "";
				if(units!=Int2Word.ZERO){
					strUnits = " "+ Int2Word.dataarr[units].getEnWord();
				}
				str = strTens + strUnits;
			}
		}else{
			throw new Int2WordException("Out of range!Input must greate than or "
					+ "equal to zero and less than 100");
		}
		return str;
	}

	/**
     * Translate integer to English words if the integer great than or equal to zero and less than one thousand.
     * @param		i	the integer which will be translate
     * @return 		the English words
     * @exception 	Int2WordException if
     * 				i is less than zero or great than nine hundred and ninety nine or 
     * 				throw exception from method lessthan100.
     */   
	public String lessthan1000(int i) throws Int2WordException{
		String str = null;
		if(i>=Int2Word.ZERO&&i<Int2Word.ONETHOUSAND){
			if(i<Int2Word.ONEHUNDRED){
				str = lessthan100(i);
			}else{
				int hunds = i/Int2Word.ONEHUNDRED;
				int rest = i - hunds*Int2Word.ONEHUNDRED;
				String strHunds = Int2Word.dataarr[hunds].getEnWord() + " hundred";
				String strRest = "";
				if(rest!=0){
					strRest = " and " + lessthan100(rest);
				}
				str = strHunds + strRest;
			}
		}else{
			throw new Int2WordException("Out of range!Input must greate than or "
					+ "equal to zero and less than 1000");
		}
		return str;
	}
	
	/**
     * Translate integer to English words if the integer great than or equal to zero and less than one million.
     * @param		i	the integer which will be translate
     * @return 		the English words
     * @exception 	Int2WordException if
     * 				i is less than zero or great than 999,999 or 
     * 				throw exception from method lessthan1000.
     */   
	public String lessthanOneMillion(int i) throws Int2WordException{
		String str = null;
		if(i>=Int2Word.ZERO&&i<Int2Word.ONEMILLION){
			if(i<Int2Word.ONETHOUSAND){
				str = lessthan1000(i);
			}else{
				int thous = i/Int2Word.ONETHOUSAND;
				int rest = i - thous*Int2Word.ONETHOUSAND;
				
				String strThous = lessthan1000(thous) + " thousand";
				String strRest = "";
				
				if(rest!=Int2Word.ZERO){
					strRest = " " + lessthan1000(rest);
				}
				str = strThous + strRest;
			}
		}else{
			throw new Int2WordException("Out of range!Input must greate than or "
					+ "equal to zero and less than one million");
		}
		return str;
	}
	
	/**
     * Translate integer to English words if the integer great than or equal to zero and less than one billion.
     * @param		i	the integer which will be translate
     * @return 		the English words
     * @exception 	Int2WordException if
     * 				i is less than zero or great than 999,999,999 or 
     * 				throw exception from method lessthanOneMillion.
     */   
	public String lessthanOneBillion(int i) throws Int2WordException{
		String str = null;
		if(i>=Int2Word.ZERO&&i<Int2Word.ONEBILLION){
			if(i<Int2Word.ONEMILLION){
				str = lessthanOneMillion(i);
			}else{
				int mills = i/Int2Word.ONEMILLION;
				int rest = i - mills*Int2Word.ONEMILLION;
				
				String strMills = lessthan1000(mills) + " million";
				String strRest = "";
				if(rest!=0){
					strRest = " " + lessthanOneMillion(rest);
				}
				str = strMills + strRest;
			}
		}else{
			throw new Int2WordException("Out of range!Input must greate than or "
					+ "equal to zero and less than billion");
		}
		return str;
	}
	
}
