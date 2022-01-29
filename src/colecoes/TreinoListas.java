package colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TreinoListas {

	public static void main(String[] args) {
		
		  String aula1 = "Conhecendo as listas";
	        String aula2 = "Modelando as classes";
	        String aula3 = "Trabalhando com collections";
	        String aula4 = "Alfabeto";
	        String aula5 = "Betateste";

	        ArrayList<String> aulas = new ArrayList<>();
	        aulas.add(aula1);
	        aulas.add(aula2);
	        aulas.add(aula3);
	        aulas.add(aula4);
	        aulas.add(aula5);

	        System.out.println("Aula : " + aulas.get(0));
	        System.out.println("Remover primeiro elemento : " + aulas.remove(0));

	        for (String aula : aulas) {
	            System.out.println("Elemento : " + aula);
	        }

	        System.out.println("Ordenar a coleção String");
	        Collections.sort(aulas);

	        System.out.println("Lista ordenada " + aulas);

	}

}
