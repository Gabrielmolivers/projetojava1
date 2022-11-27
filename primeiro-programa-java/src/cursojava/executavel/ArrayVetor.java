package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
	Aluno aluno = new Aluno();
	aluno.setNome("Gabriel");
	aluno.setNomeEscola("JDEV");
	
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Java");
	
	double[] notas = {8.5,6.5,7.5,6.5};
	double[] notaJs = {8.5,6.5,7.5,6.5};
	
	
	disciplina.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("JavaScript");
	disciplina2.setNota(notaJs);
		
	aluno.getDisciplinas().add(disciplina2);
		
	}

}
