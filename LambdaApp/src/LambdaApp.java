import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"apple","cat","ball","dog","elephant","eagle","hippo"};
		List<String> sList = Arrays.asList(s);
//		Collections.sort(sList);
//		sort by length
		Collections.sort(sList, (s1,s2)->s1.length()-s2.length());
		System.out.println("After sorting "+ sList);
//		sort in reverse
		Collections.sort(sList, (s1,s2)-> s2.length()-s1.length());
		System.out.println("Reverse "+ sList);
//		alphabetical order
		Collections.sort(sList);
		System.out.println("Alphabetical order "+ sList );
//      one with e coming first
		Collections.sort(sList, LambdaApp::condition); //since "condition" is static method, class name (LambdaApp) is used
		System.out.println("Sorting with e "+sList);
		ex4();
		ex3_2();

	}
	public static String betterString(String first,String second,TwoStringPredicate condition) {
		if(condition.isFirstBetter(first, second)) 
			return first;
		else
			return second;
	}
	private static void ex3() {
		 String longer = betterString("aaaknskfb", "sjdfkjbfb", (arg1,arg2)->arg1.length() > arg2.length());
	        System.out.println("Longer word is "+longer);
	        
	}
	private static void ex4() {
		String longer = betterElement("aaaknskfb", "sjdfkjbfb", (arg1,arg2)->arg1.length() > arg2.length());
        System.out.println("Longer word is "+longer);
        Integer greater = betterElement(10,20,(i1,i2)->i1>i2);
        System.out.println("Greater number "+ greater);
	}
	public static <T> T betterElement(T first, T second, TwoElementPredicate<T> condition) {
		if(condition.isFirstBetter(first, second)) 
			return first;
		else
			return second;
	}
	private static int condition(String s1,String s2) {
		int a = 0;
		if(s1.contains("e") && !s2.contains("e"))
			a = -1;
		else if(s2.contains("e") && !s1.contains("e"))
			a = 1;
		else if((s1.contains("e") && s2.contains("e"))||(!s1.contains("e") && !s2.contains("e")))
			a = 0;
		return a;
	}
	private static void ex1_2() {
		String[] words = {"this","is","a","test","code","for","predicate","usage"};
		List<String> l = Arrays.asList(words);
		Predicate<String> pre = s -> s.length()<4;
		System.out.println("Before filtering"+l);
		List<String> filtered = allMatches(l,pre);
		System.out.println("words of size less than 4" + filtered);
		
	}
	private static List<String> allMatches(List<String> l, Predicate<String> pres)
	{
		List<String> shortwords = l.stream().filter(pres).collect(Collectors.toList()) ;
		return shortwords;
		
	}
	private static void ex2_2() {
		String[] words = {"this","is","a","test","code","for","predicate","usage"};
		List<String> l = Arrays.asList(words);
		Predicate<String> pre = s -> s.length()<4;
		System.out.println("Before filtering"+l);
		List<String> filtered = allMatchesElement(l,pre);
		System.out.println("words of size less than 4" + filtered);
		List<Integer> nums = Arrays.asList(1,10,100,1000,100000);
		Predicate<Integer> prenum = i1-> i1>10;
		List<Integer> filterednum = allMatchesElement(nums,prenum);
		System.out.println("Greater numbers" + filterednum);
		
		
	}
	private static <T> List<T> allMatchesElement(List<T> l, Predicate<T> pres)
	{
		List<T> shortwords = l.stream().filter(pres).collect(Collectors.toList()) ; 
		return shortwords;
		
	}
	private static List<String> transformList(List<String> l){
		List<String> st = new ArrayList<String>();
		l.forEach( k -> st.add(k+"!"));
		return st;
		
	}
	private static void ex3_2() {
		String[] words = {"this","is","a","test","code","for","predicate","usage"};
		List<String> l = Arrays.asList(words);
		List<String> filtered = transformList(l);
		System.out.println("Filteres"+filtered);
		
	}

}
