package Assignment_5;

class Employee{
    public void Task() {
    	System.out.println("Task done by employee");
    }
}

class Manager extends Employee{
	public void Task() {
    	System.out.println("Task given by manager");
    }
}

public class Task4 {

	public static void main(String[] args) {
		Manager m= new Manager();
		m.Task();
		
	}

}
