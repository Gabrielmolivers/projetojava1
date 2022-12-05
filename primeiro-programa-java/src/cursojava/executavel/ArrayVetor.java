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
	
	Aluno[] arrayAlunos = new Aluno[1];
	arrayAlunos[0] = aluno;
	
	for (int pos = 0; pos < arrayAlunos.length; pos ++) {
		System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
		
		for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Disciplina: " + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A nota número: " + (posnota + 1) + " é igual =" + d.getNota()[posnota]);
			}
			
		}
		
	}
	
		
	}

}
