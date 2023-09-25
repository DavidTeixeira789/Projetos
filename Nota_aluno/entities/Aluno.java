package entities;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double total() {
		return (n1+n2+n3);
	}
	public String toStirng() {
		if(total()<60.0) {
		return "REPROVADO "+
		String.format("%n")+"FALTAM "+String.format("%.2f",60.0-total())+" PONTOS";
		}else {
			return "APROVADO";
		}
	}
}
