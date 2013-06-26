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


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

/* método que permite a realização da devolução do exemplar*/
	
	public boolean devolucao() {
		this.disponibilidade = true;
		this.usuario.sub(this);
		this.usuario = null;
return disponibilidade;
	}
}