package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.*;
import java.util.*;

public class TesteVetor {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		Cadastro[] objVetorCadastro = new Cadastro[3];
		
		int indice = 0;
		
		do {
			objVetorCadastro[indice] = new Cadastro();
			objVetorCadastro[indice].setNome(texto("Digite o nome"));
			objVetorCadastro[indice].setRg(texto("Digite o RG"));
			objVetorCadastro[indice].setIdade(inteiro("Digite a idade"));
			objVetorCadastro[indice].setAltura(decimal("Digite a altura"));			
			
			indice++;

		} while (JOptionPane.showConfirmDialog(null, "Adicionar outro cadastro?", "Cadastros",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		for (int contador = 0; contador < indice; contador++) {
			System.out.println("Nome: " + objVetorCadastro[contador].getNome() + "\n" + "RG: "
					+ objVetorCadastro[contador].getRg() + "\n" + "Idade: "
					+ objVetorCadastro[contador].getIdade() + "\nAltura" 
					+ objVetorCadastro[contador].getAltura());
		}

	}

}
