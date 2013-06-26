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
		ArrayList<Usuario> usuario =new ArrayList<Usuario>();

		Exemplar l = new Livro("cassiano","aurelio","115","120","banco de dados","dados","true",new Data(26,06,2013));

				System.out.println(l.emprestado());

		Exemplar r= new Revista("veja","bbb","false","2013","Aurelio");

		System.out.println(r.emprestado());

		Exemplar a=new Artigo("Sistema de dados","dados","2013","false","Wel");

		System.out.println(a.emprestado());



	}

}


