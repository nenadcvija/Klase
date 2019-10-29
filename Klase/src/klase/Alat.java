package klase;

public class Alat {
	
	public void pozdrav() {
		
		System.out.println("Helloooooooooo");
	}
	
	
	public void pozdrav(String ime) {
		
		System.out.println("Hello od " + ime);
	}
	
	
	public String imeIprezime(String ime, String prezime) {
		
		return "Moje ime je " + ime + " a prezime " + prezime;
	}
	
	
	public String godine(int brojGodina) {
		
		String god = "Ja imam " + brojGodina + " godina.";
		
		return god;
	}
	
	
	
	public int saberi(int x , int y) {
		
		int zbir = x + y;
		
		return zbir;
	}
	
	
	
	public static double kvadratBroja(double x) {
		
		double kvadrat = x * x;
		
		return kvadrat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
