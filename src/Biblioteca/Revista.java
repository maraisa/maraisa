package Biblioteca;
import data.Data;
public class Revista extends Exemplar{
public String editora;
public String numero;
public String preco;

public Revista(String editora,String numero,String preco,String titulo,String subtitulo,Data ano,String disponibilidade){
	super(titulo,subtitulo,ano,disponibilidade);
	this.editora=editora;
	this.numero=numero;
	this.preco=preco;
}

public Revista(String titulo,String subtitulo,String disponibilidade,Data ano,String editora){
	super(titulo,subtitulo,ano, disponibilidade);
	this.editora=editora;
}

	public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getPreco() {
	return preco;
}

public void setPreco(String preco) {
	this.preco = preco;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
