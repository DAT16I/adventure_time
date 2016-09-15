import java.io.*;
import java.util.Random;

public class adventureGame {
   
   private static int moneyLeft = 120;
   private static boolean deadYet = false;
   private static boolean helpedGirl = false;
   
   public static void main (String args[]) throws IOException {
      
      int playerDecision;
      
      System.out.println("You are sitting at home playing video games. You're having lots of fun.");
      System.out.println("\nThe phone starts ringing. Its your friend Marco:");
      System.out.println("\"Ehhh my friend. Marco here. Haven't seen you for a while. Wanna go out and grab a drink or two?\"");
      System.out.println("\n(Type the number next to the option you wish to choose)");
      System.out.println("\n1. \"Sure let's grab a drink or two!\"");
      System.out.println("2. \"Nah.. I'm just gonna stay home and play video games.\"");
      
      if (makeChoice(2) == 2) {
         System.out.println("\nYour PC suddenly starts smoking and your monitors turn black.");
         System.out.println("Now you only have two options:\n");
         System.out.println("1. Grab a drink or two with Marco.\n2. Kill yourself.");
         
         if (makeChoice(2) == 2) {
            System.out.println("\nYou don't have the guts to kill yourself. Thought you had control of the game? Haha...");
            System.out.println("Now you only have one option:\n\n1. Accept your miserable life and have a drink or two with Marco.");
            makeChoice(1);
         }
      }
      
      System.out.println("You leave your home and heads toward the bar where Marco was last located.");
      System.out.println("On your way to the bar you pass a homeless dude selling Hus Forbi.");
      System.out.println("You have " + moneyLeft + " kr cash in your wallet. Do you...");
      System.out.println("\n1. ...buy a Hus Forbi from the homeless guy for 20 kr or...");
      System.out.println("2. ...walk strait ahead?\n");
      
      if (makeChoice(2) == 1) {
         System.out.println("You buy a Hus Forbi magazine and says \"Have a good day.\"");
         loseMoney(20);
      }
      else {
         System.out.println("You walk strait ahead speeding up a bit when passing the homeless dude.\n");
      }
      
      System.out.println("You arrive at the bar where you're supposed to meet Marco.");
      System.out.print("In one way Marco share some similarities with a snail. Both leave a trail \nbehind whereever they go. ");
      System.out.println("That's how you can see that Marco is stil at the bar. ");
      System.out.println("He's left a trail of empty bottles going into the bar but not one coming out.");
      System.out.println("\nYou enter the bar and the first thing you see is Marco throwing sirynges at ");
      System.out.println("a dart board while riding the shoulders of huge bodybuilder.");
      System.out.println("\n1. Say hi to Marco.\n2. Head to the bar and buy something to drink.\n3. Leave and head home.");
      playerDecision = makeChoice(3);
      
      switch (playerDecision) {
         case 1:
            System.out.println("\"Hey Marco!\"");
            System.out.println("\"Ehh my friend... Look, ehm. You seems so sober what's wrong? You want some drugs?\"");
            System.out.println("\n1. \"Yes, please. I was only waiting for you to ask.\"\n2. \"Nah, I'm good thank you though.\"");
            
            if (makeChoice(2) == 1) {
            
               System.out.println("The syringe that Marco gives you has been here and there in the bar. This includes the ");
               System.out.println("bucket of peanuts. Marco knows this but what he doesn't know is that you are ");
               System.out.println("allergic to peanuts.");
               System.out.println("\nIn case you were wondering:\n\n* Yes you just died.\n* And yes the game is over...");
               deadYet = true;
            }
            else {
               System.out.println("Marco wants to go outside because he wanna smoke.");
            }
            break;
         case 2:
            System.out.println("You go to the bar to check the prices. You still have " + moneyLeft + " kr left.");
            System.out.println("\"Hey there. What can I get you tonight?\" the bartender asks.");
            System.out.println("\n1. \"I'll take the fancy colorful drink to 95 kr.\"");
            System.out.println("2. \"Let me have a white Russian to 85 kr.\"");
            System.out.println("3. \"Give me a Green Tuborg to 30 kr.\"");
            playerDecision = makeChoice(3);
            
            switch (playerDecision) {
               case 1:
                  loseMoney(95);
                  break;
               case 2:
                  loseMoney(85);
                  break;
               case 3:
                  loseMoney(30);
                  break;
               default:
                  break;
            }
            
            System.out.println("Marco see you standing in the bar and comes over.");
            System.out.println("Hey brah. It's good to see you here. Come with me outside. I need a smoke.\"");
            break;
         case 3:
            System.out.println("You exit the bar bar.");
            System.out.println("Just when you try to cross the street you get hit by a bus. Apparently there's this ");
            System.out.println("dude robbed a bank and used a bus as an escape vehicle. He didn't care much about \nyou so he ran you over with the bus.");
            System.out.println("You're died. You lost the game. And the bankrobber got away. Shit happens.");
            deadYet = true;
            break;
         default:
            break;
      }
      
      if (!deadYet) {
         System.out.println("The two of you exit the bar and Marco pulls out two cigarettes for you.");
         System.out.println("\nAfter a while a woman exit the bar. On her way out she accidently steps on Marcos foot.");
         System.out.println("\n\"WHAT THE HELL ARE YOU DOING, YOU FUCKING MANIAC!?\" Marco yells throwing his cigarette after her.\n");
         System.out.println("The woman looks surprised and terrified at Marco.");
         System.out.println("\n1. You throw your own cigarette at the woman and yells \"Psycho!!\" at her.");
         System.out.println("2. You tell Marco to chill and apologizes for your friends behaviour.");
         
         if (makeChoice(2) == 1) {
            System.out.println("The woman starts crying and runs away.");
            helpedGirl = false;
         }
         else {
            System.out.println("The woman just looks at you leave without saying anything.");
            helpedGirl = true;
         }
         System.out.println("\nMarco is in a bad mood now and wants to go home. He leaves you standing by the bar."); 
         System.out.println("What a bad friend, you think to yourself as you starts to walk to the bus."); 
         System.out.println("\nYou arrive at the busstop where your bus should arrive in 15 minutes."); 
         System.out.println("25 minutess later the bus arrives. But as you are about to enter the bus you "); 
         System.out.println("can't find your bus card. You'll have to buy a ticket in order to get home. "); 
         System.out.println("You search you pocket for money. You have " + moneyLeft + " kr left."); 
         
         if (moneyLeft >= 30) {
            winGame();
         }
         else {
            System.out.println("A ticket costs 30 kr so you don't have enough money. You turn arround ");
            System.out.println("to ask the person behind you if you can have some money. ");
            System.out.print("\nThe person behind you is the girl that Marco threw his cigarette at. \n");
            
            if (helpedGirl) {
               System.out.println("\n\"Do you need money to buy a ticket?\" she asks.");
               System.out.println("\"Yes please.\" you reply and recieves 30 kr from her.");
               winGame();
            }
            else {
               System.out.println("She doesn't seem very happy to see you. You won't get any money from her.");
               System.out.println("\nYou exit the bus and sits down on a bench at the bus stop. You are about ");
               System.out.print("fall asleep and you don't fight it.\n");
               System.out.println("It is still warm after all, you think to yourself\n");
               System.out.println("But winter is coming and you freeze to death during the night. You should ");
               System.out.println("have just stayed home and played video games.");
            }
         }
      }
   }
   
