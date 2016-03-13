package computerClass;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		this.isNotebook = true;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price =  price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (memory <= this.freeMemory) {
			this.freeMemory = memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}
	
	int comparePrice(Computer c){
		if(this.price > c.price){
			return -1;
		}
		else if(this.price < c.price){
			return 1;
		}
		else{
			return 0;
		}
	}
}
