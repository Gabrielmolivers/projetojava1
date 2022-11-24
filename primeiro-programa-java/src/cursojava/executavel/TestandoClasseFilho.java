package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClasseFilho {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel Medeiros");
		aluno.setNomeEscola("JDEV");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("123123132");
		diretor.setNome("Alex");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Top");
		secretario.setIdade(35);
		
		
		
		
	}

}
