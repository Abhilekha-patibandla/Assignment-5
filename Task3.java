package Assignment_5;

class Animals{
	public void sound() {
		System.out.println("Hello");
	}
}
class Dogs extends Animals{
	public void sound() {
		System.out.println("bow-bow");
	}
}
class cat extends Animals{
	public void sound() {
		System.out.println("meow");
	}
}

public class Task3 {

	public static void main(String[] args) {
		Dogs d=new Dogs();
		cat c=new cat();
		d.sound();
		c.sound();

	}

}
