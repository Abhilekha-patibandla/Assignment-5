package Assignment_5;

class parent{
	String name="Abhi";
}
class child extends parent{
	String name="Lekha";
	public void call()
	{
		System.out.println("Child class:"+name);
		System.out.println("Parent class:"+super.name);
	}
}


public class Task2 {

	public static void main(String[] args) {
		child c=new child();
		c.call();
		
	}

}
