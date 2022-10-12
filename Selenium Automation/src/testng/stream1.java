package testng;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class stream1 {
  //@Test
  public void regular() {

		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jino");
		names.add("Jerin");
		names.add("Bejoy");
		names.add("Karun");
		names.add("Jijo");
		int count = 0;
		for(String name: names) {
			String neededNames =name;
			if(neededNames.startsWith("J")) {
				count++;
			}
		}
		System.out.println(count);
	
  }
  
  @Test
  public void usingStream() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jino");
		names.add("Jerin");
		names.add("Bejoy");
		names.add("Karun");
		names.add("Jijo");
		Long size = names.stream().filter(s->s.startsWith("J")).count();
		System.out.println(size);
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//		names.stream().forEach(s->System.out.println(s.toUpperCase()));
//		names.stream().filter(s->s.endsWith("o")).sorted().forEach(s->System.out.println(s.toUpperCase()));
		names.stream().filter(s->s.endsWith("o")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	  
  }
}
