package practica2;


class InstrumentoDeCuerda implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	public String queEs() {
		return "Instrumento de Cuerda";
	}
	public void afinar(){}
}
//presenta los mismos problemas que InstrumentoDeViento