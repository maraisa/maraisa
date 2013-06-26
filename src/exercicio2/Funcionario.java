package exercicio2;

import data.Data;

public class Funcionario extends Pessoa {
public float salario;
public Data dataadmissao;

public Funcionario (String nome,String sobrenome,String sexo,String rg,Data datanasc,float salario,Data dataadmissao){
super(nome,sobrenome,sexo,rg,datanasc);
	this.dataadmissao=dataadmissao;
	this.salario=salario;
}
}