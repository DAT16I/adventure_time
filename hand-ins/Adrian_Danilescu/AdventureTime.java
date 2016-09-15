import java.io.*;
public class AdventureTime
{
   public static void main(String arg[]) throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String ages;
      System.out.println("What is your name adventurer?");
      String name= br.readLine();
      System.out.println("Hello "+name+" you have woken in a magical world where you have to type the possible choices to advance.");
      System.out.println("Your adventure starts today, even if its going to be a short one... Well you have 10 choices!\nGood luck!\nCAREFULL IF YOU TYPE A WRONG COMMAND IT WILL EITHER SKIP IT OR START FROM THE BEGINING OF THE PORTAL!\n\n");
      System.out.println("Would you like a companion?(Yes or No)");
      String comp= br.readLine();
      int cast=0;
      int k;
      int sup=0;
      String numba;
      if(comp.equals("Yes")||comp.equals("yes"))
      {
         System.out.println("Of course you want a companion you won't be able to survive on your own.");
         System.out.println("My name is Martial.How old are you my great adventurer?");
         ages=br.readLine();
      }
      else if(comp.equals("No") || comp.equals("no"))
      {
         System.out.println("I can already see you coming back to me.Also how old are you lonely adventurer?");
         ages=br.readLine();   
      }
      else
      {
         System.out.println("You typed an ILLEGAL command to move!");
      }
      System.out.println("You are in front of a portal");
      System.out.println("Type your first choice(Open the portal, Get supplies):");
      String move = br.readLine();
      if(move.equals("Get supplies") || move.equals("get supplies") || move.equals("Get Supplies") || move.equals("Get") || move.equals("get"))
      {
         k=2;
         sup=1;
         System.out.println("You just picked some supplies like chips and Coca-cola and you get out of the place you took them and continue the journey");
         move="Open the portal";
      }
      if(move.equals("Open the portal") || move.equals("open the portal") || move.equals("Open The portal") || move.equals("Open The Portal") || move.equals("open") || move.equals("Open") || move.equals("open portal") || move.equals("Open Portal"))
      {
         k=3;
         for(int i=k;i<=10;i++)
         {
            System.out.println("What now?(Move forward,Go back)");
            move=br.readLine();
            if(move.equals("Move forward") || move.equals("move forward") || move.equals("Move Forward") || move.equals("Forward") || move.equals("forward"))
            {
               System.out.println("You found a bigass tree");
               System.out.println("What now?(Go around the tree or back?)");
               move=br.readLine();
               i++;
               if(move.equals("Go around") || move.equals("Go Around") || move.equals("go around") || move.equals("go around the tree") || move.equals("Go around the tree") || move.equals("Go Around the tree") || move.equals("around") || move.equals("Around"))
               {
                  System.out.println("You have found the Dice of Life chose a number from 1 to 3:");
                  numba=br.readLine();
                  if(numba.equals("1"))
                  {  
                     if(comp.equals("Yes"))
                     {
                        System.out.println("The magic tree apeard! What do you do?(Leave your companion there or Talk with the tree?)");
                        move=br.readLine();
                        i++;
                        if(move.equals("Leave") || move.equals("Leave companion") || move.equals("leave") || move.equals("leave companion") || move.equals("Leave Companion"))
                        {
                           System.out.println("Because you left your amazing companion behind you lost 3 moves");
                           i=i+3;
                           if(i>=10)
                           {
                              System.out.println("Thats it for you, no more moves for ya");
                              break;
                           }
                        }
                        else if(move.equals("Talk") || move.equals("talk"))
                        {
                           System.out.println("You got one more move from the somehow friendly tree but he also teleported you to a random castle");
                           cast=1;
                           i=10;
                        }
                     }
                     else if(comp.equals("No"))
                     {
                        System.out.println("You got one more move from the somehow friendly tree but he also teleported you to a random castle");
                        cast=1;
                        i=10;
                     }
                  }
                  else if(numba.equals("2"))
                  {
                     System.out.println("You have found an orc, what do you do? Run or attack him?");
                     move=br.readLine();
                     i++;
                     if(move.equals("Run") || move.equals("run"))
                     {
                        System.out.println("You have found a castle! Do you go in or go back?");
                        move=br.readLine();
                        i++;
                        if(move.equals("Go in") || move.equals("go in") || move.equals("go") || move.equals("Go"))
                        {
                           cast=1;
                           k=i;
                           i=10;
                        }
                        if(move.equals("Go back") || move.equals("go back") || move.equals("Go Back"))
                        {
                           System.out.println("The orc killed you ... Why would you go back when you know he's there stuped");
                           i=10;
                        }
                     }
                     if(move.equals("Attack") || move.equals("Attack Him") || move.equals("attack him") || move.equals("attack"))
                     {
                        int h=10000;
                        System.out.println("Orc's HP: " +h);
                        System.out.println("You throw some rocks and your shirt at him and angry him even more... Oh god. Look at your hp...");
                        int p;
                        System.out.println("What now? You have left "+displayHP(100,75,h,name)+" HP\nKeep attacking or run?");
                        move=br.readLine();
                        if(move.equals("Attack") || move.equals("Attack Him") || move.equals("attack him") || move.equals("attack"))
                        {
                           System.out.println("What now? You have left "+displayHP(75,25,9989.8,name)+" HP\nKeep attacking or run?");
                           move=br.readLine();
                           if(move.equals("Attack") || move.equals("Attack Him") || move.equals("attack him") || move.equals("attack"))
                           {
                              System.out.println("Your HP "+displayHP(25,0,9971,name));
                              if(sup==1)
                                 System.out.println("The orc killed you ... Why would you fight him if you have only some chips and Coca-cola?! Jeasus man...");
                              else
                              {
                                 System.out.println("Comon you thought you can win against an orc without any weapons?");
                              }
                              i=10;
                           }
                        }
                        if(move.equals("Run") || move.equals("run"))
                        {
                           System.out.println("You have found a castle! Do you go in or go back?");
                           move=br.readLine();
                           i++;
                           if(move.equals("Go in") || move.equals("go in") || move.equals("go") || move.equals("Go"))
                           {
                              cast=1;
                              k=i;
                              i=10;
                           }
                           if(move.equals("Go back") || move.equals("go back") || move.equals("Go Back") || move.equals("back") || move.equals("Back"))
                           {
                              System.out.println("The orc killed you ... Why would you go back when you know he's there stuped");
                              move="q";
                              i=10;
                           }
                        } 
                     }
                  }
                  else if(numba.equals("3"))
                  {
                     System.out.println("You have encountered a witch and she used a spell on you leaving you with only 1 move!");
                     System.out.println("Jump in a close hole, Pray, Start crying.");
                     move=br.readLine();
                     i++;
                     if(move.equals("Jump in a close hole") || move.equals("Jump In A Close Hole") || move.equals("jump in a close hole") || move.equals("Jump") || move.equals("jump") || move.equals("Pray") || move.equals("pray") || move.equals("Start Crying") || move.equals("Start crying") || move.equals("start crying"))
                     {
                        System.out.println("Well whatever you chosed you got saved by Lasse and you have to give him a beer for this.");
                        i=10;
                     }
                  }
               }
            }
            if(move.equals("Go back") || move.equals("go back") || move.equals("Go Back") || move.equals("Back") || move.equals("back"))
            {
               System.out.println("Thats it for you cause you went back huehuehue");
               i=10;
            }
         }
         if(cast==1)
         {
            System.out.println("You got in the castle and you drink a cup of water that you have found on a fancy table(WHY?!)");
            System.out.println("You started feeling dizzy and you see someone");
            System.out.println("Do you try to shout for that person?(Yes/No)");
            move=br.readLine();
            if(move.equals("Yes") || move.equals("yes"))
            {
               System.out.println("The person started shouting if you're alright, trying to wake you up\n.\n.\n.\n.");
               System.out.println("You wake up and you get asked what are you doing in Lasse's castle");
               System.out.println("What do you say? (I don't know/Looking for gold)");
               move=br.readLine();
               if(move.equals("I don't know") || move.equals("I dont know") || move.equals("i don't know") || move.equals("i dont know"))
               {
                  System.out.println("You said you don't know and end up going out for some beers with Lasse(out of ideas)");
               }
               else
               {
                  System.out.println("Lasse tells you that in the castle is not even a coin of gold ...\n\n\n Only diamonds, but he took them already so yeh");
               }
            }
            else if(move.equals("No") || move.equals("no"))
            {
               System.out.println("You wake up in a hospital and the doctors think you might be abit crazy");
            }
         }
      }
   }
   private static int displayHP(int numb,int numba,double orc,String name)
   {
      System.out.println("Orc's HP " +(orc-10.7));
      while(numb>numba)
      {
         System.out.println(name+" HP "+numb);
         numb=numb-5;
      }
      return numba;
   }
}