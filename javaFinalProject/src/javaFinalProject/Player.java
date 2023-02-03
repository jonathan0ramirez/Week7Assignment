package javaFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Fields
	
	private String name;
	private List<Card> hand;
	private int score;
	private String message;
	private int turn;
	
	
	
	//Methods
	//player name getter
	public String getName() {
		return name;
	}
	//player name setter
	public void setName(String name) {
		this.name = name;
	}
	//score getter
	public int getScore() {
		return score;
	}
	//score setter
	private void setScore(int score) {
		this.score = score;
	}
	//constructor with no parameters
	public Player() {
		hand = new ArrayList<Card>();
		this.score = 0;
		
	}
	//constructor with name in the parameter
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
		this.score = 0;
	}
	
	//draw from deck and add it to the hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//this method will increment score by 1
	public void incrementScore() {
		this.score++;
	}
	
	//this is the describe method for the player that 
	//prints out the player information
	//player name, player current score and the cards on the players hand
	public void describe() {
		System.out.println(name + ": ");
        System.out.println("Score: " + this.score);
		System.out.println("Current card(s): ");
        
        for (Card card : hand) {
           card.describe();
        }
        
    }
	
	//this method removes the element(0) of the hand and assign it to
	//a variable and then returns that variable 
	public Card flip() {
		Card flip = this.hand.remove(0);
		return flip;
	}
	//just to get the Name of the hands just for printing
	public String handN() {
		String handN = this.hand.get(0).getName();
		return handN;
	} //getting value 
	public int handV() {
		int handV = this.hand.get(0).getValue();
		return handV;
	} 
	
	
	//If there's a draw
	public void draw() {
		
		for ( int i = 0; i <= 16; i++) {
			System.out.print("*");
		} System.out.println();
		System.out.println("***** DRAW! *****");
		for ( int i = 0; i <= 16; i++) {
			System.out.print("*");
		} System.out.println();
	}
	
	//for custom message
	public void turn(int turn, String win, int score1, int score2) {
		
			
		
			if (turn == 1 && score1 != score2) {
				System.out.println("\t Thats Firstblood by " + win);
			} 
			
			
			 if (turn == 2 && score1 != 0) {
				if (score1 == 2) {
					System.out.println("\t With back to back by " + win);
				} else if (score2 == 1){ 
					System.out.println("\t And the take back by " + win);
				}
		}	
			 	if (score1 == ( score2 + 3)) {
		System.out.println("\t" + win + " is on a WINNING STREAK!");
		}
			 	if (score1 == ( score2 + 5)) {
					System.out.println("\t" + win + " IS DOMINATING!");
			 	}
			 	
			 	if (score1 == (score2 + 7)) {
			 		System.out.println("\t Will " + win + " BE EVER DEFEATED?!");
			 	}
			 	if (turn == 5 && score1 != 1) {
			 		if (score1 > score2) {
			 			System.out.println("\t Another win by " + win);
			 		}
			 	}
			 	
			 	if (turn == 6) {
			 		if (score1 == score2) {
			 			System.out.println("\t It's getting intense!");
			 		} else {
			 			System.out.println("\t GoodJob! " + win);
			 		}
			 	}
			 	
			 	if (turn == 12) {
			 		if (score1 == score2) {
			 			System.out.println("\t A CLOSE FIGHT!");
			 		}
			 	}
			 	
			 	if (turn == 18) {
			 		if (score1 == score2) {
			 			System.out.println("\t A REALLY CLOSE BATTLE!");
			 		}
			 	}
			 	
			 	if (turn == 24) {
			 		if ( score1 == score2) {
			 			System.out.println("\t WHO'S GONNA WIN?!");
			 		} else if (score1 == (score2 + 1)){
			 			System.out.println("\t Will " + win + " Gonna keep his lead?!");
			 		}
			 	} 
			 	
			 	
			 	
			 	
	}
		
	
	
}
