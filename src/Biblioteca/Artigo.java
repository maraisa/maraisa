package Biblioteca;
import data.Data;
public class Artigo extends Exemplar {
public String autores;
public String universidade;
public String editora;

public Artigo(String titulo,String subtitulo,Data ano,String disponibilidade,String autores,String universidade,String editora){
	super(titulo,subtitulo,ano,disponibilidade);
	this.editora=editora;
}
public Artigo(String titulo,String subtitulo,Data ano,String disponibilidade,String autores,String universidade){
	super(titulo,subtitulo,ano,disponibilidade);
	this.autores=autores;
	this.universidade=universidade;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
