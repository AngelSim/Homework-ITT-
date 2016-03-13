package voina.mir;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CountZapetaiki {

	static AtomicInteger count = new AtomicInteger(0);

	static class ZapetaikiThread extends Thread {
		private String textToAnalyse;

		public ZapetaikiThread(String textToAnalyse) {
			this.textToAnalyse = textToAnalyse;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 100; i++) {
				for (int index = 0; index < textToAnalyse.length(); index++) {
					if (textToAnalyse.charAt(index) == ',') {
						count.incrementAndGet();
					}
				}
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(new File("war_peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();
		long start1 = System.currentTimeMillis();
		int x = 0;
		for (int i = 1; i <= 100; i++) {
			for (int index = 0; index < sb.length(); index++) {
				if (sb.charAt(index) == ',') {
					x++;
				}
			}
		}

		System.out.println(x);
		System.out.println("Time " + (System.currentTimeMillis() - start1));
	
		long start = System.currentTimeMillis();

		java.util.List<Thread> myWorkers = new ArrayList<Thread>();
		
		for (int part = 0; part <= 4; part++) {
			Thread t = new ZapetaikiThread(sb.substring((part * sb.length()/5)+1, 
					(part+1) * sb.length()/5));
			t.start();
			myWorkers.add(t);
		}
		
		
		for (Thread t : myWorkers) {
			t.join();
		}
		
		System.out.println(count);
		System.out.println("Time " + (System.currentTimeMillis() - start));
	}
}
