package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testes {
public static void main(String[] args) {
	Aula a1 = new Aula("Colecoes lista", 21);
	Aula a2 = new Aula("listas e colecoes", 15);
	Aula a3 = new Aula("Arrays", 10);
	Aula a4 = new Aula("Ux", 5);
	
	ArrayList<Aula> materia = new ArrayList<>();
	materia.add(a1);
	materia.add(a2);
	materia.add(a3);
	materia.add(a4);
	
	
	System.out.println(materia);
	
	Collections.sort(materia);
	System.out.println(materia);
	
	materia.sort((Comparator.comparing(Aula::getTempo)));
	System.out.println(materia);
	
}
}
