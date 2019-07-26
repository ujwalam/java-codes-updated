//import java.awt.List;
import java.util.*;
import java.util.stream.Stream;

public class StreamApp {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi","hello","world","how","is","it","going");
		ex1(words);
		ex2(words);
		ex3(words);
		ex21(words);
	}
	private static void ex1(List<String> l) {
		l.forEach(e -> System.out.println("  "+e));
	}
	private static void ex2(List<String> l) {
		l.forEach(e-> System.out.println(condition(e)));
	}
	private static String condition(String s)
	{
		String w = "  "+s;
		return w;
	}
	private static void ex3(List<String> l) {
		List<String> st = new ArrayList<String>();
		l.forEach( k -> st.add(k.replace("i", "eye")));
		st.forEach(e -> System.out.println(e));	
	}
	private static void ex21(List<String> l) {
		List<String> st = new ArrayList<String>();
		String p = new String("a");
		l.forEach( k -> p.concat(k));
		System.out.println(p);	
	}

 }