
public class DOWFinder {
	
	public static void main(String[] args) {
		int date = 8;
		int month = 7;
		int year = 2019;
		int d = DOW(date,month,year);
		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(week[d]);
			
	}
	public static int DOW(int date,int month, int year)
	{
		int day=0;
		int[] monthtot = {31,61,92,122,153,183,214,245,275,306,336,367};
		day +=(year-1900)*365;
		day += (year-1900)/4;
		//year done
		day += monthtot[month-2];
		//before months added
		day += date;
		
		if(month > 2) {
			if(year/4 == 0)
				day--;
			else
				day-=2;
		}
		day %= 7;
		return day;
	}

}
