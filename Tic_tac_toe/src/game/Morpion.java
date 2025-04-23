package game;

import java.util.Scanner;

public class Morpion {

    private char[][] grille = new char[3][3];

    public Morpion() {
        for (int i = 0; i < 3 ; i++ ) {
            for (int j = 0; j < 3; j++) {
                this.grille[i][j] = ' ';
            }
        }
    }

    public void displayGrille() {
        System.out.println("  0 1 2");
        System.out.println("-------");
        for (int i = 0; i < 3 ; i++ ) {
            System.out.print(i);
            System.out.print(' ');
            for (int j = 0; j < 3; j++) {
                System.out.print(this.grille[i][j]);
                System.out.print('|');
            }
            System.out.print('\n');
        }
    }

    public void JouerTour(char symbole , Scanner read) {
        boolean fieldEmpty = false;

        while (!fieldEmpty){
            System.out.println("Enter ligne and colonne");
            if (!read.hasNextInt()) {
                System.out.println("Entrée invalide pour ligne. Essayez encore.");
                read.next(); // Consommer l'entrée invalide
                continue;
            }
            int ligne = read.nextInt();

            if (!read.hasNextInt()) {
                System.out.println("Entrée invalide pour colonne. Essayez encore.");
                read.next(); // Consommer l'entrée invalide
                continue;
            }
            int colonne = read.nextInt();
            if(ligne >= 0 & ligne < 3){
                if (colonne >= 0 & colonne < 3){
                    if (this.grille[ligne][colonne] == ' '){
                        this.grille[ligne][colonne] = symbole;
                        fieldEmpty = true;
                    }else {
                        this.grille[ligne][colonne] = symbole;
                    }
                }else {
                    System.out.println("enter colonne 0 or 1 or 2");
                }
            }
            else {
                System.out.println("enter ligne 0 or 1 or 2");
            }
        }

    }

    public boolean WinCheck(char symbole) {
          for (int i=0; i < 3; i++){
              if (this.grille[i][0] == symbole && this.grille[i][1] == symbole && this.grille[i][2] == symbole){
                  return true;
              } else if (this.grille[0][i] == symbole && this.grille[1][i] == symbole && this.grille[2][i] == symbole) {
                  return true;
              }
          }

          if (this.grille[0][0] == symbole && this.grille[1][1] == symbole && this.grille[2][2] == symbole){
              return true;
          } else if (this.grille[0][2] == symbole && this.grille[1][1] == symbole && this.grille[2][0] == symbole) {
              return true;
          }
          return false;
    }

    public boolean MatchNull(){
        boolean matchNull = true;

        for (int i = 0; i < 3 ; i++ ) {
            for (int j = 0; j < 3; j++) {
               if (this.grille[i][j] == ' '){
                   matchNull = false;
               }
            }
        }
        return matchNull;
    }
}

