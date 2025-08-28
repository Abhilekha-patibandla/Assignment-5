package Assignment_5;
class Animal{
	public void  sound() {
		System.out.println("bow-bow");
	}
}
class Dog extends Animal{
	
}
public class Task1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		
	}

}
