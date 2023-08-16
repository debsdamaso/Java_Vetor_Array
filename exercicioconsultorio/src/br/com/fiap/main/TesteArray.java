package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Cadastro;

public class TesteArray{

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
		
		List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
		
		Cadastro objCadastro;
		
		do {
		// Entrada
		objCadastro = new Cadastro();
		objCadastro.setNome(texto("Digite o nome"));
		objCadastro.setRg(texto("Digite o RG"));
		objCadastro.setIdade(inteiro("Digite a idade"));
		objCadastro.setAltura(decimal("Digite a altura"));
		listaCadastro.add(objCadastro);

		// Escolhemos entre encerrar ou adicionar mais um cadastro
		} while (JOptionPane.showConfirmDialog(null, "Deseja fazer outro cadastro?", "Cadastros",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		// Saída
		// O foreach percorre todos os elementos do cadastro para serem exibidos 
		for (Cadastro c : listaCadastro) {
			System.out.println("Nome " + c.getNome() + "\n" + 
					"RG: " + c.getRg() + "\n" + 
					"Idade: " + c.getIdade() + "\n" + 
					"Altura: " + c.getAltura());
		}

	}

}