public class Estagiario extends Pessoa {
	private final double vale_coxinha;

	public Estagiario(int ID, String nome, double salario) {
		super(nome, ID, salario);
		this.vale_coxinha = 350;
	}

	@Override
	public double getSalario() {
		// Calcula o salário líquido
		return (super.getSalario() + this.vale_coxinha);
	}
}