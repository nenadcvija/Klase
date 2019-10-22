package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		Person osoba = new Person();
		
			osoba.ime = "Jovan";	
			osoba.prezime = "Jovanovic";

		System.out.println("Ime osobe je " + osoba.ime + " " + osoba.prezime);
		
		Car car = new Car();
		
			car.marka = "fiat";
		
		osoba.automobil = car;
		
		System.out.println("Ova osoba vozi automobil marke " + osoba.automobil.marka);
		
		
		
		
		
		
		
		
		
		
		

	}

}
