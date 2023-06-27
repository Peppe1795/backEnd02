package Es01;

public class Rettangolo {
int altezza;
int larghezza;

public Rettangolo(int h, int l) {
	this.altezza = h;
	this.larghezza = l;
}

public int perimetro() {
return (this.altezza + this.larghezza)* 2;
}

public int area() {
	return this.larghezza * this.altezza;
}

}
