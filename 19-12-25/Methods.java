import java.util.Scanner;

class Customer{
	private String name;
	byte age;
	
	void setData(String n,byte a) {
		this.name=n;
		this.age=a;
	}
	
	//method declaration
	public void display() {
		System.out.println(name);
	}
}


public class Methods {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		Scanner in = new Scanner(System.in);
		String name=in.nextLine();
		byte age = in.nextByte();
		cus.setData(name,age);
		//method call
		cus.display();
		
	}

}
