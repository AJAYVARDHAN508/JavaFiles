package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(25);
		
		Stream<Integer> s =list.stream();
	s=s.map(new OurFunction());
	s.forEach(new OurConsumer());
		
		list.stream().map((j)->{return j*5;}).forEach(
				(i)->{System.out.println(i);}
				);
	}

}

class OurFunction implements Function<Integer,Integer>{
@Override
	public Integer apply(Integer t) {
	return t*5;
    }
}
class OurConsumer implements Consumer<Integer>{
@Override
public void accept(Integer t) {
	System.out.println(t);
     }

}
// 1.filter
// 2.map
// 3.for each
//4.count

