package newPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCommas {

	private static final int NUMBER_OF_THREADS = 8;

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, ExecutionException {
		Scanner sc = new Scanner(new File("E:\\Users\\Gele\\Desktop\\war_peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();

		long start = System.currentTimeMillis();

		ExecutorService threadPool = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

		List<Future<Integer>> results = new ArrayList<Future<Integer>>();

		for (int part = 0; part <= NUMBER_OF_THREADS - 1; part++) {
			String partOfText = sb.substring((part * sb.length() / NUMBER_OF_THREADS) + 1,
					(part + 1) * sb.length() / NUMBER_OF_THREADS);

			results.add(threadPool.submit(() -> {
				int count = 0;
				for (int i = 1; i <= 100; i++) {
					for (int j = 0; j < partOfText.length(); j++) {
						if (partOfText.charAt(j) == ',') {
							count++;
						}
					}
				}

				return count;
			}));
		}

		int count = 0;

		for (Future<Integer> num : results) {
			count += num.get();
		}

		System.out.println(count);
		System.out.println("Time with pool " + (System.currentTimeMillis() - start));

		threadPool.shutdown();
	}

}
