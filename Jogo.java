/* 
* Classe Jogo, todas as fases e criação de personagem
*/

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    
    Scanner ler;
    String opc;
    Menu m = new Menu();
    Personagem player;
    Random rng;

    public Jogo(){
        ler = new Scanner(System.in);
        opc = "x";
        rng = new Random();
    }

    public void jogo(){

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("=========== RPT (RPG DE TERMINAL ==============");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Todos direitos reservados a Henri 'Akyre_' Venturini");
        System.out.println("");
        System.out.println("(Aperte 'C + ENTER' para iniciar ou 'X + ENTER' para sair");

        opc = ler.next();
        opc.toLowerCase();

        if(opc.equals("c")){
            criacaoPersonagem();
        }else if(opc.equals("x")){
            m.inicio();
        }else{
            System.out.println("");
            System.out.println("Opção invalida, tente novamente!");
            System.out.println("");
            jogo();
        }
    }

    private void criacaoPersonagem() {

        System.out.println("");
        System.out.println("");
        System.out.println("-=[Atributos]=-");
        System.out.println("");

        int forca = rng.nextInt(5) + 1;
        int agilidade = rng.nextInt(5) + 1;
        int inteligencia = rng.nextInt(5) + 1;

        int vida = 10 + forca;
        int mana = 10 + inteligencia;
        int danoBase = forca;
        int armaduraBase = agilidade;
        float esquiva = (float) (agilidade * 0.1);

        System.out.printf("Força: %d \n", forca);
        System.out.printf("Agilidade: %d \n", agilidade);
        System.out.printf("Inteligencia: %d \n", inteligencia);
        System.out.printf("Vida: %d \n", vida);
        System.out.printf("Mana: %d \n", mana);
        System.out.printf("Dano Base: %d \n", danoBase);
        System.out.printf("Armadura Base: %d \n", armaduraBase);
        System.out.printf("Chance de esquiva: %.1f por cento\n", esquiva * 10);
        System.out.printf("");

        System.out.println("(Os numeros gerados são aleatorios de 1 a 5. Vida e outros atributos são retirados dos atributos primarios)");
        System.out.println("Quer continuar com esses atributos? [C ou X + ENTER]");

        opc = ler.next();
        opc.toLowerCase();

        if(opc.equals("c")){
            player.setForca(forca);
            player.setAgilidade(agilidade);
            player.setInteligencia(inteligencia);
            player.setVida(vida);
            player.setMana(mana);
            player.setDanoBase(danoBase);
            player.setArmaduraBase(armaduraBase);
            player.setEsquiva(esquiva);

            fase1();
        }else if(opc.equals("x")){
            criacaoPersonagem();
        }else{
            System.out.println("");
            System.out.println("Opção invalida, tente novamente!");
            System.out.println("");
            System.out.println("");
            criacaoPersonagem();
        }
    }

    private void fase1() {
        System.out.println("FASE 1");
    }

}
