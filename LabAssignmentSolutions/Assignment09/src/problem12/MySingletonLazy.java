package problem12;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance = null;
	private MySingletonLazy() {}
	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElse(new MySingletonLazy());
	}
	
	
	public static void main(String[] args) {
		// check if getInstance gives a non-null object
		if(MySingletonLazy.getInstance() != null)
			System.out.println("getInstance provides a non-null instance!!!");

	}

}
