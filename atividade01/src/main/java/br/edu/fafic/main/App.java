package br.edu.fafic.main;

import java.text.ParseException;

import br.edu.fafic.persistence.JpaPersistence;

public class App {
	public static void main(String [] args) throws ParseException {
		

	
		JpaPersistence persistence = new JpaPersistence();
		persistence.getEm();
	}
}
