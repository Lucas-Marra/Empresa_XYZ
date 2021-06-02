import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Pessoa> listaPessoa;

	public Empresa() {
		this.listaPessoa = new ArrayList<Pessoa>();
	}

	/* função para adicionar qualquer tipo de funcionário,
	   o tipo do funcionário é indiferente, uma vez que os
		 métodos específicos são sobrepostos.*/
	public void addFuncionario(Pessoa p) {
		this.listaPessoa.add(p);
	}

	/* função para calcular pagamento de funcionário 
	   a partir de um ID passado como parâmetro, caso
		 retorne -1, o funcionário não foi encontrado*/
	public double calculaPagamento(int ID) {
		for (Pessoa p : listaPessoa) {
			if (ID == p.getID()) {
				return p.getSalario();
			}
		}
		return -1;
	}

	/* aumenta o adicional de todos os funcionários que 
	   possuem direito ao adicional*/
	public void aumentaAdicional(double adicional) {
		for (Pessoa p : listaPessoa) {
			p.alteraAdicional(adicional);
		}
	}

	// Retorna string com a lista de funcionários
	@Override
	public String toString() {
		String lista = "";
		for (int i = 0; i < this.listaPessoa.size(); i++) {
			lista += "ID: " + listaPessoa.get(i).getID() + " -> Nome: " + listaPessoa.get(i).getNome()
					+ " -> Salário: R$ " +
					new BigDecimal(listaPessoa.get(i).getSalario()).setScale(2, RoundingMode.HALF_EVEN) + "\n";
		}
		return lista;
	}
}
