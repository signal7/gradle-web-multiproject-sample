package bar.foo;

import org.fluttercode.datafactory.impl.DataFactory;

public class MyCore {

	public void foo() {
		// long factorial = MathUtils.factorial(3);
		// return factorial;
		DataFactory dataFactory = new DataFactory();
		String address = dataFactory.getAddress();
		System.out.println(address);

	}
}
