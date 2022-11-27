package cursojava.classes;

public class Disciplina {

	private double[] nota = new double[4];
	private String disciplina;

	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	public double getMediaNotas() {
		double somaTotal = 0;
		
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		return somaTotal / nota.length;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
