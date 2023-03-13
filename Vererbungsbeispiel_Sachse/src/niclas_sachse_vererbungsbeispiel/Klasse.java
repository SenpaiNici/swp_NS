package niclas_sachse_vererbungsbeispiel;

public abstract class Klasse {
	protected String gebaeude;
	protected int stammRaumNr;
	
	public Klasse(String gebaeude, int stammRaumNr) {
			this.gebaeude = gebaeude;
			this.stammRaumNr = stammRaumNr;

	}

	public String getGebaude() {
		return gebaeude;
	}

	public int getRaumNr() {
		return stammRaumNr;
	}
}