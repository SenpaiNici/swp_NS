package niclas_sachse_vererbungsbeispiel;

public class Schueler extends Klasse {
	private String vorname;
	private String nachname;
	private int alter;
	
	
	public Schueler(String gebaeude, int stammRaumNr, String vorname, String nachname, int alter) {
		super(gebaeude, stammRaumNr);
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	

}
