import java.io.*;
import java.util.Random;
public class AdventureTime{
/*this is the fight simulator ... generates random HP and asks for imput from you
you have to guess a number between 1 or 2 and the boss HP gets decresed by 1 or 2*/
public static void random(BufferedReader bGets) throws IOException{
    int bhp = 10;
    int hpn = 10;
    System.out.println();
    System.out.println("Welcome to the fight simulator.");
    System.out.println("Your first enemy has 10 HP");
    System.out.println("You have to guess a number between 1-2");
    // here is the loop for Generating 1 or 2 and asking for imput
    while (hpn >= 0){
                        Random rand = new Random();
                        int  hp = rand.nextInt(2) + 1;

      System.out.print("Imput your guess:");
      String hpd = bGets.readLine();
      System.out.println(hpd);
      System.out.println(hp);
      int hpD = Integer.parseInt(hpd);
      // if the number generated is equal to your number guessed it decreses the HP
         if (hpD == hp) {
         System.out.println();
      System.out.println("You attacked your enemy for " + hp + " points of DMG.");
      System.out.println("Continue attacking my mighty friend");
      System.out.println();
      System.out.println("The BOSS is still in tackt with " + " HP.");

      hpn = hpn - hpD;
      }
      // esle continue the loop
         else { System.out.println("You guessed a wrong number try again");
      }


   }
   }
   // this is only a fight desciption
 public static void FightDesc(){
               System.out.println("The only way to defeat your enemy is ");
               System.out.println("to guess the correct number that was ");
               System.out.println("randomly generated then his HP gets  ");
               System.out.println("reduced by the correct number guesed ");
               System.out.println();
               System.out.println("Stronger enemies will have more HP.");
               System.out.println();
               System.out.println("You can now use your items to gain advantage");
               }
               // this is a ending text
 public static void end(){
      System.out.println("END!");
      System.out.println("CREDITS");
      System.out.println();
      System.out.println("DONE");
      System.out.println("Further implementations will come later!");
      System.out.println("Press ENTER to finish.");
   }

//main stuff
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Console console = System.console();
      int Inventory = 0; // inventory ... need to learn Arrays to have a inventory tho
      System.out.println("NOTE AFTER EVERY STEP PRESS ENTER TO CONTINUE");
      String Pause = br.readLine();
      System.out.print("Please enter your NAME:");
      String name = br.readLine();
      System.out.println(name);
      System.out.println();
      String Pause1 = br.readLine();
      System.out.print("Please enter your AGE:");
      String age = br.readLine();
      System.out.println(age);
      System.out.println();
      String Pause2 = br.readLine();
      //start of the game
      System.out.println("On your Path to victory you can fuck up on LEFT or RIGHT!");
      System.out.println("Please choose a path (left/right):");
      String Choice1 = br.readLine();
      System.out.println(Choice1);
      System.out.println();
      //first choice stuff
      if (Choice1.equals("left") || Choice1.equals("LEFT")){
         System.out.println();
         System.out.println("You Choose the LEFT path.");
         System.out.println();
         System.out.println("This path is very difficult ... but you dont need to be afraid");
         System.out.println("it is still the same path as on the Right.");
         System.out.println();
      }
      else if (Choice1.equals("right") || Choice1.equals("RIGHT")){
         System.out.println();
         System.out.println("You Choose the RIGHT path.");
         System.out.println("This path is very difficult ... but you dont need to be afraid");
         System.out.println("it is still the same path as on the Left.");
         System.out.println();
      }
      else {
         System.out.println();
         System.out.println("You have entered something else ... you kept walking straight");
      }
      String Pause3 = br.readLine();
      //decision stuff
      System.out.println();
      System.out.print("You have encountered a tin can would you " +
         "like to pick it up (yes/no):");
      String Choice2 = br.readLine();
      System.out.println(Choice2);
      System.out.println();
      //second choice stuff
      if (Choice2.equals("yes") || Choice2.equals("YES")){
         System.out.println();
         // if you pick up increment inventory
         Inventory++;
         System.out.println("You Choose to pick it up");
         System.out.println();
         System.out.println("This item is going to your inventory.");
         System.out.println("When the time comes you will be given choice to use it.");
      }
      else if (Choice2.equals("no") || Choice2.equals("NO")){
         System.out.println();
         System.out.println("You Choose to not pick it up");
         System.out.println("You are a terible person.");
         System.out.println("There are ppl fighting for cans and you just leave it to die");
         System.out.println("ALONE!!! in depresion ... JK lol ;)");
      }
      else {
         System.out.println();
         System.out.println("You have entered something else ... you are a bad person" +
            " so you didn't pick it up" );
      }
      String Pause4 = br.readLine();
        //decision stuff
      System.out.println();
      System.out.println("You advanced forward.");
      System.out.print("You found a SHOP would you like to enter (yes/no):");
      String Choice3 = br.readLine();
      System.out.println(Choice3);
      System.out.println();
      //third choice stuff
      if (Choice3.equals("yes") || Choice3.equals("yes")){
         System.out.println();
         System.out.println("You Choose to go inside");
         System.out.println();
         System.out.println("This is the SHOP LIST");
         System.out.println("ID 1 - Bread");
         System.out.println("ID 2 - Salami");
         System.out.println("ID 3 - Butter");
         System.out.println();
         System.out.println("You decided to buy (insert ID if item):");
         String Shop = br.readLine();
         System.out.println(Shop);
         // this askes for item you want to buy and increments inventory
            if (Shop.equals("1")){
               String ShopItem = ("Bread");
               System.out.println("You bought " + ShopItem);
               Inventory++;
               }
            else if (Shop.equals("2")){
               String ShopItem = ("Salami");
               System.out.println("You bought " + ShopItem);
               Inventory++;
               }
            else if (Shop.equals("3")){
               String ShopItem = ("Butter");
               System.out.println("You bought " + ShopItem);
               Inventory++;
               }
            else { System.out.println("You inserted a wrong number and ended empty handed.");
               }

      }
      else if (Choice3.equals("no") || Choice3.equals("no")){
         System.out.println();
         System.out.println("You Choose to not go inside");
         System.out.println("You are a scummy person and you save every last penny");
      }
      else {
         System.out.println();
         System.out.println("There was a treasure inside and you missed it");
      }
      String Pause11 = br.readLine();
        //decision stuff
      System.out.println();
      System.out.println("Just outside of the SHOP you meet a person." +
         " What is his name(Lasse/who ever):");
      String Choice4 = br.readLine();
      System.out.println(Choice4);
      System.out.println();
      //fourth choice stuff
      if (Choice4.equals("Lasse") || Choice4.equals("lasse")){
         System.out.println();
         System.out.println("You met Lasse. A cool guy who provides prof. titles");
         System.out.println("He invites you for a BEER");
      }
      else {
         System.out.println();
         System.out.println("You met a creepy guy dont follow him!");
         System.out.println("You went to a bar and met Lasse");
      }
        String Pause5 = br.readLine();
        //decision stuff
      System.out.println();

