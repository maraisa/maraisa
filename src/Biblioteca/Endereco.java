package Biblioteca;

public class Endereco {
public String logradouro;
public String nome;
public String complemento;
public String bairro;
public String cep;
public String cidade;
public String estado;
public String pais;

public Endereco (String logradouro,String nome,String complemento,String bairro,String cep,String cidade,String estado,String pais){
	this.logradouro=logradouro;
	this.nome=nome;
	this.complemento=complemento;
	this.bairro=bairro;
	this.cep=cep;
	this.cidade=cidade;
	this.estado=estado;
	this.pais=pais;
}
/* método que retorne uma String, com a descrição completa do endereço.*/
public String descEnd(){
	String endereco;
	endereco = new String("logradouro:"+ this.logradouro + "\n nome:" + this.nome +"\n complemento:" + this.complemento + "\n bairro:" +this.bairro+ "\n cep:" +this.cep + "\n cidade:" +this.cidade + "\n estado:"+this.estado + "\n pais:"+this.pais);
return endereco;
}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
