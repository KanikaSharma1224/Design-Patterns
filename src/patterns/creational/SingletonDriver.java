package patterns.creational;

public class SingletonDriver {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("First Singleton Object : " + singleton);
		System.out.println("Second Singleton Object : " + singleton2);
		System.out.println("First and Singleton Objects are same : " + (singleton == singleton2));

	}

}
