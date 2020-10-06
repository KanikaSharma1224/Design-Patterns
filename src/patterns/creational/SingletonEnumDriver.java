package patterns.creational;

public class SingletonEnumDriver {
	public static void main(String[] args) {
		SingletonEnum enumObj = SingletonEnum.getInstance();
		System.out.println(enumObj == SingletonEnum.Instance);
	}

}
