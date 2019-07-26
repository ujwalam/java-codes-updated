import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeSearchApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RunnablePrimeSearch w1 = new RunnablePrimeSearch(1,10000);
		RunnablePrimeSearch w2 = new RunnablePrimeSearch(1000,25000);
//		RunnablePrimeSearch w2 = new RunnablePrimeSearch();
//		Thread t1 = new Thread(w1);
//		Thread t2 = new Thread(w2);
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println("Primes bw 1 and 10000 are "+w1.count);
//		System.out.println("Primes bw 1 and 10000 are "+w2.count);
		ExecutorService pool = Executors.newFixedThreadPool(4);
//		pool.execute(w1);
//		pool.execute(w2);
//		
//		while(!w1.resultReady && !w2.resultReady) {
//			Thread.sleep(200);
//		}
//		System.out.println("Primes bw 1 and 10000 are "+w1.count);
//		System.out.println("Primes bw 1000 and 25000 are "+w2.count);
//		pool.shutdown();
		
		CallablePrimeSearch c1 = new CallablePrimeSearch(1,10000);
		CallablePrimeSearch c2 = new CallablePrimeSearch(1000,25000);
		
		Future<Integer> r1 = pool.submit(c1);
		Future<Integer> r2 = pool.submit(c2);
		
		System.out.println(r1.get());
		System.out.println(r2.get());
		pool.shutdown();
		
		
	}

}
