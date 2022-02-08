package com.bootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private Set<Conteudo> listaConteudos = new LinkedHashSet<>(); 
	private Set<Aluno> alunosMatriculados = new HashSet<>();
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFim = dataInicio.plusMonths(3);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getListaConteudos() {
		return listaConteudos;
	}
	public void setListaConteudos(Conteudo conteudo) {
		this.listaConteudos.add(conteudo);
	}
	public Set<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void matricularAluno(Aluno aluno) {
		this.alunosMatriculados.add(aluno);
	}
	@Override
	public int hashCode() {
		return Objects.hash(alunosMatriculados, dataFim, dataInicio, listaConteudos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(alunosMatriculados, other.alunosMatriculados) && Objects.equals(dataFim, other.dataFim)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(listaConteudos, other.listaConteudos)
				&& Objects.equals(nome, other.nome);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", listaConteudos=" + listaConteudos
				+ ", alunosMatriculados=" + alunosMatriculados + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ "]";
	}
	
}
