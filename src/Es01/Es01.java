package Es01;

public class Es01 {

	public static void main(String[] args) {
		Rettangolo figura1 = new Rettangolo(10, 25);
		Rettangolo figura2 = new Rettangolo(12, 6);
		stampaRettangolo(figura1);
		stampaRettangolo(figura2);
		stampaDueRettangoli(figura1, figura2);
	}

	public static void stampaRettangolo(Rettangolo primo) {
		int perimetro = primo.perimetro();
		int area = primo.area();
		System.out.println("il perimetro è: " + perimetro + " l'area è: " + area);
	}

	public static void stampaDueRettangoli(Rettangolo primo, Rettangolo secondo) {
		int perimetro = primo.perimetro();
		int area = primo.area();
		int perimetro2 = secondo.perimetro();
		int area2 = secondo.area();
		int sommaPerimetro = perimetro + perimetro2;
		int sommaArea = area + area2;
		System.out.println(
				"il perimetro del primo rettangolo è: " + perimetro + " l'area del primo rettangolo è: " + area);
		System.out.println(
				"il perimetro del secondo rettangolo è: " + perimetro2 + " l'area del secondo rettangolo è: " + area2);
		System.out.println("la somma dei perimetri è: " + sommaPerimetro);
		System.out.println("la somma delle aree è: " + sommaArea);
	}

}
