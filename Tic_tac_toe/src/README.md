## 🔩 Morpion (Tic-Tac-Toe) - Java Console Game

A simple 2-player Tic-Tac-Toe game in the console, written in Java. This project is designed to practice basic game logic, input handling, and core object-oriented programming concepts.

---

## 🌟 Goal

Build a **console-based Tic-Tac-Toe game (Morpion)** where two players take turns placing their mark (`X` or `O`) on a 3×3 grid, until one wins or the board is full.

---

## 🔧 Step-by-Step Plan

### ✅ Step 1: Set Up the Game Board

#### 🌟 Objective
- Represent the Tic-Tac-Toe grid
- Initialize it with empty values
- Print it to the console in a nice, readable way

#### 📆 Suggested Class
Create a class `Morpion.java` in a `game` package.

#### ✅ 1. Define the Board
- Use a 2D char array: `char[3][3]`
- Initialize it in the constructor or a method like `initialiserGrille()`
- Fill the grid with a symbol like `' '` or `'-'` to show empty cells

```java
private char[][] grille = new char[3][3];
```

#### ✅ 2. Display the Board (`afficherGrille()`)
- Loop through the 2D array
- Print the grid like this:

```
    0   1   2
  -------------
0 | X | O | - |
1 | - | X | - |
2 | O | - | X |
```

#### 💡 Hint
Use nested `for` loops to iterate through rows and columns.

#### ✅ 3. Optional Polish
- Add row and column headers (0, 1, 2) for better UX
- Make sure the output is clean and readable

#### 🔮 Test
Call `afficherGrille()` from a `main()` method to confirm it works.

---

### ↻ Step 2: Handle Player Turns

#### ✅ What You’ll Build
- A loop to alternate between players
- Ask each player for their move (row & column)
- Place their symbol (`X` or `O`)
- Prevent overwriting already-occupied cells
- Switch players each turn

---

## 🧠 Key Elements

### 1. `jouerTour(char symbole)` Method
- Prompt the user: “Entrez la ligne et la colonne :”
- Use `Scanner` to read input
- Check if the chosen cell is empty
    - ✅ If yes → place the symbol
    - ❌ If not → ask again

💡 Use a loop to force valid input.

### 2. Alternating Players
Start with a variable:

```java
char joueurActuel = 'X';
```

After each turn, switch:

```java
joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';
```

### 3. Main Game Loop
In `main()` or `lancerPartie()`:

```java
while (!finDuJeu) {
    afficherGrille();
    jouerTour(joueurActuel);
    // Check for victory or draw next
    joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';
}
```

### ⛔ What to Avoid
- Don’t allow out-of-bounds input (check if 0 ≤ row, col < 3)
- Don’t overwrite an occupied cell

---

## 🏁 Step 3: Check for Victory and Draw

### ✅ What You'll Do
After each move, check:
- Has the player won?
- Is the board full with no winner (draw)?

---

### 🧠 Methods to Create

#### 1. `verifierVictoire(char symbole)`
Returns `true` if a player has won.

Check:
- ✅ 3 symbols on a row
- ✅ 3 symbols in a column
- ✅ 3 symbols in a diagonal

Example diagonals:

```java
grille[0][0] == grille[1][1] == grille[2][2]
grille[0][2] == grille[1][1] == grille[2][0]
```

💡 Use loops to check rows/columns to avoid repeating code.

#### 2. `verifierMatchNul()`
Returns `true` if the grid is full **and** no winner.

Steps:
- Loop through all cells
- If you find `' '` or `'-'` → return `false`
- Else → return `true`

---

### ↻ Update Main Loop
After each move:

```java
if (verifierVictoire(joueurActuel)) {
    afficherGrille();
    System.out.println("🎉 Le joueur " + joueurActuel + " a gagné !");
    break;
} else if (verifierMatchNul()) {
    afficherGrille();
    System.out.println("🤝 Match nul !");
    break;
}
```

---

## ✅ Final Result
You now have a fully functional **console Tic-Tac-Toe game**!

---

## 🚀 Bonus Challenges

- Add replay option (restart game)
- Let the user choose to be `X` or `O`
- Add an AI player (bot that plays randomly or blocks you)

