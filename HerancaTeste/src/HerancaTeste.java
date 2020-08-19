
public class HerancaTeste {
	
	public static void main (String[]args) {
		
		ClasseFilha filha = new ClasseFilha("Edu", "Cabral", 45, "Engineer");
		
		System.out.printf("%s %s\n","First name is: ", filha.getFirstName());
		System.out.printf("%s %s\n", "Last name is: ", filha.getLastName());
		System.out.printf("%s %d %s\n","He is ", filha.getAge(), " years old");
		System.out.printf("%s %s\n", "Profession: ", filha.getProf());
		
		
	}//fim main

}
