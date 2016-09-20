import java.io.*;
import java.util.*;

public class AdventureTimeAssignment
{
   
   public static void main(String[] args) throws IOException
   {
      int gamble;
      int[] candies = new int[2];
      candies[0] = 0;
      candies[1] = 0;
      Random rand = new Random();
      int randGet;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      boolean heresy = false;
      int monsters;
      int answerGamble;
      int compare;
      int comparision = 0;
      String answerFighting;
      System.out.println("This is the start of a new adventure. If you manage to obtain 5 candies or more, you're qualified to live");
      System.out.println("Otherwise, you're dead");
      System.out.println("You can obtain candies by killing monsters or being lucky.");
      System.out.println("State your name!");
      String warriorName = br.readLine();
      System.out.println("Your age as well, " + warriorName + "( 1 - 100 )");
      int warriorAge = Integer.parseInt(br.readLine());
      candies = checkAge(warriorAge, candies);
      System.out.println("Your adventure should be quite simple. You will be fighting 5 monsters. Choose the right answers and you will succeed");
      System.out.println("FIGHT!");
      for(monsters = 1; monsters <= 5; monsters++)
      {
            System.out.println("You've encountered a dangerous monster! What will you do? Run or fight?");
            answerFighting = br.readLine();
            if(answerFighting.equals("run"))
            {
               System.out.println("Running is not the right answer. The monster is much faster than you and snatched one of your candies."); 
               candies = deductCandy(candies);
            } else 
              if(answerFighting.equals("fight"))
              {
                for(int i = 1; i <= monsters; i++)
                {
                   randGet = rand.nextInt(3);
                   if(randGet == 0)
                   {
                      System.out.println("It's coming at you from the right! Dodge in the opposite direction! ( Choose either left or right )");
                      answerFighting = br.readLine();
                      if(answerFighting.equals("left"))
                      {
                         niceOne();
                      } else
                      if(answerFighting.equals("right"))
                      {
                         candies = badOne(candies);
                      } else
                      {
                         heresy = true;
                         break;                        
                      }                    
                   } else
                     if(randGet == 1)
                     {
                        System.out.println("It's jumping at you! You have to dodge! ( Choose either crouch or jump )");
                        answerFighting = br.readLine();
                        if(answerFighting.equals("crouch"))
                        {
                           niceOne();
                        } else
                          if(answerFighting.equals("jump"))
                          {
                             candies = badOne(candies);
                          } else
                            {
                               heresy = true;
                               break;                        
                            }     
                     } else
                       if(randGet == 2)
                       {
                          System.out.println("It's making a swiping attack! You should dodge asap! ( Choose either fallback or defend )");
                          answerFighting = br.readLine();
                          if(answerFighting.equals("fallback"))
                          {
                             niceOne();
                          } else
                            if(answerFighting.equals("defend"))
                            {
                               candies = badOne(candies);
                            } else
                              {
                                 heresy = true;
                                 break;                        
                              }     
                       }  
                }         
              } else
                {
                   heresy = true;
                   break;
                }
         if((!answerFighting.equals("run")) && (heresy == false)) 
         {
             System.out.println("The fight is over. Here's your candy for the good work.");
             randGet = rand.nextInt(10) + 1;
             if((randGet >= 1) && (randGet <= 3))            
             {
                candies = increaseCandy(2, candies);
             } else 
               {
                  candies = increaseCandy(1, candies);
               }
         }
         if(heresy == true)
         { 
            break;
         }
      }
      if(heresy == true)
      {
         System.out.println("You did something that you shouldn't have done.");
         System.out.println("*The prince of Heresy came and purged you*. Game over");
      } else
        {
            System.out.println("After you fought all the monsters, a gambler approaches you");
            System.out.println("He won't leave until you gamble at least once");
            System.out.println(warriorName + ", do you want to gamble some of your candies? You can choose how many rounds you want ( 1 - 10 )");
            gamble = Integer.parseInt(br.readLine());
            if(( gamble >= 1) && ( gamble <= 10))
            {
              for(int index = 1; index <= gamble; index++)
              {
                 if((candies[0] - candies[1]) > 0)
                 {
                    deductCandy(candies);
                    randGet = rand.nextInt(10) + 1;
                    compare = randGet;
                    System.out.println("Number is : " + randGet + " . Choose either 1. more, 2. less, 3. same ");
                    answerGamble = Integer.parseInt(br.readLine());
                    if((answerGamble < 1) || (answerGamble > 3))
                    {
                       System.out.println("Not even among the options. You're not getting your candy back. To the next gamble!");
                    } else
                      {
                         randGet = rand.nextInt(10) + 1;
                         System.out.println("Next number is : " + randGet);
                         if(compare < randGet) 
                         {
                            comparision = 1;
                         } else
                           if(compare > randGet) 
                           {
                              comparision = 2;
                           } else
                             if(compare == randGet) 
                             {
                                comparision = 3;
                             }
                         if((comparision > answerGamble) || (comparision < answerGamble)) 
                         {
                            System.out.println("You lost the gamble!");
                         } else
                             if(comparision == answerGamble) 
                             {
                                if(answerGamble == 1)
                                {
                                   System.out.println("You won the gamble!");
                                   increaseCandy(2,candies);
                                } else
                                  if(answerGamble == 2)
                                  {
                                     System.out.println("You won the gamble!");  
                                     increaseCandy(2,candies);
                                  } else
                                    if(answerGamble == 3)
                                    {
                                       System.out.println("You won the gamble!");
                                       increaseCandy(3,candies);
                                    } 
                             }              
                      } 
                 } else
                   {
                      System.out.println("You don't have any candy to gamble with!");
                      break;
                   }   
              }
            } else
              {
                 System.out.println("You did something that you shouldn't have done.");
                 System.out.println("*The prince of Heresy came and purged you*. Game over");
                 System.exit(0);
              }
        }
      if((candies[0] - candies[1]) < 5)
      {
          System.out.println("You didn't obtain at least 5 candies by the end of your jurney. \nYou have lost. Game over. ");
      } else
        {
            System.out.println("You have obtained at least 5 candies! Congratulations!");
        }
   }
   
/**
 * Checks the age of a player and gives candy accordingly.
 * @param newWarriorAge an integer that contains the age of player
 * @param candy an array that saves your amount of candies and deducted candies
 * @return candy passes the array back
 */ 
   public static int[] checkAge(int newWarriorAge, int[] candy)
   {
      if(newWarriorAge >= 1 && newWarriorAge <= 50)
      {
         System.out.println("Quite a young one, aren't you? Here's some candy");
         candy = increaseCandy(1, candy);
      } else 
        if(newWarriorAge > 50 && newWarriorAge <= 100)
        {
           System.out.println("You're already old. No candy for you");
           noCandy(candy);
        } else
          {
             System.out.println("Not following the rules makes you lose candy!");
             deductCandy(candy);
          }  
    return candy;   
   }
/**
 * Increases candy amount
 * @param indexCandy number of candies to be added
 * @param candy an array that saves your amount of candies and deducted candies
 * @return candy passes the array back
 */
   public static int[] increaseCandy(int indexCandy, int[] candy)
   {
       candy[0] += indexCandy;
       System.out.println("You got " + indexCandy + " candy! Your current amount of candies is : " + (candy[0] - candy[1]));
       return candy;
   }
/**
 * Writes that the player didn't obtain any candy
 * @param candy an array that saves your amount of candies and deducted candies
 */
   public static void noCandy(int[] candy)
   {
       System.out.println("You didn't obtain any candy! Your current amount of candies is : " + (candy[0] - candy[1]));
   }
/**
 * Deducts 1 candy from player, if they have at least 1
 * @param candy an array that saves your amount of candies and deducted candies
 * @return candy passes the array back
 */
   public static int[] deductCandy(int[] candy)
   {
       if((candy[0] - candy[1]) > 0)
       {
          candy[1]++;
          System.out.println("You lost 1 candy! Your current amount of candies is : " + (candy[0] - candy[1]));
       } else
         {
            System.out.println("You cannot lose candy as you already have none!");
         }
       return candy;
   }
/**
 * Writes right decision after good input
 */
   public static void niceOne()
   {
      System.out.println("You made the right decision! You managed to strike back at the monster");
   }
/**
 * Writes bad decision after bad input and also deducts candy
 * @param candy an array that saves your amount of candies and deducted candies
 * @return candy passes the array back
 * @see deductCandy
 */
   public static int[] badOne(int[] candy)
   {
      Random randomise = new Random();
      int randomiseGet = randomise.nextInt(2);
      if(randomiseGet == 0)
      {
         if((candy[0] - candy[1]) > 0)
         {
            System.out.println("Bad decision! You got hit by the monster and one of your candies fell off and got crushed");
            candy = deductCandy(candy);
         } else
           {
              System.out.println("You got hit by the monster!");
           }
      } else
        {
           System.out.println("You got hit by the monster!");
        }
      return candy;
   }
}