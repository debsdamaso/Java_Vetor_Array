package br.com.fiap.beans;

public class Cadastro {
    // Variáveis
    private String nome;
    private String rg;
    private int idade;
    private double altura;

    // Construtor vazio
    public Cadastro() {
		super();
	}

	// Construtor cheio
    public Cadastro(String nome, String rg, int idade, double altura) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
