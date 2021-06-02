//classe criada para ser a classe pai de cada funcionário
public class Pessoa {
	private String nome;
	private int ID;
	private double salario;

	public Pessoa(String nome, int ID, double salario) {
		this.nome = nome;
		this.ID = ID;
		this.salario = salario;
	}

	public void alteraAdicional(double x) {
		/*método para ser sobrescrito e somente alterar
		  o adicional se o funcionário tiver direito ao
			adicional*/
	}

	public String getNome() {
		return this.nome;
	}

	public int getID() {
		return this.ID;
	}

	public double getSalario() {
		return this.salario;
	}
}
