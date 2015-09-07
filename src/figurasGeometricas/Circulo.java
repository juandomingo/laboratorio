package figurasGeometricas;

public class Circulo extends FiguraGeometrica {
	private int radio;
	@Override
	public void dibujar() {
		System.out.println("Se dibuja un rect�ngulo de alto " + this.radio + " y " + this.radio + " de ancho.");

	}


	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getRadio()
	{return this.radio;}



	
	public boolean equals(Circulo c)
	{ if (this.compareTo(c) == 0) return true; else return false;}

}