   //Checks if the console input makes sense.
   public static int makeChoice(int optionAmount) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String typedInput = br.readLine();
      int resultVal = 0;
      boolean inputIsValid = false;
      
      while (!inputIsValid) {
         for (int i = 1; i <= optionAmount && !inputIsValid; i++) {
            String iVal = Integer.toString(i);
            
            if (typedInput.equals(Integer.toString(i))) {
               inputIsValid = true;
               resultVal = i;
            }
            else if (typedInput.length() > 1 && typedInput.charAt(1) == '.' && i == optionAmount) {
               inputIsValid = false;
               System.out.println("Please don't type the dot. Like really...");
            }
            else if (i == optionAmount) {
               inputIsValid = false;
               inputInvalid();
            }
            else {
               inputIsValid = false;
            }
         }
         
         if (!inputIsValid) {
            typedInput = br.readLine();
         }
      }
      
      return resultVal;
   }
   
   //Chooses randomly between annoying error messages.
   public static void inputInvalid () {
      Random r = new Random();
      int messageNumber = r.nextInt(10);
      
      switch (messageNumber) {
         case 0:  
            System.out.println("You can't type that.");
            break;
         case 1:
            System.out.println("That's an invalid input, idiot.");
            break;
         case 2:
            System.out.println("What are you trying to accomplish? Stick to the game, little shit!");
            break;
         case 3:
            System.out.println("What is this? You stupid or something?");
            break;
         case 4:
            System.out.println("You can't type that.");
            break;
         case 5:
            System.out.println("Whaat!? That's not an option? Try again.");
            break;
         case 6:
            System.out.println("Why are you even playing? This input wrong!");
            break;
         case 7:
            System.out.println("Stop the fun and type something valid.");
            break;
         case 8:
            System.out.println("Is it difficult for you to hit the right buttons? Try agian.");
            break;
         case 9:
            System.out.println("Don't try to break the game. Come on!");
            break;
         default:
            System.out.println("Invalid input message is fucked.");
            break;
      }
   }
   
   public static void loseMoney(int money) {
      moneyLeft -= money;
      System.out.println(money + " kr lost. " + moneyLeft + " kr left.\n");
   }
   
   public static void winGame() {
      System.out.println("You buy a ticket for 30 kr and take the bus home");
      System.out.println("\nYou get home and remembers that your pc is broken. You go to bed and cry yourself to sleep.");
      System.out.println("\nCongratulations!! You have just wasted a small part of your life and completed my game.");
      System.out.println("Have a nice day.");
   }
}