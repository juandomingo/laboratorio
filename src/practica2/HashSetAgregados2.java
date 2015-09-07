package practica2;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregados2<E>  {


	private HashSet<E> hashSet;
	
		private int cantidadAgregados = 0;
		private int removed = 0;
		public HashSetAgregados2() {
			hashSet =  new HashSet<>();
		}
		public HashSetAgregados2(int initCap, float loadFactor) {
			hashSet = new HashSet<>(initCap, loadFactor);
		}
		 public boolean add(E e) {
		cantidadAgregados++;
		return hashSet.add(e);

		}
	     public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		return hashSet.addAll(c);
		}
		public int getCantidadAgregados() {
		return cantidadAgregados;
		}
		
		public int getCantidadRemovidos() {
			return removed;
			}
		
		public boolean remove(E e)
		{
			removed++;
			return hashSet.remove(e);
			
		}

}
