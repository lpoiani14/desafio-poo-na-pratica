package com.bootcamp.dominio;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Criar Aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Leonardo");
		
		// Criar Bootcamp
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Estudos Java");
		bootcamp1.setDescricao("Bootcamp para estudar Java");
			
//		System.out.println(aluno1);
//		System.out.println(bootcamp1);
		
		// Criar Cursos
		Curso curso1 = new Curso();
		curso1.setTitulo("Java Inicio");
		curso1.setDescricao("Estudo Inicial de Java");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java Meio");
		curso2.setDescricao("Estudo Médio de Java");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Live Java");
		mentoria1.setDescricao("Live de Java");
		mentoria1.setDataMentoria(LocalDate.of(2022, 02, 15));
		
		bootcamp1.setListaConteudos(curso1);
		bootcamp1.setListaConteudos(curso2);
		bootcamp1.setListaConteudos(mentoria1);
		
		// Inscrever aluno no bootcamp
		aluno1.matricular(bootcamp1);
		System.out.println(aluno1);
		
		// Calcular XP aluno
		aluno1.finalizarConteudo();
		System.out.println(aluno1);
		System.out.println(aluno1.calculaXpTotal());
		
		aluno1.finalizarConteudo();
		System.out.println(aluno1);
		System.out.println(aluno1.calculaXpTotal());
		
		aluno1.finalizarConteudo();
		System.out.println(aluno1);
		System.out.println(aluno1.calculaXpTotal());
		
		aluno1.finalizarConteudo();
		System.out.println(aluno1);
		System.out.println("XP Total: " + aluno1.calculaXpTotal());
		
		// Colocar data de conclusao do Curso (usado estrutura Map no conteudoFinalizado da classe Aluno)
		
		
	}

}
