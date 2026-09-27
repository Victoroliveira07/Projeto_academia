package atividade_academia;

public abstract class Aluno {
	
	public String nome;
	protected String documento;
	protected String valorDaMensalidade;
	
	//Assiciação com Plano
	protected Plano plano;
	
	//composição com check-in
	protected Checkin Checkin;
	
	public Aluno() {
		//A compopsição exige que o ciclo de vida seja gerado pela classe Aluno 
		this.Checkin = new Checkin();
	}
}
