package Biblioteca;
import data.Data;
public class Livro extends Exemplar{
	public String autor;
	public String editora;
	public String edicao;
	public String volume;
	
	public Livro(String autor, String editora,String edicao,String volume,String titulo,String subtitulo,String disponibilidade,Data ano){
		super(titulo,subtitulo,ano,disponibilidade);
		this.autor=autor;
		this.editora=editora;
		this.edicao=edicao;
		this.volume=volume;
	}

	public Livro( String titulo,String subtitulo,Data ano,String disponibilidade,String autor ){
		super(titulo,subtitulo,ano,disponibilidade);
		this.autor=autor;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
