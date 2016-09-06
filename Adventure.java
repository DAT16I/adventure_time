import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Adventure {

   public static void main(String args[]) throws IOException {
   
      String fileContent = readFile("information.txt");
      System.out.println(fileContent);

      /**---------------------------------------------------------------**/
      /**-- Player Info --**/
      /**---------------------------------------------------------------**/

      String name;
      int health = 10;
      int attack = 1;
      int numberOfAttacks;

      /**---------------------------------------------------------------**/
      /**-- Creature Info --**/
      /**---------------------------------------------------------------**/

      String CREATURE01 = "gryphon";
      String CREATURE02 = "dragon";
      String creature;

      /**---------------------------------------------------------------**/
      /**-- Choices --**/
      /**---------------------------------------------------------------**/

      int choice01 = 0;

      /**---------------------------------------------------------------**/
      /**-- What is your name? --**/
      /**---------------------------------------------------------------**/

      name = read(
         "Hello bold adventurer, who might you be?"
      );

      write(
         "Hello " + name + ", I never expected such an experienced advenurer like yourself too show up at my door."
      );

      /**---------------------------------------------------------------**/
      /**-- What creature did you kill? --**/
      /**---------------------------------------------------------------**/

      creature = read(
         name + " might you be the one who have slain the gryphon? \n Or was it the dragon?"
      );

      if (creature.equals(CREATURE01)) {
         creature = CREATURE02;
         write(
            "Oh what a magnificent beast to slay! \n Those " + CREATURE01 + "s are majestic creatures."
         );

      }
      else if (creature.equals(CREATURE02)) {
         creature = CREATURE01;
         write(
            "Foul, foul creature! \n Better off with one " + CREATURE02 + " less in the world."
         );

      }
      else {
         write(
            "I do not know what that mean but good on you!"
         );
      }

      endSection();

      /**---------------------------------------------------------------**/
      /**-- Meeting the creature(s) --**/
      /**---------------------------------------------------------------**/

      write(
         "All of a sudden, a creature emerges from the shadows!"
      );

      if (creature.equals(CREATURE01)) {
         write(
            "Oh my god, it's a " + creature + "! \n Such splendor, such glory.. \n Please kill it Sir. " + name
         );
      }
      else if (creature.equals(CREATURE02)) {
          write(
            "What filth! Do kill the foul " + creature + " good Sir. " + name
         );
      }
      else {
         write(
            "Oh my god, it's a " + creature + " and " + creature + ". RUN!!"
         );
      }

      endSection();

      /**---------------------------------------------------------------**/
      /**-- Pre-Fight --**/
      /**---------------------------------------------------------------**/

      if (creature != null) {
         choice01 =  Integer.parseInt(read(
            "What do you want to do? \n 1) Attack the creature with your bare hands \n 2) Search for a more suitable weapon"
         ));
      }
      else {
         write(
            "The two creatures attacks you and \n you have suffered a painfull and humiliating death."
         );
         endGame();
      }

      if (choice01 == 1) {
         write(
            "You confront the " + creature + " with your bare fists and \n can attack swiftly but you don't seem to be doing much damage!"
         );
         numberOfAttacks = 4;
      }
      else if (choice01 == 2) {
         write(
            "You spot a sword in a stone not far from where you are. You rush to the sword to confront the " + creature + " standing before you. " +
            " \n Unfortunately retrieving the sword made you turn your back on the " + creature + " and it slashes you across the back!"
         );
         health = health - 2;
         attack = 2;
         numberOfAttacks = 2;
      }
      else {
         write(
            "You are frozen solid out of fear and a moment later the creature finnishes you off!"
         );
         endGame();
      }

      /**---------------------------------------------------------------**/
      /**-- FIGHT! --**/
      /**---------------------------------------------------------------**/

      write(
         "You catch your breath and make ready for the fight ahead of you!" +
         "\nThe fight will go for ten rounds."
      );

      for (int i = 1; i <= 10; i++) {
         write(
            "Round: " + i
         );

         int choice = Integer.parseInt(read(
            "Do you want to:\n 1) Fight \n 2) Flee"
         ));

         if (choice == 1) {
            write(
               "With all of your might you attack the " + creature + "."
            );
            //Combat will take place
         }
         else if (choice == 2) {
            write(
               "You try to flee but the wizard trips you and calls you a coward."
            );
            //You will take damage in the attempt on fleeing and might possible die.
            break;
         }
         else {
            write(
               "That is not a choice, and destiny will punish you for your indecisiveness!"
            );
            //Needs to take damage here.
         }

      }

   }

   /**
   * Prints out the variable value provided for the application.
   * @param line the desired value that you want printed to the console.
   */
   public static void write(Object line) {
      System.out.println(line);
   }

   /**
   * Prints a line to the console, prompts a user for an input and returns given input.
   * @param line message you want to print to the user.
   * @return inputtext whatever value the user has put in.
   */
   public static String read(String line) {
      Console console = System.console();
      return console.readLine(line + "\n");
   }

   /*
   * Subtracts the health from the player and returns the new total amount of health left.
   * @param damage amount of health to subtract from the players current health.
   * @param health amount of health the player has before getting attacked.
   * @return health new total health of the player.
   */
   public static int takeDamage(int damage, int health) {
      health = health - damage;

      write(
         "Health: " + health
      );

      return health;
   }

   /**
   * Will calculate the total health after an attack has taken place.
   * @param attack the desired amount of health to be subtracted from the health.
   * @param health the amount of health before the attack took place.
   * @return health amount of health the creature in question should have after the attack.
   */
   public static int attack(int weapon, int health) {
      return health - weapon;
   }

   /**
   * Will write a message and end the game.
   */
   public static void endGame() {
      write(
         "!!!GAME OVER!!!"
      );
      System.exit(0);
   }

   /**
   * Adds a line to the console to signify a new section of the adventure.
   */
   public static void endSection() {
      write(
         "\n |-----------------------------------------------------------| \n"
      );
   }
   
   /**
   * Reads a file to a single String
   * @return fileContent the content of the file
   */
   public static String readFile(String filePath) throws IOException {
   
      String content = new String(Files.readAllBytes(Paths.get(filePath)));
      return content;
   
   }
   
   


}
