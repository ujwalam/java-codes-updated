import java.util.*;
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    
    
}
    
public class CircleApp {
	
	
//	public static <T>  void mySort(List<T> l, Comparator<T> c) {
//		return null;
//	}

	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		code for map
//		mapDemo();
//		setDemo();
		sortDemo();
//		circleDemo();
		List<Integer> iList = new ArrayList<>();
		StringLengthComparator comp = new StringLengthComparator();
//		mySort(iList,comp);
	}
	private static void circleDemo() {
		List<circle> cir = new ArrayList<circle>();
		Random rand = new Random();
		double ra = (double)0.1 ;
		while(ra >= 0.01) {
			int n = rand.nextInt(1000);
			ra = (double)n/1000;
			cir.add(new circle(ra));
		}
		for(circle c:cir)
		{
			System.out.println("Radius:"+c.radius);
			System.out.println(c.area());
		}
		ListIterator<circle> it = cir.listIterator();
		while(it.hasNext())
		{
			circle num = it.next();
			if(num.radius<0.5)
				it.remove();
		}
		System.out.println(" ");
		System.out.println("After removal");
		for(circle c:cir)
		{
			System.out.println("Radius:"+c.radius);
			System.out.println(c.area());
		}
	}
	private static void sortDemo() {
        String[] words = {"this","is","a","test","of","sorting","lists","made","from","array"};
        List<String> wordList = Arrays.asList(words);
        System.out.println("Before sorting:\n"+wordList);
//        Collections.sort(wordList, new StringLengthComparator());
        Collections.sort(wordList, new Comparator<String>() {
        	public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("After sorting:\n"+wordList);
    }
	private static void setDemo() {
        Set<String> words = new LinkedHashSet<String>();
        while(true) {
            String aWord = fromKB("Enter a unique word");
            if(!words.add(aWord)) {
                System.out.println("That's a duplicate!");
            }
            if(words.size() == 10) {
                break;
            }
        }
        System.out.println("Here are the unique words: ");
        for(String aWord : words) {
            System.out.println(aWord);
        }
        
    }
	
	private static void mapDemo() {
		Map<String,String> emp= new HashMap<>();
		emp.put("1","a");
		emp.put("2","b");
		emp.put("3","c");
		emp.put("4","d");
		emp.put("5","e");
		emp.put("6","f");
		while(true) {
			String input = fromKB("Enter emp id:");
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			if(emp.containsKey(input)) {
                System.out.println("Employee exists!");
                System.out.println(emp.get(input));
            }else {
                System.out.println("CAN'T FIND THAT EMPLOYEE!!");
            }
		}
	}
	private static String fromKB(String prompt) {
        System.out.println(prompt);
        s = new Scanner(System.in);
        return s.nextLine();        
    }

}
