package patterns.creational;

public enum SingletonEnum {
	Instance;

	public static SingletonEnum getInstance() {
		return Instance;
	}

}
