package com;

public class Singleton {

	//懒汉式的单例:使用的时候才会创建,不用的时候为null
	private static Singleton instance =null;
	public static synchronized Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
		
	}
	
	//饿汉式的单例:不管你用不用,一开始就创建好
	private static Singleton singleton = new Singleton();
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
