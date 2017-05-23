package com.ros.dev.utility;

import static org.junit.Assert.*;

import org.junit.*;

/** 

 * Class Int2WordTest is the unit test to test class Int2Word method trans using junit library. 
  
 * @author  Jun 
 
 * @version 1.01, 03/25/17 
 
 */  
public class Int2WordTest {

	private Int2Word toEng = null;
//	private Int2Word toChi = null;
	
	@Before
	public void setUp(){
		toEng = new Int2English();
//		toChi = new Int2Chinese();
	}
	//	below is the right input test case
	@Test
	public void test0() {
		String str = (String) toEng.trans(0);
		//	check return value of the method, 
		//	first parameter is expected value
		//	second parameter is actual return value
		assertEquals("zero", str);	
	}
	
	@Test
	public void test1() {
		String str = (String) toEng.trans(1);
		assertEquals("one", str);	
	}

	@Test
	public void test2() {
		String str = (String) toEng.trans(2);
		assertEquals("two", str);	
	}
	
	@Test
	public void test3() {
		String str = (String) toEng.trans(3);
		assertEquals("three", str);	
	}
	
	@Test
	public void test4() {
		String str = (String) toEng.trans(4);
		assertEquals("four", str);	
	}
	
	@Test
	public void test5() {
		String str = (String) toEng.trans(5);
		assertEquals("five", str);	
	}
	
	@Test
	public void test6() {
		String str = (String) toEng.trans(6);
		assertEquals("six", str);	
	}
	
	@Test
	public void test7() {
		String str = (String) toEng.trans(7);
		assertEquals("seven", str);	
	}
	
	@Test
	public void test8() {
		String str = (String) toEng.trans(8);
		assertEquals("eight", str);	
	}
	
	@Test
	public void test9() {
		String str = (String) toEng.trans(9);
		assertEquals("nine", str);	
	}
	
	@Test
	public void test10() {
		String str = (String) toEng.trans(10);
		assertEquals("ten", str);	
	}
	
	@Test
	public void test11() {
		String str = (String) toEng.trans(11);
		assertEquals("eleven", str);	
	}
	
	@Test
	public void test12() {
		String str = (String) toEng.trans(12);
		assertEquals("twelve", str);	
	}
	
	@Test
	public void test13() {
		String str = (String) toEng.trans(13);
		assertEquals("thirteen", str);	
	}
	
	@Test
	public void test14() {
		String str = (String) toEng.trans(14);
		assertEquals("fourteen", str);	
	}
	
	@Test
	public void test15() {
		String str = (String) toEng.trans(15);
		assertEquals("fifteen", str);	
	}
	
	@Test
	public void test16() {
		String str = (String) toEng.trans(16);
		assertEquals("sixteen", str);	
	}
	
	@Test
	public void test17() {
		String str = (String) toEng.trans(17);
		assertEquals("seventeen", str);	
	}
	
	@Test
	public void test18() {
		String str = (String) toEng.trans(18);
		assertEquals("eighteen", str);	
	}
	
	@Test
	public void test19() {
		String str = (String) toEng.trans(19);
		assertEquals("nineteen", str);	
	}
	
	@Test
	public void test20(){
		String str = (String) toEng.trans(20);
		assertEquals("twenty",str);
	}
	
	@Test
	public void test30(){
		String str = (String) toEng.trans(30);
		assertEquals("thirty",str);
	}
	
	@Test
	public void test40(){
		String str = (String) toEng.trans(40);
		assertEquals("forty",str);
	}
	
	@Test
	public void test50(){
		String str = (String) toEng.trans(50);
		assertEquals("fifty",str);
	}
	
	@Test
	public void test60(){
		String str = (String) toEng.trans(60);
		assertEquals("sixty",str);
	}
	
	@Test
	public void test70(){
		String str = (String) toEng.trans(70);
		assertEquals("seventy",str);
	}
	
	@Test
	public void test80(){
		String str = (String) toEng.trans(80);
		assertEquals("eighty",str);
	}
	
	@Test
	public void test90(){
		String str = (String) toEng.trans(90);
		assertEquals("ninety",str);
	}
	
	@Test
	public void test21(){
		String str = (String) toEng.trans(21);
		assertEquals("twenty one",str);
	}
	
	@Test
	public void test99(){
		String str = (String) toEng.trans(99);
		assertEquals("ninety nine",str);
	}
	
	@Test
	public void test100(){
		String str = (String) toEng.trans(100);
		assertEquals("one hundred",str);
	}
	
	@Test
	public void test105(){
		String str = (String) toEng.trans(105);
		assertEquals("one hundred and five",str);
	}
	
	@Test
	public void test200(){
		String str = (String) toEng.trans(200);
		assertEquals("two hundred",str);
	}
	
	@Test
	public void test999(){
		String str = (String) toEng.trans(999);
		assertEquals("nine hundred and ninety nine",str);
	}
	
	@Test
	public void test1000(){
		String str = (String) toEng.trans(1000);
		assertEquals("one thousand",str);
	}
	
	@Test 
	public void test25781(){
		String str = (String) toEng.trans(25781);
		assertEquals("twenty five thousand seven hundred and eighty one",str);
	}
	
	@Test
	public void test999999(){
		String str = (String) toEng.trans(999999);
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine",str);
	}
	
	@Test
	public void testOneMillion(){
		String str = (String) toEng.trans(1000000);
		assertEquals("one million",str);
	}
	
	@Test
	public void test56945781(){
		String str = (String) toEng.trans(56945781);
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",str);
	}
	
	@Test
	public void test999999999(){
		String str = (String) toEng.trans(999999999);
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",str);
	}
	
//	below is the wrong or invalid input test case
	@Test
	public void testMinusOne(){
		String str = (String) toEng.trans(-1);
		assertEquals("out of range",str);
	}
	
	@Test 
	public void testOneBillion(){
		String str = (String) toEng.trans(1000000000);
		assertEquals("out of range",str);
	}
	
	@Test
	public void testChar(){
		char c = 'a';
		String str = (String) toEng.trans(c);
		assertEquals("null",str);
	}
	
}
