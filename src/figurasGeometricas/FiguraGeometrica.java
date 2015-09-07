package figurasGeometricas;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
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
	public boolean equals(FiguraGeometrica fg)
	{if (this.getArea() == fg.getArea()) return true; else return false;}
	
	public int compareTo(FiguraGeometrica o) {
		// TODO Auto-generated method stub
		if (this.getArea() == o.getArea() ) return 0;
		else if (this.getArea() > o.getArea()) return 1;
			else return -1;
	}
	
	public int hashCode(){return this.getArea();}
}
