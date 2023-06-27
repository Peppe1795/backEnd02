package Es03;

public class Cliente {
	String codiceCliente;
	String nomeCognome;
	String email;
	String data;
	
	public Cliente (String cod, String nom, String ema, String dat) {
		this.codiceCliente = cod;
		this.nomeCognome = nom;
		this.email = ema;
		this.data = dat;
	}
	
	public String ottCodClient() {
		return codiceCliente;
	}
	
	public String ottnom() {
		return nomeCognome;
	}
	public String ottemail() {
		return email;
	}
	public String data() {
		return data;
	}
}
