package Es02;

public class Sim {
	String numeroDiTelefono;
	int creditoDisponibile = 0;
Chiamate listaChiamate[] = new Chiamate[5];
		
public Sim(String x) {
	this.numeroDiTelefono = x;
}
 public void stampaSim() {
	 System.out.println("il tuo numero di telefono è: " + numeroDiTelefono + " " + "il tuo credito è: " + creditoDisponibile);
	 for (int i = 0; i < listaChiamate.length; i++) {
		System.out.println("Numero chiamato " + listaChiamate[i].numeroChiamato);
		System.out.println("Durata Chiamate " + listaChiamate[i].durataChiamata);
	}
 }
 
 public void addChiamate(String numero, int durata) {
	for (int i = 0; i < listaChiamate.length; i++) {
		listaChiamate[i] = new Chiamate(numero, durata);
			}
 }
	}

