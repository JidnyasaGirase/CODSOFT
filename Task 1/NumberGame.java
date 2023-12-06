package Project;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				double random = Math.random()*(100-1+1)+1;
				int random1 = (int)random;
				int guess = 0;
				System.out.println("Enter the Number of Attempts");
				char option;
				int attempts = sc.nextInt();
				int limit = 0;
				int score = 0;
				
				while(guess!=random1) {
					System.out.println("Enter the Number");
					guess = sc.nextInt();
					
					if(guess==random1) {
						System.out.println("The Guess is Correct");
		                
						score++;
						random1 = (int) (Math.random()*100);
						random1=(int)random1;
						
						
					}else if(guess>random1) {
						System.out.println("Too High");
						
						limit++;
						
					}
					else
					{
						System.out.println("Too Low");
						
						limit++;
					}
					if(limit>=attempts) {
						System.out.println("Do you want to play again? yes / no");
						option = sc.next().charAt(0);
						
						if(option == 'y')
						{
							attempts++;
						}
						else if(option=='n') {
							break;
						}
					}
				}
				
				attempts = attempts -1;
				System.out.println("You Won"+" "+score);
				System.out.println("Your Attempts"+" "+attempts);
				
				
				

			}

		


	}


