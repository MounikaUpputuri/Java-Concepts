package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class FilterAverage {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,764,234);
		System.out.println(list.stream().map(e-> e*e).filter(e-> e>100).mapToInt(e->e).average().getAsDouble());
	}

}
