import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	private static final int NUMBER_OF_TYRES = 4;
	private static final int NUMBER_OF_ASSEMBLY_LINES = 20;
	private static final int NUMBER_OF_SEATS = 5;

	public static void main(String[] args) throws InterruptedException, ExecutionException, FileNotFoundException {
		ExecutorService carThreadPool = Executors.newFixedThreadPool(NUMBER_OF_ASSEMBLY_LINES);
		
		long start = System.currentTimeMillis();
		java.util.List<Future> parts = new ArrayList<Future>();
		
		parts.add(carThreadPool.submit(new Engine()));
		parts.add(carThreadPool.submit(new Frame()));
		
		for (int tyre = 1; tyre <= NUMBER_OF_SEATS; tyre++) {
			parts.add(carThreadPool.submit(new Seat()));
		}
		
		for (int tyre = 1; tyre <= NUMBER_OF_TYRES; tyre++) {
			parts.add(carThreadPool.submit(new Tire()));
		}
		
		carThreadPool.shutdown();
		
		for (Future part : parts) {
			part.get();
		}
		
		// everything done
		
		System.out.println(System.currentTimeMillis() - start);
	}

}
