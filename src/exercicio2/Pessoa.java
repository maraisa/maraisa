package exercicio2;

import data.Data;

public class Pessoa {
public String nome;
public String sobrenome;
public String sexo;
public String rg;
public Data datanasc;

public Pessoa(String nome,String sobrenome,String sexo,String rg,Data datanasc){
	this.nome=nome;
	this.sobrenome=sobrenome;
	this.sexo=sexo;
	this.rg=rg;
	this.datanasc=datanasc;	
}
public String getNome(){
return this.nome;
}
public void setNome(String nome){
	this.nome=nome;
}


}