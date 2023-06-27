package Es03;

import java.util.ArrayList;

public class Carrello {
Cliente clienteAss;
ArrayList<Articolo> articoli;
int costoTot;

public Carrello(Cliente client) {
	this.clienteAss = client;
	this.articoli = new ArrayList<>();
	this.costoTot = 0;
}


public Cliente clientA() {
	return clienteAss;
}

public ArrayList<Articolo> ottList() {
	return articoli;
}
public int ottTot() {
	return costoTot;
}

public void aggiungiArticolo(Articolo articolo) {
    articoli.add(articolo);
    costoTot += articolo.ottprez();
}
}
