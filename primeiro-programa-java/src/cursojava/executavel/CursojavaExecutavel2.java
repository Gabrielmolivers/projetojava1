package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class CursojavaExecutavel2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do Aluno " + qtd + ":");
			String idade = JOptionPane.showInputDialog("Idade:");
			String registroGeral = JOptionPane.showInputDialog("RG:");
			String numeroCpf = JOptionPane.showInputDialog("CPF:");
			String nomeMae = JOptionPane.showInputDialog("Nome da mãe:");
			String nomePai = JOptionPane.showInputDialog("Nome do pai:");
			String dataMatricula = JOptionPane.showInputDialog("Data da matrícula:");
			String serieMatriculado = JOptionPane.showInputDialog("Classe matriculado:");
			String nomeEscola = JOptionPane.showInputDialog("Escola:");

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

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + ":");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + ":");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno1);

		}

		for (Aluno aluno : alunos) {

			System.out.println(aluno);
			System.out.println("Média: " + aluno.getMediaNota());
			System.out.println("O aluno esta " + aluno.getAlunoAprovado());

		}

	}

}
