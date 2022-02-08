package com.bootcamp.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;

	@Override
	public Double calcularXp() {
		return cargaHoraria*XP_PADRAO;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
