package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemploArrays {
	public static void main(String[] args) {
		// Declaración
		int[] miArray;
		int segundoArray[];  // Otra forma de declararlos, con corchetes detras del nombre.
		

		// Inicialización
		miArray = new int[100]; // Reserva memoria para guardar 100 enteros
		
		// Guardo los 100 primeros enteros positivos elevado a dos  en el array
		for(int i=0; i < miArray.length; i++) {
			miArray[i] = i*i;
		}
		
		// Imprimo por patalla el contenido del array
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
		
		// Usando el for para objetos iteradores
		for(int elemento: miArray) {
			System.out.println(elemento);
		}
		
		// Inicialización dando explicitamente los elementos.
		String [] otroArray = {"hola","caracola","como","estas"};
		int [] arrayEnteros = {1,23,67,6,12};
		
		// Consultar clase Arrays del API de java pues tiene metodos utiles para 
		// hacer cosas con arrays
		
		// Ejemplo metodo sort par ordenar
		Arrays.sort(arrayEnteros);
		
		for(int e: arrayEnteros)
			System.out.println("**arrayEnteros: " + e);
		
		// Ejemplo copiar un array en otro 
		
		miArray = Arrays.copyOf(arrayEnteros, miArray.length);
		for(int e: miArray)
			System.out.println("miArray: " + e);
		
		//***Uso de objeto ArrayList del API de Java
		
		// No hace falta que le indique tamaño, él solo se redimensiona
		ArrayList<Integer> miArrayList= new ArrayList<>();
		
		// O si sabemos el tamaño se le puede dar. Hay otro constructor para ello.
		// Este lo creo inicialmente con tamaño 50, pero si almaceno más él 
		// se resimiensiona automáticamente.
		ArrayList<String> otroArrayList= new ArrayList<>(50);
		
		// Metemos elementos en el array.
		for(int elem: miArray) {
			miArrayList.add(elem);  //Hace coversion inplicita (Boxin) de int a Int
		}
		
		// Mostramos contenido por pantalla
		for(int i = 0; i < miArrayList.size(); i++) {
			System.out.println("ArrayList[" + i +"]= " + miArrayList.get(i)); // Aqui hay otra conversión de Interger a String
			
			// No olvidar que lo que hay guardado son objetos. Por ejemplo puedeo
			// preguntar por el nombre de la clase a la que pertenece el 3er objeto Integer
			// guardado en el arrayList
			System.out.println(miArrayList.get(2).getClass().getName());
		}
		
		// Con los objetos Collection se puede usar el for reducido
		for (int elem: miArrayList) {
			//System.out.println(elem);
		}

	}

}
