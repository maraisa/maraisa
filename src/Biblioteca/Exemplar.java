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
	

	/*método que permite a realização de um empréstimo do exemplar*/

	
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


	



	/* método que permite a realização da devolução do exemplar*/

	public boolean devolucao() {
		this.disponibilidade = true;
		this.usuario.devolve(this);
		this.usuario = null;
		return disponibilidade;
	}

	
	/* método que retorna uma String, que diz se o exemplar está emprestado ou não*/

	public String emprestado(){
		String emprestado;
		if(this.disponibilidade == true){
			emprestado = new String("Disponivel");
		}
		else{			
			emprestado= new String ("Não disponivel");
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

/*  método que retorna, caso o exemplar esteja emprestado, o usuário que emprestou*/



