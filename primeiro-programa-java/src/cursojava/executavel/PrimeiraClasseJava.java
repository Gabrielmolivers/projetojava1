package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		System.out.println("Meu primeiro programa em Java");

		int maiorIdade = 18;

		int idosoIdade = 60;

		int jovemIdade = 16;

		int criancaIdade = 7;

		String cpf = "102.823.969-69";

		System.out.println("idade de um adulto � = " + maiorIdade);
		System.out.println("de um velho � = " + idosoIdade);
		System.out.println("meu CPF � " + cpf);

		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 37;
		double nota4 = 85;

		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Media das notas = " + mediaFinal);

		char pessoaFisica = 'F';

		char pessoaJuridica = 'J';

		if (pessoaFisica != 'F') {
			System.out.println("Pessoa F�sica");
		} else {
			System.out.println("Pessoa Jur�dica");
		}

		String textoQualquer = "S� um teste";

		if (mediaFinal >= 50) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}
		
		String resultado = mediaFinal >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		System.out.println(resultado);

		int valor1 = 0;
		
		while (valor1 <= 10) {
			System.out.println("O valor � = " + valor1);
				valor1++;
			
		}
		
		for (int valor2 = 10; valor2 >= 0; valor2 --) {
			System.out.println("O numero agora � " + valor2);
		}
		
	}

}
