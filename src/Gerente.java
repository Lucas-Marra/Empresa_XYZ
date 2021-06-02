public class Gerente extends Pessoa {
	private double previdencia, adicional;

	public Gerente(int ID, String nome, double salario) {
		super(nome, ID, salario);
		this.previdencia = 0.07;
		this.adicional = 0.2;
	}

	@Override
	public void alteraAdicional(double novo_percentual) {
		this.adicional = adicional * (1 + novo_percentual);
	}

	@Override
	public double getSalario() {
		// Calcula o salário líquido
		return ((super.getSalario()) * ((1 - this.previdencia) + this.adicional));
	}
}