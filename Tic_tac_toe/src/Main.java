import game.Morpion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Morpion gameBoard = new Morpion();
        Scanner read = new Scanner(System.in);
        boolean finduJeu = false;
        char joueurActuel = 'X';

      while (!finduJeu) {
            gameBoard.displayGrille();
            System.out.println("c'est le tour du joueur " + joueurActuel );
            gameBoard.JouerTour(joueurActuel, read);
          if (gameBoard.WinCheck(joueurActuel)) {
              gameBoard.displayGrille();
              System.out.println("🎉 Le joueur " + joueurActuel + " a gagné !");
              break;
          } else if (gameBoard.MatchNull()) {
              gameBoard.displayGrille();
              System.out.println("🤝 Match nul !");
              break;
          }
            joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';

        }

      read.close();

    }
}