package figurasGeometricas;

public class Rectangulo extends FiguraGeometrica {
	private int alto;
	private int ancho;
	@Override
	public void dibujar() {
		System.out.println("Se dibuja un rectángulo de alto " + this.alto + " y " + this.ancho + " de ancho.");
	}
	public Rectangulo(){}
	
	public Rectangulo(int alto, int ancho){this.alto=alto;this.ancho=ancho;};
	@Override
	public int getArea() {

		return ancho*alto;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

}
