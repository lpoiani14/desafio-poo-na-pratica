package com.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate dataMentoria;
	
	@Override
	public Double calcularXp() {
		return 3*XP_PADRAO;
	}

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
}
