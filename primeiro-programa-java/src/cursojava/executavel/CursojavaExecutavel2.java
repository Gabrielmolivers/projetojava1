package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class CursojavaExecutavel2 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome do Aluno:");
		String idade = JOptionPane.showInputDialog("Idade:");
		String registroGeral = JOptionPane.showInputDialog("RG:");
		String numeroCpf = JOptionPane.showInputDialog("CPF:");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe:");
		String nomePai = JOptionPane.showInputDialog("Nome do pai:");
		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula:");
		String serieMatriculado = JOptionPane.showInputDialog("Classe matriculado:");
		String nomeEscola = JOptionPane.showInputDialog("Escola:");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1:");
		String nota1 = JOptionPane.showInputDialog("Nota 1º Bimestre:");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2:");
		String nota2 = JOptionPane.showInputDialog("Nota 2º Bimestre:");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3:");
		String nota3 = JOptionPane.showInputDialog("Nota 3º Bimestre:");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4:");
		String nota4 = JOptionPane.showInputDialog("Nota 4º Bimestre:");
				
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento("18/09/1998");
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.getDisciplina().setNota1(Integer.valueOf(nota1));
		aluno1.getDisciplina().setNota2(Integer.valueOf(nota2));
		aluno1.getDisciplina().setNota3(Integer.valueOf(nota3));
		aluno1.getDisciplina().setNota4(Integer.valueOf(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
				
		System.out.println("Aluno: " + aluno1.toString());
		System.out.println("Média: " + aluno1.getMediaNota());
		System.out.println("O aluno esta " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
		
	}

}
