//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 7; If else statements loop
//Making a change to the CoinFlip2 so that the keeps telling you to choose heads or tails until you do
//04-1-2014

public class CoinFlip2 {
               
                public static void main(String[] args) {
                               
                                // Initialize variables
                                boolean headsWasSelected = false;
                                boolean isChoiceSelected = false;
                                boolean isHeads = false;
                                boolean isPlaying = true;
                                String userInput = "";
                                do 
                                {
                                	while (!isChoiceSelected)                                
                                	{
                                        // Prompt user to enter heads or tails
                                        SimpleIO.prompt("Enter heads or tails: ");
                                        userInput = SimpleIO.readLine();
                                               
                                                if (userInput.equalsIgnoreCase("heads"))
                                                {
                                                                headsWasSelected = true;
                                                                isChoiceSelected = true;
                                                }
                                                else if (userInput.equals("tails"))
                                                {
                                                                headsWasSelected = false;
                                                                isChoiceSelected = true;
                                                }
                                                else
                                                {
                                                                System.out.println("Sorry, you did not choose heads or tails.");
                                                }                                             
                                }
                                // Chooses a random number
                                double randomNumber = Math.random();
                               
                                if (randomNumber < 0.5)
                                {
                                                isHeads = true;
                                }
                               
                                // Determine whether user guessed correctly
                                if (headsWasSelected && isHeads)
                                {
                                                System.out.println("You win!");                                                
                                }
                                else if (!headsWasSelected && !isHeads)
                                {
                                                System.out.println("You win!");
                                }
                                else
                                {
                                                System.out.println("Sorry, you lose.");
                                }
                                
                     } while(isPlaying);
                     
                                
                }
}