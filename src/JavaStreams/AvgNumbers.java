package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class AvgNumbers {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,764,234);
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}

}
