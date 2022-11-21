package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		System.out.println("Meu primeiro programa em Java");

		int maiorIdade = 18;

		int idosoIdade = 60;

		int jovemIdade = 16;

		int criancaIdade = 7;

		String cpf = "102.823.969-69";

		System.out.println("idade de um adulto é = " + maiorIdade);
		System.out.println("de um velho é = " + idosoIdade);
		System.out.println("meu CPF é " + cpf);

		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 37;
		double nota4 = 85;

		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Media das notas = " + mediaFinal);

		char pessoaFisica = 'F';

		char pessoaJuridica = 'J';

		if (pessoaFisica != 'F') {
			System.out.println("Pessoa Física");
		} else {
			System.out.println("Pessoa Jurídica");
		}

		String textoQualquer = "Só um teste";

		if (mediaFinal >= 50) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}

		String resultado = mediaFinal >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";

		System.out.println(resultado);

		int valor1 = 0;

		while (valor1 <= 10) {
			System.out.println("O valor é = " + valor1);
			valor1++;

		}

		for (int valor2 = 10; valor2 >= 0; valor2--) {
			System.out.println("O numero agora é " + valor2);
		}

		for (int valor3 = 10; valor3 >= 0; valor3--) {
			if (valor3 == 7) {
				System.out.println("Encontrei o valor ");
				System.out.println("Vou parar agora");
				break;
			}
		}

		for (int valor4 = 10; valor4 >= 0; valor4--) {
			if (valor4 == 5 || valor4 == 3 || valor4 == 1) {
				System.out.println("Encontrei o valor " + valor4);
				System.out.println("Vou continuar");
				continue;
			}

			System.out.println("Processando dados...");
		}

		String itens = JOptionPane.showInputDialog("informe a quantidade de itens que você possui");
		System.out.println(itens);

		String nomeCompleto = JOptionPane.showInputDialog("informe seu nome completo");
		System.out.println(nomeCompleto);

		String pessoas = JOptionPane.showInputDialog("informe quantas pessoas vão dividir os itens");
		System.out.println(pessoas);

		double itensNumero = Double.parseDouble(itens);
		double pessoasNumero = Double.parseDouble(pessoas);

		int dividindo = (int) (itensNumero / pessoasNumero);

		double restante = itensNumero % pessoasNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Dividindo deu para cada " + dividindo);
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + restante);
		}

		String notaBimestre1 = JOptionPane.showInputDialog("Informe a nota do 1º Bimestre");
		String notaBimestre2 = JOptionPane.showInputDialog("Informe a nota do 2º Bimestre");
		String notaBimestre3 = JOptionPane.showInputDialog("Informe a nota do 3º Bimestre");
		String notaBimestre4 = JOptionPane.showInputDialog("Informe a nota do 4º Bimestre");

		double converterNota1 = Double.parseDouble(notaBimestre1);
		double converterNota2 = Double.parseDouble(notaBimestre2);
		double converterNota3 = Double.parseDouble(notaBimestre3);
		double converterNota4 = Double.parseDouble(notaBimestre4);

		double mediaBimestre = (converterNota1 + converterNota2 + converterNota3 + converterNota4) / 4;
		if (mediaBimestre >= 50) {
			if (mediaBimestre >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado");
			} else {
				JOptionPane.showMessageDialog(null, "Aluno de Recuperação");
			}
		}
		if (mediaBimestre <= 50) {
			JOptionPane.showMessageDialog(null, "Aluno reprovado");
		}
		int confirmacaoNota = JOptionPane.showConfirmDialog(null, "Deseja ver a média?");
		if (confirmacaoNota == 0) {
			JOptionPane.showMessageDialog(null, "A média do Aluno é = " + mediaBimestre);
		}

		String quantidadeHora = JOptionPane.showInputDialog("Insira a quantidade de horas");
		double converterHora = Double.parseDouble(quantidadeHora);
		int horaSegundos = (int) (converterHora * 3600);
		int confirmacaoHora = JOptionPane.showConfirmDialog(null, "Deseja converter para segundos?");
		if (confirmacaoHora == 0) {
			JOptionPane.showMessageDialog(null, quantidadeHora + " horas da " + horaSegundos + " segundos");
		}
		
		
		
	}

}
