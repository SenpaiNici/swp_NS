package niclas_sachse_vererbungsbeispiel;

public class Main {
	public static void main(String[] args) {
		Schueler franz = new Schueler("St�ckelgeb�ude", 101, "Franz", "Mustermann", 16);
		
		
		System.out.println("Franz ist: " + franz.getAlter() + " Jahre alt");
	}
}
