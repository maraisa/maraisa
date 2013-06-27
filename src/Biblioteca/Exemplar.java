package Biblioteca;
import data.Data;
public class Exemplar {
	public String titulo;
	public String subtitulo;
	public Data ano;
	public boolean disponibilidade;
	public Usuario usuario ;

	public Exemplar(String titulo,String subtitulo,Data ano,String disponibilidade){
		this.titulo=titulo;
		this.subtitulo=subtitulo;
		this.ano=ano;
		this.disponibilidade=true;
		this.usuario=null;
	}
	

	/*m�todo que permite a realiza��o de um empr�stimo do exemplar*/

	
	public boolean emprestimo (Usuario user) {
		this.disponibilidade= false;
		this.usuario = user;
		user.add(this);
		return true;
	}

	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSubtitulo() {
		return subtitulo;
	}


	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}


	public Data getAno() {
		return ano;
	}


	public void setAno(Data ano) {
		this.ano = ano;
	}


	public boolean isDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	



	/* m�todo que permite a realiza��o da devolu��o do exemplar*/

	public boolean devolucao() {
		this.disponibilidade = true;
		this.usuario.devolve(this);
		this.usuario = null;
		return disponibilidade;
	}

	
	/* m�todo que retorna uma String, que diz se o exemplar est� emprestado ou n�o*/

	public String emprestado(){
		String emprestado;
		if(this.disponibilidade == true){
			emprestado = new String("Disponivel");
		}
		else{			
			emprestado= new String ("N�o disponivel");
		}
		return emprestado;
	}
	public Usuario quemEmprestou(){
		if(this.disponibilidade== false){
			return usuario;
		} else {
			return null;
		}
	}
}

/*  m�todo que retorna, caso o exemplar esteja emprestado, o usu�rio que emprestou*/



