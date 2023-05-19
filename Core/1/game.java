// import java.util.Scanner;

// class Guesser {

// int gNumber;

// public int getNumber() {

// Scanner s1 = new Scanner(System.in);
// System.out.println("Enter Guesser Number");
// gNumber = s1.nextInt();

// return gNumber;
// }

// }

// class Player {

// int pNumber;

// public int getNumber() {

// Scanner s2 = new Scanner(System.in);
// System.out.println("Enter Player Number");
// pNumber = s2.nextInt();

// return pNumber;
// }

// }

// class Umpire {
// int gGNumber;
// int p1Number;
// int p2Number;
// int p3Number;

// public void getNumberFromGuesser() {

// Guesser guesser = new Guesser();
// gGNumber = guesser.getNumber();
// }

// public void getNumberFromPlayer() {

// Player player1 = new Player();
// Player player2 = new Player();
// Player player3 = new Player();

// p1Number = player1.getNumber();
// p2Number = player2.getNumber();
// p3Number = player3.getNumber();
// }

// public void compare() {

// if ((gGNumber == p1Number) && (gGNumber == p2Number) && (gGNumber ==
// p3Number))
// System.out.println("Game tied all three players guessed correctly");
// else if ((gGNumber == p1Number) && (gGNumber == p2Number))
// System.out.println("Player1 and Player2 won the game");
// else if ((gGNumber == p1Number) && (gGNumber == p3Number))
// System.out.println("Player1 and Player3 won the game");
// else if ((gGNumber == p2Number) && (gGNumber == p3Number))
// System.out.println("Player2 and Player3 won the game");
// else if (gGNumber == p1Number)
// System.out.println("Player1 won the game");
// else if (gGNumber == p2Number)
// System.out.println("Player2 won the game");
// else if (gGNumber == p3Number)
// System.out.println("Player3 won the game");
// else
// System.out.println("Game lost! try again");

// }

// }

// public class game {
// public static void main(String[] args) {

// Umpire umpire = new Umpire();
// umpire.getNumberFromGuesser();
// umpire.getNumberFromPlayer();
// umpire.compare();
// }
// }