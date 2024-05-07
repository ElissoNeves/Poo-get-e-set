package Escola;

import java.util.Scanner;

public class Escola {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(scanner.nextInt());

        System.out.println("O Aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");
    scanner.close();
    }
}
