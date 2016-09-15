import java.io.*;

public class AdventureTime {

   public static void main(String arg[]) throws IOException {
   
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      
      System.out.println("What is your name hero?");
      String heroName = br.readLine();
      System.out.println("Hello " + heroName);
      System.out.println("I see you have a companion with you, what is his name?");
      String companionName = br.readLine();
      System.out.println("How old is " + companionName + "?");
      int companionAge = Integer.parseInt(br.readLine());
      
      
      if (companionAge <=8) {
         System.out.println("Amazing! That is the perfect age for an adventure companion");
      } else {
         System.out.println("Erhm... That is a bit too old for an adventure companion he");
         System.out.println("will have to stay at home I'm afraid");
      }
      
      System.out.println("You walk down a dark path, suddenly the path splits");
      System.out.println("Do you want to go Right or Left?");
      String chosenPath = br.readLine();
      
      if (chosenPath.equals("Right")) {
         System.out.println("You walk down the right path. It's dark and scary, and spider webs are everywhere");
         System.out.println("A wolf jumps out in front of you, what do you do? Fight or Run?");
         rightPath();
      } else if (chosenPath.equals("Left")) {
         System.out.println("You walk down the left path. The sun is shining, birds are singing, ");
            System.out.println("and " + companionName + " is running around in the green grass");
         leftPath();      
      } else {
         System.out.println("Invalid choice, please try again");
      }
   
   }

   public static void leftPath() throws IOException {
   
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      
      System.out.println("Suddenly your hear a faint scream from a bush, do you go to investigate?");
      String bushDecision = br.readLine();
      
      if (bushDecision.equals("Yes")) {
         System.out.println("You go to investigate what the noise coming from the bush is");
         System.out.println("When you get there you find the noise is coming from an injured dog");
         System.out.println("Do you help it?");
         String dogDecision = br.readLine(); 
         
         if (dogDecision.equals("Yes")) {
            System.out.println("The dog has a big open wound, you treat it");
            System.out.println("saving the dogs life.");            
         } else {
            System.out.println("You choose to not help the dog, and it dies infront of you.");
         }
      
      
      } else if (bushDecision.equals("No")) {
         System.out.println("You live forever in doubt of what could have been in that bush. Game Over.");
      
      } else {
        System.out.println("Invalid choice, please write \"Yes\" or \"No\"");
      }
           
   }
   
   public static void rightPath() throws IOException {
   
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      
      String fightDecision = br.readLine();
      
      if (fightDecision.equals("Fight")) {
         System.out.println("You choose to fight the wolf.");
         System.out.println("You pick up a fallen branch from a tree. You strike the wolf over the nose, it ");
            System.out.println("gets scared and runs away.");
      } else if (fightDecision.equals("Run")) {
         System.out.println("You try to run away, but the wolf catches you and eats you alive.");
      }
      
      
   
   
   }

}