package practica1;


public class EstudianteUniversitario extends Estudiante {
	private String ingreso;
	public EstudianteUniversitario(String nombre, String apellido, int legajo, String ingreso) {
		super(nombre, apellido, legajo);
		this.ingreso = ingreso;
	}
	public String getIngreso() {
		return ingreso;
	}
	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

}
