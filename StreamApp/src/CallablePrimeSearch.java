import java.util.concurrent.Callable;

public class CallablePrimeSearch implements Callable<Integer>{
	long start,end;
	volatile boolean resultReady;
	int count;
	public CallablePrimeSearch(long start,long end) {
		this.end = end;
		this.start = start;
	}
	@Override
	public Integer call() {
		for(long i=start;i<=end;i++) {
			if(isPrime(i))
			{
				count++;
			}
		}
		resultReady = true;
		return count;
	}
	
	private boolean isPrime(long num) {
		if(num <= 2) {
            return true;
        }
        for(long i=2;i<num;i++) {
            if((num % i) == 0) {
                return false;
            }
        }
        return true;
	}

}
