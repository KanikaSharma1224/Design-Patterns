package patterns.creational;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testSingleton() {
		Singleton singleton = Singleton.getInstance();
		assertSame(Singleton.getInstance(), singleton);
	}

}
