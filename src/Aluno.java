
public class Aluno extends Pessoa {
	
	StringBuffer sb = new StringBuffer();
	boolean exibirStatus = true;
	private long DRE;
	private double CRA;
	
	public Aluno(long cpf, int anoDeNascimento, long DRE, double CRA) {
		// TODO Auto-generated constructor stub
		super(cpf,anoDeNascimento);
		this.DRE = DRE;
		this.CRA = CRA;
	}
	
	
	public String toString(boolean exibirStatus) {
		// TODO Auto-generated method stub
		sb.append(super.toString());
		sb.append(", DRE: ");
		sb.append(this.DRE);
		sb.append(", CRA: ");
		sb.append(this.CRA);
		
		if(exibirStatus) {			
			sb.append(" Bom CRA");			
		}else {
			sb.append(" Pode melhorar");
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.CRA<7) {
			exibirStatus=false;
		}else {
			exibirStatus=true;
		}
		return toString(exibirStatus);
	}
	
}
