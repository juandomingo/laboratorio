package practica1;

public class EstudianteSecundario extends Estudiante {
	private double promedioGeneral;
	private int materiasAdeudadas;
	public EstudianteSecundario(String nombre, String apellido, int legajo, int materiasAdeudadas, double promedioGeneral) {
		super(nombre, apellido, legajo);
 		this.promedioGeneral = promedioGeneral;
		this.materiasAdeudadas = materiasAdeudadas;
	}
	public double getPromedioGeneral() {
		return promedioGeneral;
	}
	public void setPromedioGeneral(double promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}
	public int getMateriasAdeudadas() {
		return materiasAdeudadas;
	}
	public void setMateriasAdeudadas(int materiasAdeudadas) {
		this.materiasAdeudadas = materiasAdeudadas;
	}

}
