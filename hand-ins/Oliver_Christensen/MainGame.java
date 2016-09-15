
import java.util.Scanner;

public class MainGame
{

   public static Scanner in = new Scanner(System.in);
   public static String question;

   public static void main(String[] args)
   {

      question = "0";
      //gameloop
      while(true)
      {
         switch(question) //If question is equal to....
         {
            case "0":
               System.out.println("You wake up with a hangover the following morning. Sunlight is shining through \nthe window in the inn room you rented last night, the smell of stale ale is still fresh to your nose. The only thing you remember is that you were traveling to \nthe northern part of Anturara, through the Kingdoms of Feltrin."
               + "It's still strange how you remember that but not your own name.\n\nWhat is your name?");
               question = "1";
               break;
            case "1":
               in.next();
               question = "1A";
               break;
            case "1A":
               System.out.println("\n\nYou are still a bit groggy from the drinks, are you sure that this is your name?\n[1]Yes\n[2]No");
               question = "2";
               break;
            case "2":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\nYou stand up from your bed and begin to check yourself. Everything seems to be \nthere but you notice that your weapon is not on you. You think that you must of placed it somewhere in the room.");
                     question = "2A";
                     break;
                  case "2":
                     System.out.println("\n\n");
                     question = "0";
                     break;
               }
               break;
            case "2A":
               //user types....
               System.out.println("You search your room and find... \n\n[1]Sword and Shield \n[2]Bow and Dagger \n[3]Spell Book");
               question = "3";
               break;
            case "3":
               switch (in.next())
               {
                  case "1":
                     System.out.println("\n\nYou walk over to the dresser, where you find your trusty sword and shield. Your sword is a simple steel blade with a worn hilt, It's clear that you've used it many time before. Your shield is a well made kite shield that bares your family crest, two griffions, one white, the other red battling each other.");
                     question = "Sword1";
                     break;
                  case "2":
                     System.out.println("\n\nYou walk over to the dresser, where you find your longbow along with its quiver that contains 10 arrows and your dagger in its scabbard.");
                     question = "Bow1";
                     break;
                  case "3":
                     System.out.println("\n\nYou walk over to the dresser, where you find your old spell book sitting on top of the dresser. As you grab the book, you notice the tips of your right hand's figure are still charred from a fireball you once casted.");
                     question = "Spell1";
                     break;
               }
            case "Sword1":
               System.out.println("With your sword at your side and your shield on your back, you are ready for your journey.");
               question = "Sword2";
               break;
            case "Sword2":
               System.out.println("\n\nYou pack your things and leave the inn. You travels begins with walking along the main road, a long stone road that has been connected to many of the other settlements. You come across a spilt in the road, one is a dirt road that leads to the forest, the other is a the stone road which would lead to a large city whose name you've forgotten.\n[1]Dirt Road\n[2]Contiue on");
               question = "Sword3";
               break;
            case "Sword3":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\nYou enter the forest, it's lush green trees keep you in a good mood as you walk. After some time, you hear in the distance a women yelling \"Someone help!\", followed with someone else saying \"Shut your mouth! Ya Bitch!\"");
                     System.out.println("\nWhat will you do? \n[1]Help her \n[2]Keep walking");
                     question = "swordforest11";
                     break;
                  case "2":
                     System.out.println("After a few miles, it seems to be a quiet day. Till you see ahead of the road, a group of bandits attacking a merchant's cart. In the cart is a merchant and his son, the merchant is screaming for before one of the bandits grabs him and slits his throat. Another bandit moves to grab the child, what do you do?\n[1]Charge!\n[2]Shield Attack\n[3]Ignore it");
                     question = "swordcity11";
                     break;
               }
            case "swordforest11":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\nThe follow the voices to find two human men dressed in chainmail and an elven girl whose clothes have been partly ripped. They don't seem to have noticed you yet. What will you do? \n[1]Talk to the men \n[2]Attack \n[3]Back Away");
                     question = "swordforest12";
                     break;
                  case "2":
                     System.out.println("\n\nYou think it's best not to worry about it, You're pretty sure some guards or someone else will come by to help. So, you keep walking through the forest and spent some take eating some food that you packed. Trying not to think about the cries that continue to call for help till it goes silence and only the birds could be heard. After sometime and night begins to fall, you think about whether to keep going or set up camp in the forest. What will you do? \n[1]Set up camp \n[2]Keep walking");
                     question = "swordforest21";
                     break;
               }
            case "swordforest12":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\nYou step out into the open and say \"What are you doing to her?\", both of the men look over to you and one replies \"What's it to you!\" You stand quiet, thinking your words over but then you hear the other one say \"What are you? Some kind of knife ear lover!\"");
                     System.out.println("\n[1]\"I'm giving you a warning. Step away from her.\" \n[2]\"Get away from her!\" (Unsheath sword)");
                     question = "swordforest13";
                     break;
                  case "2":
                     System.out.println("You draw your sword and quickly grab your shield. You charge in and make a quick slash cuting the one with the dagger. Before you know it, the other pull out his greatsword and swings at you. Quick! What do you do? \n[1]Try to Parry \n[2]Try to Block \n[3]Go for a Stab");
                     question = "forestattack1";
                     break;
                  case "3":
                     System.out.println("You think to yourself that getting involved might be a bad idea and would probably cost your life. You slowly back away, making sure that there's no way they would see or hear you. Someone else will probably help her, it's best to keep moving. After sometime and night begins to fall, you think about whether to keep going or set up camp in the forest. What will you do? \n[1]Set up camp \n[2]Keep walking");
                     question = "swordforest21";
                     break;
               }
            case "swordforest13":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\n\"I'm giving you a warning. Step away from her.\" you say, laying a hand on the hilt of your sword. Both look at you and one begins to laugh \"You must have been really hit in the head to think you can warn us.\" The other one then reaches for his greatsword and looks to be ready to use it. \n[1]\"We don't have to fight.\" (offer coins) \n[2]\"So be it!\" (Attack)");
                     question = "sword forest14";
                     break;
                  case "2":
                     System.out.println("\n\n\"Get away from her!\" you yell as you pull out your sword and make a quick slash towards the one holding a dagger. You then quickly grab your shield and bash the other one causing him to stagger back.");
                     System.out.println(" Before you know it, the staggering man pulls out his greatsword and is charging towards you. Quick! What do you do? \n[1]Try to Parry \n[2]Try to Block \n[3]Go for a Stab");
                     question = "forestattack1";
                     break;
               }
            case "forestattack1":
               switch(in.next())
               {
                  case "1":
                     System.out.println("\n\nAs he brings down his greatsword, you try to swing with the same force. Trying to parry the blow. You manage to parry it but the force was stronger than your and it knocks your sword out of your hand, you quickly smack him with your shield and try to reach for your sword but the one with the dagger goes to stab you. Quick! What do you do? \n[1]Grab the sword \n[2]Defence block");
                     question = "forestattack2";
                     break;
                  case "2":
                     System.out.println("\n\nYou quickly raise your shield as he swings down. The force of the strike knocks you down to a knee and his blade appears to get stuck. You decide to drop your shield and shove your sword towards him. He failed to move out of the way and you strike his gut, as that happened you see the other one with a dagger come charging towards you. What do you do? \n[1]Parry \n[2]Jump out of the way");
                     question = "forestattack21";
                     break;
                  case "3":
                     System.out.println("\n\nYou lung forward, trying to strike the charging man's gut. While you manage to hit, his greatsword fell from his hands and hit your shield arm causing a deep cut.");
                     break;
               }
            case "swordforest21":
               switch(in.next())
               {
               }
            case "Bow1":
               System.out.println("You strap your Longbow and quiver onto your back and tie your dagger to your belt. You feel ready for the journey ahead.");
               question = "Bow2";
               break;
            case "Bow2":
               System.out.println("\n\nYou pack your things and leave the inn. You travels begins with walking along the main road, a long stone road that has been connected to many of the other settlements. You come across a spilt in the road, one is a dirt road that leads to the forest, the other is a the stone road which would lead to a large city whose name you've forgotten.\n[1]Dirt Road\n[2]Contiue on");
               question = "Bow3";
               break;
            case "Bow3":
               switch(in.next())
               {
                  case "1":

                  break;
               }
            case "Spell1":
               System.out.println("Before closing your book, you spend a moment to prepare the spells you've learn over the past few years. Once that was done, you close it up and tie it to your belt as you get ready to leave.");
               question = "Spell2";
               break;
            case "Spell2":
               System.out.println("\n\nYou pack your things and leave the inn. You travels begins with walking along the main road, a long stone road that has been connected to many of the other settlements. You come across a spilt in the road, one is a dirt road that leads to the forest, the other is a the stone road which would lead to a large city whose name you've forgotten.\n[1]Dirt Road\n[2]Contiue on");
               question = "Spell3";
               break;
            case "Spell3":
               switch(in.next())
               {
                  case "1":

                  break;
               }
         }
      }
   }
}
