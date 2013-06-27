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

	public String getAutores() {
	return autores;
}
public void setAutores(String autores) {
	this.autores = autores;
}
public String getUniversidade() {
	return universidade;
}
public void setUniversidade(String universidade) {
	this.universidade = universidade;
}
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
