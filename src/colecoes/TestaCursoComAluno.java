package colecoes;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando colecoes", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 10));
		javaColecoes.adiciona(new Aula("Trabalhando com listas", 50));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 60));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34678);
		Aluno a2 = new Aluno("Gulherme Silveira", 10745);
		Aluno a3 = new Aluno("Jose Santos", 1127);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		//Set<Aluno>alunos = javaColecoes.getAlunos();
		//Iterator<Aluno> iterador = alunos.iterator();
		//while(iterador.hasNext()) {
		//	Aluno proximo = iterador.next();
		//	System.out.println(proximo);
		//}
		
		
		System.out.println("Todos os alunos matriculados");
		javaColecoes.getAlunos().forEach(a -> {
		System.out.println(a);
		});
		
		
		
		System.out.println("O aluno " + a1 + "esta matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		System.out.println("O aluno " + a3 + "e igual a Jose Santos ?");
		Aluno jose = new Aluno("Jose Santos", 1127);
		
		System.out.println(a3.equals(jose));
		
		// toda vez que implementar um equals implemente um hashcode
		//se der true no equals terá que dar true no hashcode
		
		System.out.println(a3.hashCode() == jose.hashCode());
	}
}
