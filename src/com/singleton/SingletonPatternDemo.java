package com.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();
		object.setAd("ali");
		System.out.println(object.getAd());
		
		//object değişkeni de aynısı olduğu için değişmiş oluyor yani object ve object2 aynı nesne farklı iki değişken adıyla point ediliyorlar
		SingleObject object2 = SingleObject.getInstance();
		object2.showMessage();
		object2.setAd("ahmet");
		System.out.println(object2.getAd());
		System.out.println(object.getAd());
		
	}
}
