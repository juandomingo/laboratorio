package practica1;

public class PoolConexiones {
	public static boolean instanciado = false;
	public static PoolConexiones instancia;
	private PoolConexiones(){}
	
	public PoolConexiones getInstance(){
		if (instanciado)
			return instancia;
		else
		{
			instanciado = true;
			return new PoolConexiones();
		}
	}
}
