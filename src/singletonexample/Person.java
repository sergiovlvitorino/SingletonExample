package singletonexample;

public class Person {

	private static Person instance = null;
	
	public static Person getInstance(){
		if(instance == null){
			instance = new Person();
		}
		return instance;
	}
	
	private Person(){
		
	}
	
}
