package practica1;
import java.awt.Dialog;
import java.awt.Frame;
public class Dialoguito extends Dialog
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Dialoguito() {
		super(new Frame()); 
		System.out.println("Dialoguito");
	}
}