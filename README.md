# laboratorio
Repo donde cuelgo las prÃ¡cticas de laboratorio.


# consultas
1D : cómo inspecciono el == y las variables anónimas que generé para ejecutarles el == ? 

1D : Classpath lo usamos para definir dónde están los packetes que utiliza algo que queramos compilar.

crear jar : jar cmvf MANIFEST.MF Estudiante.jar Estudiante.class TestEstudiante.class

IMPOSIBLE GENERAR UN .JAR QUE FUNCIONE, NO HAY REFERENCIA AL MAIN


2:a Ambos están en el mismo package, al ser Alpha una clase package con sus variables protected (es decir, con acceso libre desde clases del mismo package) entonces el acceso es válido.

b.Sí, porque la clase es pública y los métodos también.
c. No, porque tanto x como unMetodoA son package, por lo que Beta no puede verlos (son de distintos paquetes)

c.No, dado que son package.

e) Los mensajes al objeto a obtenido por argumento no se puede acceder, dado que son protected, de otra clase y están en otro paquete. 
Se puede acceder a la funcionalidad heredada, pero no a la funcionalidad de otro objeto de la superclase. (?
 
3.2 		super(new Frame());  es la solucion -> Se debe llamar al constructor de la super clase explícitamente

3.2a
Constructores privados : No, porque se debe llamar al constructor de la super clase y el mismo es privado !!


Constructores protegidos : 
En ningún caso se podría tener lo que se plantea sin hacer los import de laboratorio
SubClase está bien, salvo que haya problemas con la superConstrución implícita
Otra clase no podría generar nuevos SuperClase, ya que ni hereda ni está en el mismo paquete que SuperClase


practica 2

HashSetAgregados cuando usa addAll utiliza superAddAll el cual utiliza dentro el add de HashSetAgregados.
tanto addAll como add modifican el numero total de agregados, de modo que al agregar la coleccion se suma el numero total de elementos y luego se suma por cada uno en el add.
