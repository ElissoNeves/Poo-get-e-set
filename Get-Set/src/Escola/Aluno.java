package Escola;

public class Aluno {
    
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public Void setIdade(int newIdade){
        this.idade = newIdade;
        return null;
    }
}
