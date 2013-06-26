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
	super(titulo,subtitulo,disponibilidade,ano)
	this.editora=editora;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
