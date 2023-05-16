package DecisionMakingStatement;

public class Nested_If {

	public static void main(String[] args) {
		String address = "Delhi, India";
		if(address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("your city is Meerut");
				
			}else if (address.contains("Noida")) {
				System.out.println("your city is Noida");
				
			}else {
				System.out.println(address.split(",")[1]);
				
			}
		}else {
			System.out.println("you are not living in India");
		}
	}

}
