package practica2;

public class InstrumentoDeViento implements InstrumentoMusical {
	
	//por extenderse de una interface, hacer sonar es publico , luego hacerSonar sobreescrito debe ser publico tambien
	public void hacerSonar(){
		System.out.println("Sonar Vientos");
	}
	public String queEs() {
		return "Instrumento de Viento";
	}
	//debemos implementar todos los metodos que propone InstrumentoMusical o convertir la clase en una clase abstracta.
	public void afinar(){}
}
