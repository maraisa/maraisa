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
		this.datanasc = datanasc;
		this.endereco= endereco;
		this.listaemp= new ArrayList<Exemplar>();
	}
	
	/*Um método que permite a alteração do endereço do usuário*/
	 
	 
	public void alteraEnd(Endereco endereco){
		this.endereco= endereco;
	}
	
	/*Um método que retorne uma lista de Exemplares emprestados por este usuário*/
	 
	public void exemEmp(Exemplar exemplar){
		this.listaemp.add(exemplar);
	}
	/* método que retorne uma String, contendo uma descrição completa dos dados do usuário*/
	

		public String dadosUsuario () {
			String usuario;
			usuario = new String ("nome:" + this.nome + "\n sobrenome:" + this.sobrenome + "\n CPF:" + this.cpf + "\n sexo" + this.sexo + "\n Data Nascimento:" + this.datanasc + "\n Endereço:" + this.endereco.descEnd());
			return usuario;	
	}
//		/*método que retorne uma String, contendo uma descrição completa dos dados do usuário e os livros por ele emprestado*/
	
		public String dadoseEmp (){
			String usuario = this.dadosUsuario();
			usuario = usuario + "listaemp " + this.listaemp;
			return usuario;
			
		}
		
		
		
	public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public Data getDatanasc() {
			return datanasc;
		}

		public void setDatanasc(Data datanasc) {
			this.datanasc = datanasc;
		}

		public ArrayList<Exemplar> getListaemp() {
			return listaemp;
		}

		public void setListaemp(ArrayList<Exemplar> listaemp) {
			this.listaemp = listaemp;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Usuario u = new Usuario("Derik", "Evangelista", "M", "0001", new Endereco("Alexandrino", "mara","jardim","Ipê", "00000000-00", "São José dos Pinhais","Paraná", "Brasil"), new Data(5,9,2010));
		
		System.out.println(u.dadosUsuario());

	}
/* Método que adiciona exemplar emprestado*/
	
	public void add(Exemplar exemplar) {
		this.listaemp.add(exemplar);
	}
	
	// TODO Auto-generated method stub
		

/*método que devolve livro emprestado*/

	public void devolve(Exemplar empr){
	this.listaemp.remove(this.listaemp.indexOf(empr));
}
}
