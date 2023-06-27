package Es03;

public class Articolo {
	String codiceArticolo;
	String descrizioneArticolo;
	int prezzo;
	int pezziDisponibili;
	
	public Articolo(String cod, String des, int prez, int disp) {
		this.codiceArticolo = cod;
		this.descrizioneArticolo = des;
		this.prezzo = prez;
		this.pezziDisponibili = disp;
	}
	
	public String ottCod() {
		return codiceArticolo;
	}
	public String ottdes() {
		return descrizioneArticolo;
	}
	public int ottprez() {
		return prezzo;
	}
	public int disp() {
		return pezziDisponibili;
	}
}
