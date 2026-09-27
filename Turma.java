package atividade_academia;

import java.util.List;
import java.util.ArrayList;

public class Turma{
	
	private List<Aluno> alunos;
	
	public Turma() {
		this.alunos = new ArrayList<>();
	}
	
	public void adcionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public List<Aluno> getAlunos(){
		return this.alunos;
	}

}
