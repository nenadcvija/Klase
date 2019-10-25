package klase;

public class Person {
	
	public String ime;
	public String prezime;
	public int godiste;
	public static int  kilaza;
	public static final int brojSrca = 1;	
	public Car automobil;
	
	// prazan konstruktor
	public Person() {
		
	}
	
	public Person(String i, String p, int g) {
		
		this.ime = i;
		this.prezime = p;
		this.godiste = g;
	}
	
	
	
	
	public void pozdravSvete() {
		
		System.out.println("Hello World");
		
	}
	
	public void pozdrav(String imePozdravljaca, String prezimePozdravljaca) {
		
		System.out.println("Pozdrav od " 
										+ imePozdravljaca 
										+ " " 
										+ prezimePozdravljaca);
	}
	
	
	
}
