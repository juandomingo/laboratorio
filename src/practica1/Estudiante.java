package practica1;

public class Estudiante {
	 String nombre;
	String apellido;
	int legajo;
	
	
	public Estudiante(String nombre, String apellido, int legajo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;		
	}
	
	public String toString()
	{
		StringBuffer strBuff = new StringBuffer(this.nombre);
		strBuff.append(" ");
		strBuff.append(this.apellido);
		strBuff.append(" ");
		return strBuff.append(this.legajo).toString();
	}
	
	
}
