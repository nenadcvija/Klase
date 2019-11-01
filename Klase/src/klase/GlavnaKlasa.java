package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		/*
		 * Alat tool = new Alat();
		 * 
		 * tool.pozdrav(); tool.pozdrav("Masa"); tool.pozdrav("Medved");
		 * 
		 * String i = "Pera"; String p = "Detlic"; int g = 15;
		 * 
		 * String name = tool.imeIprezime(i, p); System.out.println(name);
		 * 
		 * String brojGodina = tool.godine(g); System.out.println(brojGodina);
		 * 
		 * 
		 * int prviBroj = 5; int drugiBroj = 9; int zbirBrojeva = tool.saberi( prviBroj,
		 * drugiBroj); System.out.println("Zbir brojeva je " + zbirBrojeva);
		 * 
		 * 
		 * double x = Alat.kvadratBroja(7); System.out.println(x);
		 */
		
		
		Drzava drzava = new Drzava();
		
		
		drzava.setImeDrzave("Srbija");
		drzava.setBrojStanovnika(7000000);
		drzava.setPovrsina(100000.98);
		 
		System.out.println("Ime drzave je: " + drzava.getImeDrzave() );
		System.out.println("Broj stanovnika je: " + drzava.getBrojStanovnika());
		System.out.println("Povrsina drzave je: " + drzava.getPovrsina() + " km kvadratnih");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
