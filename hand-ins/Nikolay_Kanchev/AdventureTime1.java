

import java.util.Scanner;
import java.util.Random;

public class AdventureTime1 {
	
	/*
	 *  Declare variable scan as private, so it doesn't leak
	 */
		
	private static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		
		scan = new Scanner(System.in);
		
		/*
		 * Info about the player
		 * nickname doesn't exist
		 * The player have to register
		 * */	
		
		write(
				"Type your nickname pls: "
				);
		
		nickName(scan.nextLine());
		
		write (
				"doesn't exist \n"
				+ "Press 't' to try again"
				);
				
		pressT(scan.nextLine());
		
		write(
				"Probably you don't have registration \n "
				+"Press 'r' to register now"
				);
				
		pressR (scan.nextLine());
		
		register();
		
		
		write(
				"Today you are going to play with me (the PC), \n"
				+ "but only if you are older than 14\n "
				+ "Are You ?\n"
				+ "Press 'y' for Yes\n "
				+ "or any other button if you are younger "
				);
		
		age(scan.nextLine());
		
		write(
				
				"Pls press 'r' to roll the dice\n"
				);
		
		/*
		 * the next method is using many other methods to: 
		 * roll the dice  for the player (5 times)
		 * prompt on the screen each of them
		 * get the average and store it to variable guestAverage
		 * 
		 * and than all this one more time when the system is playing
		 * */
		
		diceRooling();
	}
	
	public static void diceRooling (){
		
		pressR (scan.nextLine());
			
		write (" System have rolled for you 5 times\n"
			  	+  " The result is: ");
					
		double guestAverage = dice(0,0);
			
		write(
				"Press 'r' to roll the dice for the system\n"
				);
			
		pressR (scan.nextLine());
			
		write ("The systems result: ");
					
		double systemAverige = dice(0,0);
			
		compereAverige ( guestAverage, systemAverige );
			
		}	
		
	/*
	 *Prints out the variable value provided by the application
	 *@param line - the desired value that I want to print on the screen
	 */
	
	public static void write (Object line){
		System.out.println(line);
	}
	
	// @param pressedButton checks if the user is pressing 
	//the right button(t)
	
	public static void pressT (String pressedButton){
		if(!pressedButton.equals("t")){
			write(
					"Thats wrong\n You have to press 't'"
					);
			pressT(scan.nextLine());
		}else{
			write(
					"Type your nickname pls: "
					);
			
			nickName(scan.nextLine());	
			write (
					"dosn't exsist"
					);
			}
	}
	
	// @param pressedButton checks if the user is pressing 
	//the right button(r)
	
	public static void pressR (String pressedButton){
		if(!pressedButton.equals("r")){
			write(
					"Thats wrong\n You have to press 'r'"
					);
			pressR(scan.nextLine());
		}else{
			write("");			
			}
	}
	
	// @param pressedButton checks if the user is pressing 
		//the right button(y)
		
	public static void pressY (String pressedButton){
		if(pressedButton.equals("y")){
			write(					
					"Pls press 'r' to roll the dice\n"
					);
			diceRooling();
		}else{
			write(
					"GAME OVER"
					);			
			}
	}
	
	/*
	 * The player have to register.
	 * @param firstName stores the user input for the first name
	 * @param lastName stores the user input for the last name
	 * @param email stores the user input for the e-mail
	 * @param nickname stores the user input for the nickname
	 * print all the variables
	 */
	
	public static void register (){
		String firstName;
		String lastName;
		String email;
		String nickname;
		
		write(
				" Type your first name"
				);
		firstName = scan.nextLine();
		
		write(
				" Type your last name"
				);
		lastName = scan.nextLine();
		
		write(
				" Type your e-mail"
				);
		email = scan.nextLine();
		
		write(
				" Type your nickName"
			);
		nickname = scan.nextLine();
		
		write (
				"Hallo " + nickname + "\n"
			  + "Your registration was succesful \n"
			  + "Your acount information is: \n" 
			  +firstName +"\t"+ lastName +"\n" + email
				);
		
	}
	
	public static void nickName (String name){
		write(
				"The nickname : " +name
				);
	}
	
	/*
	 * @param realAge checking if the players chose is correct (y)
	 * pressing another button ends the game (the user is less than 14 years old)
	 */
	
	public static void age (String realAge ){
		while(!realAge.equals("y")){
			write (
					"You are too young to play this game"
					);
			System.exit(0);
			}
	} 
	
	/*
	 * Rolling the dice 5 times
	 * @param sum - sum the values of every single roll
	 * @param random getting the new random number
	 * @param average store the sum (value of the 5 rolls)
	 *   and divide them by 5 to get the average
	 * @param diceNumber - the value of every single roll
	 *  for - looping 5 times
	 *  return - returning the average
	 */
	
	public static double dice (double sum, double average){
		Random random = new Random();
		int diceNumber;
				
		for (int i=1; i<=5;i++){
			diceNumber = random.nextInt(6);
			sum += diceNumber;
			write(
					diceNumber
					);
		}
		average = sum / 5;
		write(
				" averige : "+average
				);
		return average;
	}
	
	/*
	 *Compare the average of the player and the system
	 *and give chance to play again
	 *@param guest get the value of guestAverige
	 *@param sys get the value of systemAverige  
	 *
	 */
			
	public static void compereAverige (double guest, double sys){
	
		 if(sys==guest){
			write(
					 "We don't have a winner\n"
				   + "We have to roll again"
				   + "Press again 'r' to roll the dice"
					);
			
			diceRooling();
		
		 }else if(sys > guest){
				write(
						"You lose!!!  \n"
						+ "Do you want to play again ? \n"
						+ "Press 'y' for Yes\n"
						+ "or any other botton if you don't want to"
						);
				pressY(scan.nextLine());
				
		}else{
			write(
					"YOU WIN !!! \n "
				  + "Do you want to play again ? \n"
				  + "If YES press 'y' \n "
				  + "If Not press anything else"
					);
			
			pressY(scan.nextLine());
			
			}
		}
}
	        
		
 



