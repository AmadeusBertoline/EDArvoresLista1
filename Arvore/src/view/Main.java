package view;

import br.edu.fateczl.arvoreint.Arvore;

public class Main {

	public static void main(String[] args) {

		int[] vetor = { 33, 15, 41, 38, 47, 34, 49, 43 };

		Arvore arvore = new Arvore();

		for (int i : vetor) {

			arvore.insert(i);

		}

		try {

			arvore.prefixSearch();
			arvore.postfixSearch();
			arvore.infixSearch();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
