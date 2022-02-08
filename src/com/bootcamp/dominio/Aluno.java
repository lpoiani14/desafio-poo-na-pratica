package com.bootcamp.dominio;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Aluno {
	private String nome;
	private Set<Conteudo> conteudoMatriculado = new LinkedHashSet<>();
//	private Set<Conteudo> conteudoFinalizado = new LinkedHashSet<>();
	private Map<Conteudo, LocalDate> conteudoFinalizado = new LinkedHashMap<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void matricular(Bootcamp bootcamp) {
		bootcamp.matricularAluno(this);
		this.conteudoMatriculado.addAll(bootcamp.getListaConteudos());
	}
	
	public void finalizarConteudo() {
		if(this.conteudoMatriculado.stream().findFirst().isPresent()) {
			this.conteudoFinalizado.put(this.conteudoMatriculado.stream().findFirst().get(), LocalDate.now());
			this.conteudoMatriculado.remove(this.conteudoMatriculado.stream().findFirst().get());
		}
		else {
			System.out.println("Você não tem nenhum curso para finalizar!");
		}
	}
	
	public Double calculaXpTotal() {
		double xp = 0d;
		for (Conteudo conteudo : conteudoFinalizado.keySet()) {
			xp += conteudo.calcularXp();
		}
		return xp;
	}
	
	@Override
	public String toString() {
		String str = ("Aluno: " + nome + "\n");
		str += "\nConteúdo Matriculado:\n";
		for (Conteudo conteudo : conteudoMatriculado) {
			str += conteudo.getTitulo() + "\n"; 
		}
		str += "\nConteúdo Concluído:\n";
				for (Conteudo conteudo : conteudoFinalizado.keySet()) {
					str += conteudo.getTitulo() + " - Data: " + conteudoFinalizado.get(conteudo) + "\n"; 
				}
				
		return str;
	}
	
}
