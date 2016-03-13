package newPack;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class WarAndPeace {
	
	static AtomicInteger count = new AtomicInteger(0);
	
	static class CommasThread extends Thread {
		private StringBuilder theText;

		public CommasThread(StringBuilder str) {
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

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(new File("E:\\Users\\Gele\\Desktop\\war_peace.txt"));
		StringBuilder sb = new StringBuilder();
	

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();
		long start1 = System.currentTimeMillis();
		
		Thread th = new CommasThread(sb);
		
		th.start();
		th.join();
		System.out.println(count);
		System.out.println("Time with one thread " + (System.currentTimeMillis() - start1));
	}

}
