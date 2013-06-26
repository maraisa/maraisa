package Biblioteca;
import java.util.ArrayList;

import data.Data;
public class Usuario {

	public String nome;
	public String sobrenome;
	public String cpf;
	public String sexo;
	public Endereco endereco;
	public Data datanasc;
	public ArrayList<Exemplar> listaemp;
	//public Exemplar exemplar;
	
	public Usuario(String nome,String sobrenome,String sexo,String cpf,Endereco endereco,Data datanasc){
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.cpf=cpf;
		this.sexo=sexo;
		this.endereco= endereco;
		this.listaemp= new ArrayList<Exemplar>();
	}
	
	/*Um m�todo que permite a altera��o do endere�o do usu�rio*/
	 
	 
	public void alteraEnd(Endereco endereco){
		this.endereco= endereco;
	}
	
	/*Um m�todo que retorne uma lista de Exemplares emprestados por este usu�rio*/
	 
	public void exemEmp(Exemplar exemplar){
		this.listaemp.add(exemplar);
	}
	/* m�todo que retorne uma String, contendo uma descri��o completa dos dados do usu�rio*/
	

		public String dadosUsuario () {
			String usuario;
			usuario = new String ("nome:" + this.nome + "/n sobrenome:" + this.sobrenome + "/n CPF:" + this.cpf + "/n sexo" + this.sexo + "/n Data Nascimento:" + this.datanasc + "/n Endere�o:" + this.endereco);
			return usuario;	
	}
//		/*m�todo que retorne uma String, contendo uma descri��o completa dos dados do usu�rio e os livros por ele emprestado*/
	
		public String dadoseEmp (){
			String usuario = this.dadosUsuario();
			usuario = usuario + "listaemp " + this.listaemp;
			return usuario;
			
		}
		
		
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Usuario u = new Usuario("Derik", "Evangelista", "M", "0001", new Endereco(logradouro, nome, complemento, bairro, cep, cidade, estado, pais), new Data(5,9,1990));
		
		System.out.println(u.nome);

	}
/* M�todo que adiciona exemplar emprestado*/
	
	public void add(Exemplar exemplar) {
		this.listaemp.add(exemplar);
	}
	
	// TODO Auto-generated method stub
		

/*m�todo que devolve livro emprestado*/

	public void devolve(Exemplar empr){
	this.listaemp.remove(this.listaemp.indexOf(empr));
}
}
