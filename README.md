# laboratorio
Repo donde cuelgo las prácticas de laboratorio.


# consultas
1D : c�mo inspecciono el == y las variables an�nimas que gener� para ejecutarles el == ? 

1D : Classpath lo usamos para definir d�nde est�n los packetes que utiliza algo que queramos compilar.

crear jar : jar cmvf MANIFEST.MF Estudiante.jar Estudiante.class TestEstudiante.class

IMPOSIBLE GENERAR UN .JAR QUE FUNCIONE, NO HAY REFERENCIA AL MAIN


2:a Ambos est�n en el mismo package, al ser Alpha una clase package con sus variables protected (es decir, con acceso libre desde clases del mismo package) entonces el acceso es v�lido.

b.S�, porque la clase es p�blica y los m�todos tambi�n.
c. No, porque tanto x como unMetodoA son package, por lo que Beta no puede verlos (son de distintos paquetes)

c.No, dado que son package.

e) Los mensajes al objeto a obtenido por argumento no se puede acceder, dado que son protected, de otra clase y est�n en otro paquete. 
Se puede acceder a la funcionalidad heredada, pero no a la funcionalidad de otro objeto de la superclase. (?
 
3.2 		super(new Frame());  es la solucion -> Se debe llamar al constructor de la super clase expl�citamente

3.2a
Constructores privados : No, porque se debe llamar al constructor de la super clase y el mismo es privado !!


Constructores protegidos : 
En ning�n caso se podr�a tener lo que se plantea sin hacer los import de laboratorio
SubClase est� bien, salvo que haya problemas con la superConstruci�n impl�cita
Otra clase no podr�a generar nuevos SuperClase, ya que ni hereda ni est� en el mismo paquete que SuperClase


practica 2

HashSetAgregados cuando usa addAll utiliza superAddAll el cual utiliza dentro el add de HashSetAgregados.
tanto addAll como add modifican el numero total de agregados, de modo que al agregar la coleccion se suma el numero total de elementos y luego se suma por cada uno en el add.
