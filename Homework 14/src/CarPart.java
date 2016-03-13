
public abstract class CarPart implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " pochvam da pravq " + getPartName());
		
		try {
			Thread.sleep(getTimeToProduce());
			System.out.println(Thread.currentThread().getName() + " napravih " + getPartName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public abstract int getTimeToProduce();

	public abstract  String getPartName(); 

}