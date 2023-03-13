package niclas_sachse_vererbungsbeispiel;

public class Lehrer extends Klasse{
		private String vorname;
		private String nachname;
		private int alter;
		private int lehrJahre;
		private float gehalt;
		
		
		public Lehrer(String gebaeude, int stammRaumNr, String vorname, String nachname, int alter, int lehrJahre, float gehalt) {
			super(gebaeude, stammRaumNr);
			this.vorname = vorname;
			this.nachname = nachname;
			this.alter = alter;
			this.lehrJahre = lehrJahre;
			this.gehalt = gehalt;
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

		public int getLehrJahre() {
			return lehrJahre;
		}

		public void setLehrJahre(int lehrJahre) {
			this.lehrJahre = lehrJahre;
		}

		public float getGehalt() {
			return gehalt;
		}

		public void setGehalt(float gehalt) {
			this.gehalt = gehalt;
		}
	}
