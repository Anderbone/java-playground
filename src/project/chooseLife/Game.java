package project.chooseLife;

import java.util.Scanner;

public class Game {
  public static Scanner userInput = new Scanner(System.in);

  public void start() {
    welcome();
  }

  public void welcome() {
    System.out.println("Welcome to come, new warrior!\n");
    Player mainPlayer = new Player();
    initialName(mainPlayer);
    initialGender(mainPlayer);
  }

  private static void initialGender(Player mainPlayer) {
    System.out.println("Input your sex:\n");
    System.out.print(
        "\nYou are fully cloaked and we want to know if you are a man or a woman?"
            + "\n'm' for Male\n'f' for Female\n"
            + "\n'n' for keeping it secret");
    char gender = userInput.next().charAt(0);
    while (gender != 'm' && gender != 'f') {
      System.out.println(
          "\nPlease enter 'm' or 'f', 'n' leads to no where, you have to tell me your real gender\n");
      gender = userInput.next().charAt(0);
      if (gender == 'm') {
        System.out.println("Congrats! Correct gender!");
        mainPlayer.setGender(Gender.MALE);
        System.out.println("You are a Real Man!!");
      } else if (gender == 'f') {
        mainPlayer.setGender(Gender.FEMALE);
        System.out.println("You are a Real WoMan!!");
      }
    }
  }

  private static void initialName(Player mainPlayer) {
    System.out.println("Input your name:\n");
    mainPlayer.setName(userInput.next());
    userInput.reset();
    System.out.println(String.format("Your name %s is hao ting", mainPlayer.getName()));
  }
}
