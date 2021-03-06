package P3;

/* This file includes:
 * 	1. Solution to P2
 *  2. Questions for P3. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- 1-D arrays
 *  - for loops
 * 
 * Aim:
 * 	- Reduce code redundancy by the use of arrays and for loops 
 */

public class Main {				
	static Game game;			
	public static void main(String[] args) {
		String ans;
		do{							//This is the beginning of the game loop	
			//Reset the game
			game = new Game();			
			
			//REQ1: Modify the code below to replace these 6 variables with two String arrays: questions, and answers, each having 3 elements. e.g. questions[0] replaces q0, answers[0] replaces a0, etc.
			String[] question = {"What city in BC was the first McDonalds outside of US", "What is capital of Australia?", "What year was the first iPhone released?"};
			String[] answer = {"Richmond","Canberra", "2007"};			
			
			//END of REQ1
			
			//REQ2:	Add code to ask user about the number of players (from 1 to 3) - use game.askForInt. Store the input in a variable numPlayers.
			
			int numPlayers = game.askForInt("How many players?", 1, 3);
			
			//REQ3:	Modify the code below to ask for players' names and add them to the game in a for loop (up to numPlayers iterations)
			for(int i=1; i<(numPlayers+1);i++) {
				String name = game.askForText("What is player " + i + " name?");
				game.addPlayer(name);
			}
			//END of REQ3
			
			//REQ4:	Modify this part to ask questions and get answers in a for loop (up to numPlayers iterations)  
			
			for(int i = 0; i<numPlayers;i++) {
				game.setCurrentPlayer(i);
				String userAns = game.askForText(question[i]);
				if(userAns.equals(answer[i]))
					game.correct();
				else
					game.incorrect();
			}

			//END of REQ4
			
			//Do you want to play again? make sure you get valid input
			ans = game.askForText("Play again? (Y/N)"); 
			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = game.askForText("Invalid input. Play again? (Y/N)");
		}while(ans.toUpperCase().equals("Y"));	//play again if the user answers "Y" or "y"

		System.exit(1); 	//This statement terminates the program
		
	}
}
