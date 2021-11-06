/* 
* Classe Menu, menu principal e gerenciamento de idioma
*/

import java.util.Scanner;

public class Menu {

    Scanner ler;
    Jogo j = new Jogo();

    public Menu(){
        
        ler = new Scanner(System.in);

    }
    
    public void inicio(){
        
        int opc = 0;

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("-=[Select your language]=-");
        System.out.println("");
        System.out.println(" 1 - Português");
        System.out.println(" 2 - English");
        System.out.println(" 3 - Español");
        System.out.println("");
        System.out.println("(Select your option by pressing the number in your keyboard and pressing ENTER)");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");

        opc = ler.nextInt();

        switch(opc){
            case 1:
                // Manipulação de properties! 'idioma(1);' ou algo do tipo
                // Debug
                // System.out.println("Português!!!");
                j.jogo();
                break;
            case 2:
                // Manipulação de properties! 'idioma(2);' ou algo do tipo
                // Debug
                // System.out.println("English!!!");
                j.jogo();
                break;
            case 3:
                // Manipulação de properties! 'idioma(3);' ou no proprio 'jogo()'
                // Debug
                // System.out.println("Español!!!");
                j.jogo();
                break;
            default:
                System.out.println("Invalid value! Please select a valid number");
                inicio();
            break;
        }
    }
}
