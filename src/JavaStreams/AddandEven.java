package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddandEven {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,764,234);
		List<Integer>lists=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(lists);

	}

}
