package figurasGeometricas;

public abstract class FiguraGeometrica {
	private String color;
	public FiguraGeometrica(){};
	public FiguraGeometrica(String color){this.color = color;}
	public abstract void dibujar();
	
	public abstract int getArea();
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
}