      System.out.println("Lasse has astonished you with your first Quest");
      System.out.println("to progress further you have to success in his challenge");
      String Pause6 = br.readLine();
      System.out.println("Lasse started to shout numbers");
      System.out.println();
         //for looooooop with random math only got 1 random number
      for (int i=0; i<=5;){
         Random rand = new Random();

         int  n = rand.nextInt(22);
         System.out.print(i + " + " + n + " = ");
         String answer = br.readLine();
         int a = Integer.parseInt(answer);
         //this goes until 5 correct answers
         if (a == (i + n)){
            System.out.println("Correct answer ... your acts pleased Lasse," +
               "you can continue");
            i++;

         }
         else {
            System.out.println("You FAILED! WEAK CAUSAL LOOSER!");
         }

      System.out.println();
      }

      String Pause8 = br.readLine();
      //6th choice stuff
      System.out.println();
      System.out.println("After few minutes of walking.");
      System.out.println("You found and item on the ground. What is it?");
      System.out.print("Please name the ITEM:");
      String ItemOG = br.readLine();
      System.out.println("The item was " + ItemOG);
      System.out.println();
      Inventory++;

      //7th choice choice stuff
      System.out.println();
      System.out.println("The time past so quickly but suddenly...");
      System.out.print("You heard some noice behind you.");
      System.out.println();
      System.out.print("Would you like to check it or continue?(Check/Continue):");
      String Choice7 = br.readLine();
      System.out.println(Choice7);
      System.out.println();

      if (Choice7.equals("Check") || Choice7.equals("check")){
         System.out.println();
         System.out.println("You started looking around and you found the noice");
         System.out.println("it is your first enemy");
         System.out.println();

         //8th Choice stuff choiceseption
         System.out.print("Would you like to fight?(Yes/No)");
         String Choice8 = br.readLine();
         System.out.println(Choice8);
         System.out.println();
            if (Choice8.equals("Yes") || Choice8.equals("yes")){
               System.out.println("You chose to fight.");
               System.out.println();
               FightDesc();
               System.out.println();
               System.out.println("Would you like to you an item?(Yes/No)");
               String Fight = br.readLine();
               // and another 1
                  if (Fight.equals("yes") || Fight.equals("Yes")){
                  System.out.println();
                  System.out.println("You attacked him with everything you got.");
                  System.out.println("Items in inventory " + Inventory);
                  // starts the Fight method
                  random(br);
                  System.out.println();
                  }
                  else { System.out.println("Bravely... man should fight with fists");
                  random(br);
                  System.out.println();
                  }
               System.out.println("You won and now you can collect the fruits of your victory");
               System.out.println("You ... ACHIEVED ... THE AWESOME ITEM OF AWESOMNESS");
               Inventory++;
               }
            else if (Choice8.equals("No") || Choice8.equals("no")){
               System.out.println("You are a weakling so you turned away and ran to your mamy");
               }
            else {
               System.out.println("You chose something else ... ");
               System.out.println("You screwed up, made some noise and the enemy killed you!");
            }
      }
      else if (Choice7.equals("Continue") || Choice7.equals("continue")){
         System.out.println("You have ignored the sound and kept walking forwards");
      }
      else {
         System.out.println();
         System.out.println("You choose something else ... Aliens chose to abduct you");
         System.out.println();
      }
      // end
      String Pause9 = br.readLine();
      System.out.println();
      System.out.println("Congratz you did \"Well\"");
      System.out.println();
      System.out.print("Hero name:");
      System.out.println(name);
      System.out.println();
      System.out.print("Age:");
      System.out.println(age);
      System.out.println();
      System.out.print("Items found/collected:");
      System.out.print(Inventory);
      System.out.println();
   //using the ending method
      end();
      String Pause10 = br.readLine();

   }

}
