package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando colecoes", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 10));
		javaColecoes.adiciona(new Aula("Trabalhando com listas", 50));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 60));
		
		List<Aula>aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//Aqui em baixo o titulo das aulas foi colocado em ordem alfabetica
		//o codigo para isso está aqui em baixo
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempo());
		
	
	}

}
