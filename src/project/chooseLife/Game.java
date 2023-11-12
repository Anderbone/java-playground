package project.chooseLife;

import java.util.Scanner;

public class Game {
  private static final Scanner userInput = new Scanner(System.in);

  public static String getUserInput() {
    System.out.println("\n");
    userInput.reset();
    return userInput.next();
  }

  public static char getUserInputOneChar() {
    String userInput = getUserInput();
    return userInput.charAt(0);
  }

  public void start() {
    welcome();
  }

  public void welcome() {
    System.out.println("Welcome to come, new warrior!\n");
    Player mainPlayer = new Player();
    initialName(mainPlayer);
    initialGender(mainPlayer);
    initialSpeakBehavior(mainPlayer);
  }

  private static void initialSpeakBehavior(Player mainPlayer) {
    System.out.println("what language do you want to speak?");
    System.out.println("1 for Chinese, 2 for English, 3 for something else");
    char lang = getUserInputOneChar();
    while (lang != '1' && lang != '2') {
      System.out.println("choose 1 or 2 please sorry, nothing else is allowed");
      lang = getUserInputOneChar();
    }

    if (lang == '1') {
      mainPlayer.setSpeakBehavior(new SpeakChinese());
    } else if (lang == '2') {
      mainPlayer.setSpeakBehavior(new SpeakEnglish());
    }

    mainPlayer.getSpeakBehavior().speak();
  }

  private static void initialGender(Player mainPlayer) {
    System.out.print(
        "\nYou are fully cloaked and we want to know if you are a man or a woman?"
            + "\n'm' for Male\n'f' for Female"
            + "\n'n' for keeping it secret");
    char gender = getUserInputOneChar();
    while (gender != 'm' && gender != 'f') {
      System.out.println(
          "\nPlease enter 'm' or 'f', 'n' leads to no where, you have to tell me your real gender\n");
      System.out.println("Input your sex:\n");
      gender = getUserInputOneChar();
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
    mainPlayer.setName(getUserInput());
    System.out.println(String.format("Your name %s is hao ting", mainPlayer.getName()));
  }
}
