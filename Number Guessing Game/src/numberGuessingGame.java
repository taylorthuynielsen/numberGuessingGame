import java.util.Scanner;

public class numberGuessingGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Pick a level - 1, 2, 3, or 4 ... 1 being the easiest and 3 being the hardest. If  you choose 4 you can customize your own game and make it as hard as you want.");
				int randomNumberMultiplier = 0;
				boolean isWrong = true;
				int counter = 0;
				int chosenLevel = userInput.nextInt();
				if (chosenLevel == 1)
					{
					 randomNumberMultiplier = 10;
						
					}
				
				else if (chosenLevel == 2)
					
					{
						
						randomNumberMultiplier = 20;
					}
						
				else if (chosenLevel == 3)
					
					{
						randomNumberMultiplier=30;
					}
				
				else if (chosenLevel == 4)
					{
						System.out.println("Type in any number larger then 30 to set your number range to guess from.");
						randomNumberMultiplier = userInput.nextInt();
					}
				
				int randomNumber = (int)(Math.random()*randomNumberMultiplier+1);
	
				
				
				do 
					{
									
							System.out.println("Pick a number between 1 and " + randomNumberMultiplier + ".");
							int guessNumber = userInput.nextInt();
							
							
							
							if (guessNumber < randomNumber)
								{
						
									System.out.println("Your number is too low"); 
									counter ++;
					
								}
					
							else if (guessNumber > randomNumber)
								{
						
									System.out.println("Your number is too high");
									counter ++;
						
								}
				
				
							else
					
								{
						
									System.out.println("You guessed the secret number.");
									isWrong = false;
									counter ++; 
									
									if (counter > randomNumberMultiplier/2)
										
										{
										
										System.out.println("It took you " + counter + " guesses to guess the secret number. That one took you a long time.");
										
										}
									
									else if (counter == 1)
										
										{
										
										System.out.println("Wow you guessed my number in " + counter + " guess. A lucky guess;)");
										
										}
									
									else if (counter < randomNumberMultiplier/2)
										
										{
										
										System.out.println("It took you " + counter + " guesses to guess the secret number. You were fast.");
										
										}
									
												
								}
				
					}
			while(isWrong);

			}

	}

