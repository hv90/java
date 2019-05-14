
public class Pessoa {
	StringBuilder sb = new StringBuilder();
	protected String nome;
	protected long cpf;
	protected int anoDeNascimento;
	
	public Pessoa(long cpf, int anoDeNascimento) {
		this.cpf = cpf;
		this.anoDeNascimento = anoDeNascimento;
		this.nome = "";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return 2018-anoDeNascimento;
	}
	
	@Override
	public String toString() {
		sb.delete(0, sb.length());
		sb.append("Nome: ");
		sb.append(this.nome);
		sb.append(", CPF: ");
		sb.append(this.cpf);
		sb.append(", Data de Nascimento: ");
		sb.append(this.anoDeNascimento);
		
		return sb.toString();
	}
}
