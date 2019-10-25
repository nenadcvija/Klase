package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		Person p = new Person();
		Person p1 = new Person("Marko","Markovic",1987);
		
		String ime = "Zoran";
		String prezime = "Zoranic";
		
		p.pozdravSvete();	
		p.pozdrav(p1.ime,p1.prezime);
		
		Car c = new Car("crvena", "ferari" , "F50", 200000,5000,true);
		
		
		
		
		
		
		
		
		
		

	}

}
