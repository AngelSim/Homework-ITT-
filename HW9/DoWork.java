
public class DoWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Employee ivan = new Employee("Ivan Petrov");
		Employee petar = new Employee("Petar Ivanov");
		Employee stela = new Employee("Stela Rezova");
		Employee vera = new Employee("Vera Ilieva");

		//Employee[] employees = new Employee[]{ivan, petar, stela, vera};
		AllWork allwork = new AllWork();
		int day = 1;
		Task file = new Task("Filing documents", 12);
		allwork.addTask(file);
		Task phone = new Task ("Talk to clients", 4);
		allwork.addTask(phone);
		Task report = new Task("Make reports", 18);
		allwork.addTask(report);
		Task present = new Task("Presentation", 16);
		allwork.addTask(present);
		Task meeting = new Task("Meeting", 2);
		allwork.addTask(meeting);
		Task email = new Task("Reply to e-mails", 3);
		allwork.addTask(email);
		Task entry = new Task ("Database entries", 10);
		allwork.addTask(entry);
		Task update = new Task("Database update entries", 5);
		allwork.addTask(update);
		Task conference = new Task ("Conference call", 2);
		allwork.addTask(conference);
		Task audit = new Task ("Audit records", 31);
		allwork.addTask(audit);
		
//		for (int index = 0; index < allwork.getLength(); index++) {
//			System.out.println(allwork.getNextTask().getName());
//		}
		
		
			
			allwork.setCurrentUnassignedTask(0);
			Employee.setAllwork(allwork);
			//ivan.setCurrentTask(allwork.getNextTask());
			
			
			//ivan.setCurrentTask(allwork.getNextTask());
			while (!allwork.isAllWorkDone()) {
				System.out.println("DAY"+day+":");
				ivan.work();
				petar.work();
				//System.out.println(petar.getCurrentTask().getName());
				stela.work();
				//System.out.println(stela.getCurrentTask().getName());
				vera.work();
				day++;
				Thread.sleep(1000);
				for (Task task : allwork.getTasks()) {
					System.out.print(task.getWorkingHours()+" ");
				}
				System.out.println();
			}
			
		
		
		}
		
	}


