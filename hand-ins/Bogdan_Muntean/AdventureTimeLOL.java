import java.io.*;
import java.util.*;

public class AdventureTimeLOL
{
   public static void main(String arg[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Hello there, adventurer. Today you start a new chapter of your life! \n All you need to do is to proceed onto this road...");
      System.out.println("To start with, you will have to state your name.");
      String name = br.readLine();
      System.out.println("Age ");
      String age = br.readLine();
      System.out.println("And your awesome superpower ");
      String superpower = br.readLine();
      System.out.println(" Your name is " + name + " and you currently have " + age + " years old. But what is this power...? " + superpower);
      System.out.println("Interesting power you have there.. Would you care to describe it in a few words?");
      String response = br.readLine();
      if(response.equals("yes"))
      {
         String resp = br.readLine();
      }
      else if(response.equals("no"))
      {
         System.out.println("Well then fuck you too! :P");
      }
      System.out.println("The journey you are about to begin consists of 5 stages. \n Danger will be at every step.\n Death will be near you all the time. \n But the rewards make this journey worthwhile...");
      for(int i = 1; i <= 5; i++)
      {
         System.out.println("You have done  " + i + " steps out of " + 5);
         if(i == 1)
         {
            boolean val;
            val = step1(br);
            if(val == false)
               break;
         }
         else if(i == 2)
         {
            boolean val2;
            val2 = step2(br);
            if(val2 == false)
               break;
         }
         else if(i == 3)
         {
            int dong;
            dong = step3(br);
            if(dong == 0)
               break;
         }
         else if(i == 4)
         {
            int oky;
            oky = step4(br);
            if(oky == 0)
               break;
         }
         else
            if(i == 5)
            {
               int oke;
               oke = step5(br);
               if(oke == 0)
               {
                  System.out.println("You are fucked. Dead.");
               }
               else
               {
                  System.out.println("Congrats. You are now the new \" Count Grasp of the J \"!!!  ");
               }
            }
      }
   }
   /**
 * step1 method basically lets you chose between two paths. Left and right.
 * Since the program will end if the answer is wrong, the method is a boolean one.
 * After several lines of text the user will chose the path and then depending on the
 * answer, you can either encounter a gipsy or the Dark lord of math. Using strings and comparing them
 * with the correct answer you will be able to advance onto your path.
 * @param bReader let's you write into the cmd promt
 * @return valuestep1 gives a boolean value that indicates if the game continues or not
 */

   public static boolean step1(BufferedReader bReader) throws IOException
   {
      System.out.println("This is the path you have to follow.\n You are walking now for a while...\n But what is this?\nYou have arrived at a crossroad./n You can continue your journey to the left:\n An hostile path, unwalked and untamed, unknown and filled with pain \n or you can go to the right...\n A beaten, ordinary path.\n \n \n What will you chose?");
      String astep = bReader.readLine();
      boolean valuestep1;
      if(astep.equals("left"))
      {
         System.out.println("You encounter the dark lord of Math. He challenges you to a duel. Your only weapon will be your mind. Miss 1 answer and he will do you for good... :((");
         System.out.println("The dark lord asks you: 1+1= ");
         String resp1 = bReader.readLine();
         if(resp1.equals("2"))
         {
            System.out.println("Yay. Correct muddafucka ");
         }
         else{
            valuestep1 = false;
            System.out.println("You be dead dude.. So dead.");
            return valuestep1;
         }
         System.out.println("The dark lord asks you: 2*4= ");
         String resp2 = bReader.readLine();
         if(resp2.equals("8"))
         {
            System.out.println("Yay. Correct muddafucka ");
         }
         else{
            valuestep1 = false;
            System.out.println("You be dead dude.. So dead.");
            return valuestep1;
         }

         System.out.println("The dark lord asks you: 7+6*2/3= ");
         String resp3 = bReader.readLine();
         if(resp3.equals("11"))
         {
            System.out.println("Yay. Correct muddafucka ");
         }
         else{
            valuestep1 = false;
            System.out.println("You be dead dude.. So dead.");
            return valuestep1;
         }

      }
      else if(astep.equals("right"))
      {
         System.out.println("The path that you have taken is quiet and safe. However a gipsy appears from nothing. \n He asks you to play a game and he will reward you generously.\nWhat do you chose?\n play or skip");
         String resp10 =bReader.readLine();
         if(resp10.equals("play"))
         {
            System.out.println("You have chosen to play with the gipsy. He steals your sword and provisions and die of starvation \n Don't play with the fucking gipsy m8...");
            valuestep1 = false;
            return valuestep1;
         }
         else
         {
            System.out.println("You chose to kick the gipsy and tell him to f*** off. \n That will teach him not to play with brave adventurers like you...");
         }
      }
      valuestep1 = true;
      return valuestep1;
   }
   /**
 * step2 method provides the second step of the journey
 * You are given three choices and depending on the answer you can pick up a torch, compas or chest
 * Since the program will end if the answer is wrong, the method is a boolean one.
 * After several lines of text the user will chose the path and then depending on the
 * answer, you can either encounter a gipsy or the Dark lord of math. Using strings and comparing them
 * with the correct answer you will be able to advance onto your path.
 * @param bReads let's you write into the cmd promt
 * @return ok gives a boolean value that indicates if the game continues or not
 */
   public static boolean step2(BufferedReader bReads) throws IOException
   {
      boolean ok;
      System.out.println("Congratiulations.You are now level 2.\n After the two paths you have to enter a dark and scarry cave \n Before the entrance you can pick up one item from the following: \n A torch \n A golden chest that lacks the key with which you are supposed to open it \n A compas ");
      System.out.println("What will you choose? (torch, compas or chest)");
      String astep2 = bReads.readLine();
      if(astep2.equals("chest"))
      {
         System.out.println("The astmosphere is dark. The place is silent and you can't see where you are going... \n you can continue the journey or go back and pick up the torch you dumb ass fuck...");
         System.out.println("What will you choose?(go back or continue)");
         String bstep2 = bReads.readLine();
         if(bstep2.equals("Go back"))
         {
            System.out.println("You try to go back, but the cave collapses. \n You die... With a closed chest... Greedy bastard!");
            ok = false;
            return ok;
         }
         else
         {
            System.out.println("You manage to exit the cave... However you break your left arm because you stumble a rock and fell.");
         }

      }
      else if(astep2.equals("compas"))
      {
         System.out.println("You manage to exit the cave... However you break your right arm because you stumble a rock and fell.");
      }
      else if(astep2.equals("torch"))
      {
         System.out.println("Your path is illuminated! \n Congrats for the wise choice. \n Advancing through the cave you can see a couple of skeletons with tiny chests like the one you saw outside. \n you can now take one of them... Although you still don't have a key \n");
         System.out.println("What will you do? Trade the torch for a chest or continue the journey (continue or trade)");
         String cstep2 = bReads.readLine();
         if(cstep2.equals("continue"))
         {
            System.out.println("Congratiulations! You have passed the dark cave. \n You can continue your journey !");
         }
         else
         {
            System.out.println("Greedy bastard. You just died..");
            ok = false;
            return ok;
         }

      }
      ok = true;
      return ok;
   }
 /**
 * step3 method provides the third step of the journey
 * Here you have two options. You can write either garden or house. Through some if statements you can
 * surpass it or die if you choose to resist the spirit.
 * @param bFeds let's you write into the cmd promt
 * @return ok2 gives a integer value that indicates if the game continues or not
 */
   public static int step3(BufferedReader bFeds) throws IOException
   {
      int ok2;
      System.out.println("Wow. That's amazing. You have reached level 3 in such a short time...\n You are due to achieve great things \n Until then, you have much to learn... Much to do \n Continuing your journey through the wilderness, you see an abandoned house. \n Besides it there is a rose garden. Although it looks beautiful, the stings will tear your skin and make you bleed... ");
      System.out.println("The choice you have to make is simple. Go into the abandoned house and try to pass this obstacle, or try to cross it \n through the rose garden \n---OUCH!---");
      System.out.println("What will you do? (garden or house)");
      String astep3 = bFeds.readLine();
      if(astep3.equals("garden"))
      {
         System.out.println("When approaching the rose garden, it vanishes and the path is opened for you to safely pass. \n Good thing you chose to get a few scars when the abandoned house could have colappsed on you");
         ok2 = 1;
         return ok2;
      }
      else
      {
         System.out.println("Thing with abandonet houses is that you never know if they are really abandoned. \n When entering the house, the dor slams behind you. \n A scary spirit posses your mind. /n He requires a sacrifice. /n Will you cut a hand to exit this house?");
         System.out.println("Will you chose to cut your hand or try to resist the spirit? (Cut or resist)");
         String bstep3 = bFeds.readLine();
         if(bstep3.equals("cut"))
         {
            ok2 = 2;
            System.out.println("You have managed to escape the house. But your right arm didn't. Every adventure has it's pluses and minuses(limbs)");
            return ok2;
         }
         else
         {
            System.out.println("The spirit gets angry and kills you. You cheecky bastard");
            ok2 = 0;
            return ok2;
         }
      }
   }
    /**
 * step4 method provides the fourth step of the journey
 * This step consists of a puzzle game. You have to write the right sequence in order to
 * finish it. Every variable takes the value of a certain string relating to the next step.
 * If it is correct than you are one step closer to finishing the game
 * @param bGreds let's you write into the cmd promt
 * @return ok3 gives a integer value that indicates if the game continues or not
 */
   public static int step4(BufferedReader bGreds) throws IOException
   {
      int ok3;
      System.out.println("This is spectacular! \n Now that you have reached level 4, you will feel a slight increase in the difficulty level. \n But it shouldn't be a problem for an adventurer like you");
      System.out.println("Continuing on your path, before you stands a bridge. There are three cages near it. One contains a wolf, another  \n has a sheep and near those two cages there is a cabbage");
      System.out.println("In order to pass the bridge, you have to solve this little puzzle. \n The rules are simple. You have to pass the wolf, sheep and cabbage over the bridge \n knowing that wolf eats sheep, sheep eats cabbage \n Write down the sequance of steps that need to be made just as in the example:");
      System.out.println("Wolf = a; sheep = b; cabbage = c; moving forward will be done as follows: aF for wolf passes bridge \n aB for wolf passes the bridge back and so on...");
      System.out.println("Be careful, though. One wrong move and you are done.");
      String qstep = bGreds.readLine();
      if(!qstep.equals("bF"))
      {
         System.out.println("You are fucked..");
         ok3 = 0;
         return 0;
      }
      else
      {
         System.out.println("Correct!");
      }
      String wstep = bGreds.readLine();
      if(!wstep.equals("aF"))
      {
         System.out.println("You are fucked..");
         ok3 = 0;
         return 0;
      }
      else
      {
         System.out.println("Correct!");
      }
      String estep = bGreds.readLine();
      if(!estep.equals("bB"))
      {
         System.out.println("You are fucked..");
         ok3 = 0;
         return 0;
      }
      else
      {
         System.out.println("Correct!");
      }
      String rstep = bGreds.readLine();
      if(!rstep.equals("cF"))
      {
         System.out.println("You are fucked..");
         ok3 = 0;
         return 0;
      }
      else
      {
         System.out.println("Correct!");
      }
      String tstep =bGreds.readLine();
      if(!tstep.equals("bF"))
      {
         System.out.println("You are fucked..");
         ok3 = 0;
         return 0;
      }
      else
      {
         System.out.println("Correct!");
      }
      ok3 = 1;
      return ok3;
   }
  /**
 * step5 method provides the fifth step of the journey
 * the principle behind this game is easy. First, a random number is assigned to the variable. This will dictate how many steps will be made in the while loop.
 * then, inside the while loop there is another randomizer that will pick a number and you will have to write it.
 * @param bGreds let's you write into the cmd promt
 * @return ok4 gives a integer value that indicates if the game continues or not
 */
   public static int step5(BufferedReader bGaps) throws IOException
   {
      int ok4;
      System.out.println("You have arrived at the last stage of this adventure. \n Should you pass it? You will be named \"Count of the Grasping J\" ");
      System.out.println("To become the new count, you have to defeat the existing one. \n What you have to do is simple: \n BEAT THE SHIT OUT OF THAT COUNT!");
      System.out.println("How ? Easy. Make sure that you hit the right buttons... ");
      int randGet, ransGet;
      Random rand = new Random();
      randGet = rand.nextInt(5);
      while(randGet != 0)
      {
         randGet--;
         ransGet = rand.nextInt(6);
         String strI = Integer.toString(ransGet);
         System.out.println("Write this number: " + ransGet);
         String poststep = bGaps.readLine();
         if(!poststep.equals(strI))
         {
            System.out.println("You fucked");
            ok4 = 0;
            return ok4;
         }

      }
      ok4 = 1;
      return ok4;
   }

}
