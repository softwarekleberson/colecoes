package colecoes;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class QualColecaoUsar {
public static void main(String[] args) {
	
	//Caso n�o saiba qual cole��o usar utilize uma colection
	
	Collection<Aluno> alunos = new HashSet<>();
	alunos.add(null);
	alunos.size();
	
	//esse aqui n�o, get nao esta classe Collection
	//alunos.get(50);
	
	}
}
