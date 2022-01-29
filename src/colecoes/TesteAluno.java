package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAluno {
	public static void main(String[] args) {
		
		Set<String>aluno = new HashSet<>();
		aluno.add("klebeson santos");
		aluno.add("jose do egito");
		aluno.add("Abraão judeu");
		aluno.add("Jesus Da Galileia");
		aluno.add("Moises");
		aluno.add("Israel");
		aluno.add("Israel");
		aluno.remove("klebeson santos");
		
		for (String alunos : aluno) {
			System.out.println(alunos);
		}
		
		//tamanho da lista
		System.out.println(aluno.size());
		
		//verifica se contaem esse nome na lista
		boolean klebersonEstaLista = aluno.contains("Moises");
		System.out.println(klebersonEstaLista);
		
		//passando o Set para uma lista e depois fazendo um sort da lista
		List<String> alunosEmSet = new ArrayList<>(aluno);
		Collections.sort(alunosEmSet);
		System.out.println(alunosEmSet);
		
	}
}
