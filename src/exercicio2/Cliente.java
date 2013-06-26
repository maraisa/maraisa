package exercicio2;

import data.Data;

public class Cliente extends Pessoa {
	public Data datacad;
	public Data comprasreal;

	public Cliente (String nome,String sobrenome,String sexo,String rg,Data datanasc,Data datacad,Data comprasreal){
		super (nome,sobrenome,sexo,rg,datanasc);
		this.datacad=datacad;
		this.comprasreal=comprasreal;
	}
}