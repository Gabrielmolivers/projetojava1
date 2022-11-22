package cursojava.executavel;

import cursojava.classes.Aluno;

public class CursojavaExecutavel2 {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Marcelo");
		aluno1.setIdade(31);
		aluno1.setDataNascimento("18/09/1998");
		aluno1.setRegistroGeral("123.123.13.1325");
		aluno1.setNumeroCpf("1232113624654");
		aluno1.setNomeMae("Claudia");
		aluno1.setNomePai("William");
		aluno1.setDataMatricula("10/10/2022");
		aluno1.setSerieMatriculado("8");
		aluno1.setNomeEscola("Escola Rio Branco");
		aluno1.setNota1(80);
		aluno1.setNota2(70);
		aluno1.setNota3(58);
		aluno1.setNota4(90);
		
				
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Media da nota é = " + aluno1.getMediaNota());
		System.out.println("O aluno está aprovado? " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Gabriel");
		
		Aluno aluno5 = new Aluno("Nathaly", 25);
		
	}

}
