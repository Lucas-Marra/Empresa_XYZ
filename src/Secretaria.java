public class Secretaria extends Pessoa {
	private double previdencia;

	public Secretaria(int ID, String nome, double salario) {
		super(nome, ID, salario);
		// Desconto fixo de um sistema de previdência da empresa
		this.previdencia = 0.05;
	}

	@Override
	public double getSalario() {
		// Calcula o salário líquido
		return (super.getSalario() * (1 - previdencia));
	}
}