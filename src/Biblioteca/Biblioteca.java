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

		Usuario u1 = new Usuario("Cassiano", "Barbosa", "Masculino","000000-00", new Endereco("Avenida", "Rui Barbosa", "123","Afonso Pena", "80000-680", "S�o jos� dos pinhais","Paran�","Brasil"),new Data(27,06,2013));

		Exemplar exemp = new Exemplar("Jo�o","Maria",new Data(25,06,1996),"true");
	
		exemp.emprestimo(u1);
		System.out.println(exemp.disponibilidade);
		System.out.println(exemp.quemEmprestou().dadosUsuario());

		exemp.devolucao();
		System.out.println(exemp.emprestado());
		

		
		
		//		exemp.emprestado();
				
		/*
		exemp.dispo();
		System.out.println(exemp.dispo());
		
		exemp.descricao();
		System.out.println(exemp.dispo());
		
		
		
		
		
		

		
		
		
		
		Exemplar l = new Livro("cassiano","aurelio","115","120","banco de dados","dados","true",new Data(26,06,2013));

				System.out.println(l.emprestado());

		Exemplar r= new Revista("veja","bbb","false","2013","Aurelio");

		System.out.println(r.emprestado());

		Exemplar a=new Artigo("Sistema de dados","dados","2013","false","Wel");

		System.out.println(a.emprestado());

*/

	}

}


