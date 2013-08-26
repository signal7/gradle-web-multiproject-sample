package foo.bar;

import org.apache.commons.math.util.MathUtils;

import bar.foo.MyCore;

public class Sample {

	public void bar() {

		double distance1 = MathUtils.distance1(new double[] { 0, 0 },
				new double[] { 1, 1 });
		System.out.println(distance1);
		MyCore myCore = new MyCore();
		myCore.foo();
	}
}
