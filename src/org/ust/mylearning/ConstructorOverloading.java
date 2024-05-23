package org.ust.mylearning;

public class ConstructorOverloading {
	String name;

	ConstructorOverloading() {
		System.out.println("constructor method called");
	}ConstructorOverloading(String t) {
		name=t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading cpp=new ConstructorOverloading();
		ConstructorOverloading java=new ConstructorOverloading("java");
		cpp.setName("c++");
		java.getName();
		cpp.getName();

	}
	private void getName() {
		// TODO Auto-generated method stub
		System.out.println("Language name: " + name);
	}
	private void setName(String t) {
		name=t;

		// TODO Auto-generated method stub
		
	}

}
