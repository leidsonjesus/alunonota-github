package Entidade;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	
	
	public String situacao() {
		double notaFinal = nota1 + nota2 + nota3;
		
		if ( notaFinal >= 60.00 ) {
			String situacao = " Aprovado";
			return situacao;
		}
		else {
			String  situacao =  "Reporvado";
			return situacao;
			}
		
		}
	public String notaF (double notaf) {
		
		if (notaf < 60) {
			return String.valueOf(notaf = (60 -notaf));
		}
		else {
			return ("");
		}
	}
	}
	

