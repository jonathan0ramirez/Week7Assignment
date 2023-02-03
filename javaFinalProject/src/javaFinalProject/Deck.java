package javaFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	
	
	//for the list of cards
	private List<Card> cards = new ArrayList<Card>();
	
	//setup an array of string for the create deck method
	private String[] name = new String[52];
	
	//constructor method
	public Deck() {
		
		createDeck();
		//with the create deck method
		int value = 2;
		
		for ( int i = 0; i < name.length; i++) {
		//we can add the suit and the name easily in the new deck and
			//create the for loop to assign it to the list cards and
			//also add the value
				 Card cards = new Card(name[i], value);
				 this.cards.add(cards);
				 value++;
				if (value == 15) {
					value = 2;
				}
		}
		}
			
	
	
private void createDeck() {
		//This creates the name and the suites for the deck
		
		String[] cardSuit = {" of Clubs \u2663\uFE0F", " of Spades\u2660", " of Hearts\u2665", " of Diamonds\u2666"};
		String[] cardFaceValue = {" Ace"," Two", " Three", " Four", " Five", " Six", " Seven", " Eight",
				" Nine", " Ten", " Jack", " Queen", " King"};
		int index = 0;
			for ( int i = 0; i < cardSuit.length; i++) {
				for ( int j = 0; j < cardFaceValue.length; j++) {
					name[index] = cardFaceValue[j] + cardSuit[i];
					index++;
				}
			}
		
	}
	//this will use the describe method in the Card class
    //for each cards in the deck
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	//a simple collections shuffle to shuffle each cards in the deck
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	//this will remove the element(0) in the deck and assign it to 
	//a variable and by returning that variable it will
	//return the value of that element
	public Card draw() {
		Card draw = this.cards.remove(0);
		return draw;
	}	
}
