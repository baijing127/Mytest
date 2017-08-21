package com;


import org.junit.Test;

public class StringDemo {
	
	
	public static void main(String[] args) {
		String str = "abcdefj";
//		char c = str.charAt(2);
//		System.out.println(c);
		
//		String substring = str.substring(1);
//		System.out.println(substring);
		
		String reverse = StringDemo.reverse(str);
		System.out.println(reverse);
	}
	
	//字符串的反转,使用递归实现.(可以自己实现,把字符串分割,然后反转,也可以使用stringbuilder或者stringbuffer的方法来实现)
	 public static String reverse(String originStr) {
	        if(originStr == null || originStr.length() <= 1) 
	            return originStr;
	        return reverse(originStr.substring(1)) + originStr.charAt(0);
	    }
	 //第一次:bcdefj+a
	 //cdefj+b+a
	 //defj+c+b+a
	 //efj+d+c+b+a
	 //fj+e+d+c+b+a
	 //j+f+e+d+c+b+a
	 
	 /**
	  * 将GB2312编码的字符串转换为ISO-8859-1编码的字符串
	  * @throws Exception
	  */
	 @Test
	public void test1() throws Exception {
		 String s1 = "你好";
		 String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
		 
	}
}
