package practica1;

public class EstudiantePrimario extends Estudiante {
	private boolean repitio;
	private int ausencias;
	public EstudiantePrimario(String nombre, String apellido, int legajo, int ausencias, boolean repitio) {
		super(nombre, apellido, legajo);
		this.ausencias = ausencias;
		this.repitio = repitio;
	}

	public boolean isRepitio() {
		return repitio;
	}
	public void setRepitio(boolean repitio) {
		this.repitio = repitio;
	}
	public int getAusencias() {
		return ausencias;
	}
	public void setAusencias(int ausencias) {
		this.ausencias = ausencias;
	}

}
