package Es03;

public class Es03 {

	public static void main(String[] args) {
Articolo articolo1 = new Articolo("ab445545", "Tosa erba", 235, 15);
Articolo articolo2 = new Articolo("ab523863", "TV 4K", 500, 155);
Articolo articolo3 = new Articolo("ab832238", "Smatphone", 450, 800);

Cliente cliente = new Cliente("dc6545456", "Antonio Fortunato", "antony123@gmail.com", "27/02/2020");

Carrello carrello = new Carrello(cliente);
carrello.aggiungiArticolo(articolo1);
carrello.aggiungiArticolo(articolo2);
carrello.aggiungiArticolo(articolo3);

System.out.println("Cliente: " + cliente.ottnom());
System.out.println("Email: " + cliente.ottemail());
System.out.println("Data iscrizione: " + cliente.data());

System.out.println("Articoli nel carrello:");
for (Articolo articolo : carrello.ottList()) {
    System.out.println("Codice: " + articolo.ottCod());
    System.out.println("Descrizione: " + articolo.ottdes());
    System.out.println("Prezzo: " + articolo.ottprez());
    System.out.println("Disponibili: " + articolo.disp());
    System.out.println();
}

System.out.println("Totale costo articoli: " + carrello.ottTot());

	}

}
