package Biblioteca;

import java.util.Scanner;
import java.util.ArrayList;
import data.Data;
public class Biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
		ArrayList<Usuario> usuario1 =new ArrayList<Usuario>();

		Usuario u1 = new Usuario("Cassiano", "Barbosa", "Masculino","000000-00", new Endereco("Avenida", "Rui Barbosa", "123","Afonso Pena", "80000-680", "São josé dos pinhais","Paraná","Brasil"),new Data(27,06,2013));

		Exemplar exemp = new Exemplar("Joâo","Maria",new Data(25,06,1996),"true");
	
		exemp.emprestimo(u1);
		System.out.println(exemp.disponibilidade);
		System.out.println(exemp.quemEmprestou().dadosUsuario());

		exemp.devolucao();
		System.out.println(exemp.emprestado());
		System.out.println(exemp.descricao);

		
		
		//		exemp.emprestado();
				
		
		exemp.dispo();
		System.out.println(exemp.dispo());
		
		exemp.descricao();
		System.out.println(exemp.dispo());
		
		
		
		
		
		

		
		
		
		
		Exemplar l = new Livro("cassiano","aurelio","115","120","banco de dados","dados","true",new Data(26,06,2013));

				System.out.println(l.descLivro);

		Exemplar r = new Revista("veja","dados","false",new Data(26,06,2013),"abril");

		System.out.println(r.descRevista());

		Exemplar a=new Artigo("caras","Fofocas",new Data(25,12,2012),"false","Ana","Ufpr");

		System.out.println(a.descArtigo());



	}

}


