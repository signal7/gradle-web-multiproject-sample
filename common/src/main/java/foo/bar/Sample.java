package foo.bar;

import org.apache.commons.math.util.MathUtils;

public class Sample {

	public static void main(String[] args) {
		
		double distance1 = MathUtils.distance1(new double[]{0,0}, new double[]{1,1});
		System.out.println(distance1);
	}
}
