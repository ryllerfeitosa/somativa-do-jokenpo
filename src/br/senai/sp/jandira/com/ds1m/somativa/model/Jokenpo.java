package br.senai.sp.jandira.com.ds1m.somativa.model;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    private int escolhaDoJogador;
    private int escolhaDoComputador;
    private String resultadoDaEscolhaDoJogador;
    private String resultadoDaEscolhaDoComputador;
    private String respostaDoJogador;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("***Vamos jogar jokenpo***");
        System.out.println("-------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("-------------------------");
        System.out.print("Digite a sua escolha: ");
        escolhaDoJogador = leitor.nextInt();
        valorDoComputador();
    }

    public void valorDoComputador(){
        Random valorAleatorio = new Random();
        escolhaDoComputador = valorAleatorio.nextInt(3)+1;
        exibirResultados();
    }
    public void exibirResultados(){
        if (escolhaDoJogador == 1){
            resultadoDaEscolhaDoJogador = "Pedra";
            System.out.println("Você escolheu: " + resultadoDaEscolhaDoJogador);
        } else if (escolhaDoJogador == 2) {
            resultadoDaEscolhaDoJogador = "papel";
            System.out.println("Você escolheu: " + resultadoDaEscolhaDoJogador);
        } else if (escolhaDoJogador == 3) {
            resultadoDaEscolhaDoJogador = "Tesoura";
            System.out.println("Você escolheu: " + resultadoDaEscolhaDoJogador);
        }
        if (escolhaDoComputador == 1){
            resultadoDaEscolhaDoComputador = "Pedra";
            System.out.println("O computador escolheu: " + resultadoDaEscolhaDoComputador);
        } else if (escolhaDoComputador == 2) {
            resultadoDaEscolhaDoComputador = "Papel";
            System.out.println("O computador escolheu: " + resultadoDaEscolhaDoComputador);
        } else if (escolhaDoComputador == 3) {
            resultadoDaEscolhaDoComputador = "Tesoura";
            System.out.println("O computador escolheu: " + resultadoDaEscolhaDoComputador);
        }
        if (escolhaDoJogador == 1 && escolhaDoComputador == 1 || escolhaDoJogador == 2 && escolhaDoComputador == 2 || escolhaDoJogador == 3 && escolhaDoComputador == 3){
            System.out.println("VOCÊS EMPATARAM!!!");
        } else if (escolhaDoJogador == 1 && escolhaDoComputador == 2 || escolhaDoJogador == 2 && escolhaDoComputador == 3 || escolhaDoJogador == 3 && escolhaDoComputador == 1) {
            System.out.println("VOCÊ PERDEU!!!");
        } else if (escolhaDoJogador == 1 && escolhaDoComputador == 3 || escolhaDoJogador == 2 && escolhaDoComputador == 1 || escolhaDoJogador == 3 && escolhaDoComputador == 2) {
            System.out.println("VOCÊ GANHOU!!!");
        }
        jogarNovamente();
    }
    public void jogarNovamente(){
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Jogar novamente (S/N)?");
        respostaDoJogador = leitor2.nextLine().toUpperCase();

        if (respostaDoJogador.equals("S")){
            obterDados();
        }
        else{
            System.out.println("F I M");
        }
    }
}