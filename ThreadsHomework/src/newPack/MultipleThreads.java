
package newPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MultipleThreads {

	static AtomicInteger count = new AtomicInteger(0);

	static class CommasThread extends Thread {
		private String theText;

		public CommasThread(String str) {
			this.theText = str;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 100; i++) {
				for (int j = 0; j < theText.length(); j++) {
					if (theText.charAt(j) == ',') {
						count.incrementAndGet();
					}
				}
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(new File("E:\\Users\\Gele\\Desktop\\war_peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();
		long start1 = System.currentTimeMillis();
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(j) == ',') {
					num++;
				}
			}
		}

		System.out.println(num);
		System.out.println("Time with no threads" + (System.currentTimeMillis() - start1));

		long start = System.currentTimeMillis();

		java.util.List<Thread> allThreads = new ArrayList<Thread>();

		for (int part = 0; part <= 4; part++) {
			Thread th = new CommasThread(sb.substring((part * sb.length() / 5) + 1, (part + 1) * sb.length() / 5));
			th.start();
			allThreads.add(th);
		}

		for (Thread th : allThreads) {
			th.join();
		}

		System.out.println(count);
		System.out.println("Time with muilti threads " + (System.currentTimeMillis() - start));
	}
}
