package testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stream1 {
	// @Test
	public void regular() {

		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jino");
		names.add("Jerin");
		names.add("Bejoy");
		names.add("Karun");
		names.add("Jijo");
		int count = 0;
		for (String name : names) {
			String neededNames = name;
			if (neededNames.startsWith("J")) {
				count++;
			}
		}
		System.out.println(count);

	}

	// @Test
	public void usingStream() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jino");
		names.add("Jerin");
		names.add("Bejoy");
		names.add("Karun");
		names.add("Jijo");
		Long size = names.stream().filter(s -> s.startsWith("J")).count();
		System.out.println(size);
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//		names.stream().forEach(s->System.out.println(s.toUpperCase()));
//		names.stream().filter(s->s.endsWith("o")).sorted().forEach(s->System.out.println(s.toUpperCase()));
		names.stream().filter(s -> s.endsWith("o")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		List<String> cars = Arrays.asList("Magnite", "Kiger", "City", "Carnival", "Camry", "Jino");
		cars.stream().filter(s -> s.startsWith("K")).forEach(s -> System.out.println(s));
		System.out.println("--------------------------Printing New Merged Stream--------------------------");
		// Merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), cars.stream());
//		newStream.sorted().forEach(s->System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("jijo"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		List<String> name = Stream.of("Jino", "Jijo", "Karun", "Jojo", "Albin").filter(s -> s.startsWith("J"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(name.get(0));

		List<Integer> values = Arrays.asList(1, 5, 2, 4, 2, 6, 7, 4, 3, 5);
//		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> ls = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls.get(2));
	}
}
